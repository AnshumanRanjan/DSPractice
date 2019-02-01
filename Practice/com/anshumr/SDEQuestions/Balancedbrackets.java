package com.anshumr.SDEQuestions;

/*
1+ 1)*2 the function would return false (i.e. unbalanced)
1 + (3 + 3)*2 would return true (i.e. balanced) 
*/	
		
public class Balancedbrackets {

	
	public boolean balancebracketsmatch(String s)
	{
		int numberofBrackets = 0;
		for (int i =0 ; i< s.length() ; i++ )
		{
			char text =  s.charAt(i);
			if(numberofBrackets == 0 && text == ')')
			{
				return false;
			}
			switch (text) {
			case '(' :
				numberofBrackets++;
				break;
			case ')':
				numberofBrackets--;
				if(numberofBrackets < 0)
				{return false;}
			}
			
		}
		return (numberofBrackets ==0 );
	}
	public static  void main(String args[])
	{
		String  test1 = new String("1+ 1)*2");
		String  test2 = new String("1 + (3 + 3)*2");
		Balancedbrackets abc = new Balancedbrackets();
		System.out.println(abc.balancebracketsmatch(test2));
	}
	
}
