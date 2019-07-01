package cs143;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>(5);


		String input = "{()}";
		String leftBrackets = "[{(";
		String rightBrackets = "]})";
		
		if(balanced(input,leftBrackets,rightBrackets))
		{
			System.out.println("Balanced");
		}
		else
		{
			System.out.println("Unbalanced");
		}
	}
	
	
	public static boolean balanced(String checkBalanced, String leftBrackets, String rightBrackets )
	{
		return false;
	}

}
