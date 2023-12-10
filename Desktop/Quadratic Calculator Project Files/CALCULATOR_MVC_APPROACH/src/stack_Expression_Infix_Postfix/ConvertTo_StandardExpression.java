package stack_Expression_Infix_Postfix;

public class ConvertTo_StandardExpression {

	public static String standardized_Expression(String math_expression) {
		String standard_expr = "";
		int i = 0;

		String[] arithmetic_expr = math_expression.split("");

		while (i < arithmetic_expr.length) {
			if (arithmetic_expr[i].equals("+") || arithmetic_expr[i].equals("-")) {
				if (i == 0 || arithmetic_expr[i - 1].equals("(")) {
					standard_expr += "0";
				}
			}
			standard_expr += arithmetic_expr[i];
			i += 1;
		}
		return standard_expr;

	}
}
