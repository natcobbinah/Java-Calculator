package stack_Expression_Infix_Postfix;

import java.util.stream.Stream;

public class Test_Tokenizer {

	public static void main(String[] args) {

		String mathExpr = "( 1 + 2 ) * 3";
		
		System.out.println(TokenizeExpression.removeAllWhiteSpaces(mathExpr));
		
		String[] tokenizedExpr = TokenizeExpression.tokenize(mathExpr);
		Stream.of(tokenizedExpr).forEach(val -> System.out.print(val));
	
	}

}
