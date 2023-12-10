package stack_Expression_Infix_Postfix;

public class TokenizeExpression {
	
	public static String[] tokenize(String expression) {
		String regex = "(?<=op)|(?=op)".replace("op", "[-+*/()]"); //regex code to split from stackoverflow
		return expression.split(regex);
    }

    public static String[] splitByWhiteSpaces(String expression){
        return expression.split("\\s+");
    }
    
    public static String removeAllWhiteSpaces(String expression) {
    	return expression.replaceAll("\\s+", "");
    }

}
