package stack_Expression_Infix_Postfix;

public class Test_EvalPostfix {

	public static void main(String[] args) {
		
		String mathExpr = "( 1 + 2 ) * 3";

		String[] postfix_expr = Infix_toPostfix.toPostfix(mathExpr); // 1 2 + 3 *
		
		double evaluatedResult = Eval_Postfix.evalPostfix(postfix_expr); //9
		
		System.out.println("Output = " + evaluatedResult);
		
		String mathExpr2 = "22 + 33 + 66/3";
		System.out.println(Eval_Postfix.evalPostfix(Infix_toPostfix.toPostfix(mathExpr2)));

	}

}
