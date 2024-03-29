package stack_Expression_Infix_Postfix;

import stack_ADT.LinkedStack;

public class Eval_Postfix {

	private static final LinkedStack<String> stack = new LinkedStack<>();

	private static double calc(String term, double lhs_operand, double rhs_operand) {
		switch (term) {
		case "+":
			return lhs_operand + rhs_operand;
		case "-":
			return lhs_operand - rhs_operand;
		case "*":
			return lhs_operand * rhs_operand;
		case "/":
			return lhs_operand / rhs_operand;
		case "^":
			return Math.pow(lhs_operand, rhs_operand);
		default:
			return 0;
		}
	}

	public static double evalPostfix(String[] expr) {
		
		String final_result = "";
		
		for (String term : expr) {
			if (term.equals("+") || term.equals("-") || term.equals("/") || term.equals("*") || term.equals("^")) {
				String rhs_operand = stack.pop();
				String lhs_operand = stack.pop();
				double result = calc(term, Double.parseDouble(lhs_operand), Double.parseDouble(rhs_operand));
				stack.push(String.valueOf(result));
			} else {
				stack.push(term);
			}
		}
		
		 // should in case only operand with no operators are keyed as input
        if (stack.size() > 1) {
            while (!stack.isEmpty()) {
                final_result += stack.pop();
            }
            return Double.parseDouble(final_result);
        }
        else {
            return Double.parseDouble(stack.pop());
        }
	}
}
