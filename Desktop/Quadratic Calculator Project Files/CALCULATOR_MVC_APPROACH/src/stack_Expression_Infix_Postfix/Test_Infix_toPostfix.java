package stack_Expression_Infix_Postfix;

public class Test_Infix_toPostfix {
	
	public static void main(String[] args) {
		
		String mathExpr = "( 1 + 2 ) * 3";
		//2 ^ 3 + 5 * 7 =  2 3 ^ 5 7 * + (supports PEDMAS)
		
		System.out.println(Infix_toPostfix.toPostfix(mathExpr)); // 1 2 + 3 *
		

	}
}
