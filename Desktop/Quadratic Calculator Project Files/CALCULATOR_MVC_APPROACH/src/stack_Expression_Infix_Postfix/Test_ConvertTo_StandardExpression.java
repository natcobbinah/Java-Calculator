package stack_Expression_Infix_Postfix;

public class Test_ConvertTo_StandardExpression {

	public static void main(String[] args) {

		String mathExpr = "-1+2";
		System.out.println(ConvertTo_StandardExpression.standardized_Expression(mathExpr)); // 0-1+2

		String mathExpr2 = "1-(-2)";
		System.out.println(ConvertTo_StandardExpression.standardized_Expression(mathExpr2)); // 1-(0-2)

	}

}
