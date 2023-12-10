package stack_Expression_Infix_Postfix;

import stack_ADT.LinkedStack;

public class Infix_toPostfix {
	private static final LinkedStack<String> stack = new LinkedStack<>();
	private static final String SPACE = " "; // space is used to separate each operator or operand in final expr

	private static int rank(String term) {
		switch (term) {
		case "^":
			return 3;
		case "*":
		case "/":
			return 2;
		case "+":
		case "-":
			return 1;
		case "(":
			return 0;
		default:
			return -1;
		}
	}

	public static String[] toPostfix(String math_expression) {
		String postfix_expr = "";
		
		//remove all whitespaces from string
        math_expression = TokenizeExpression.removeAllWhiteSpaces(math_expression);

        String cleanedExpression = ConvertTo_StandardExpression.standardized_Expression(math_expression);
        String[] tokenizedExpression = TokenizeExpression.tokenize(cleanedExpression);

		for (String term : tokenizedExpression) { // split by spaces
			if (rank(term) == 0) {
				stack.push(term);
			} else if (term.equals(")")) {
				while (!stack.isEmpty() && rank(stack.peek()) > 0) {
					postfix_expr += SPACE;
					postfix_expr += stack.pop();
				}
				stack.pop();
			} else if (rank(term) > 0) {
				while (!stack.isEmpty() && rank(stack.peek()) >= rank(term)) {
					postfix_expr += SPACE;
					postfix_expr += stack.pop();
				}
				stack.push(term);
			} else {
				postfix_expr += SPACE;
				postfix_expr += term;
			}
		}

		// add any remaining operator on stack to postfix_expr
		while (!stack.isEmpty()) {
			postfix_expr += SPACE;
			postfix_expr += stack.pop();
		}

		return TokenizeExpression.splitByWhiteSpaces(postfix_expr);
	}
}
