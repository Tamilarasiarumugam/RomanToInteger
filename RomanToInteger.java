package Basics;

public class RomanToInteger {
	
	public static int value(char ch)
	{
		if(ch=='I')
			return 1;
		if(ch=='V')
			return 5;
		if(ch=='X')
			return 10;
		if(ch=='L')
			return 50;
		if(ch=='C')
			return 100;
		if(ch=='D')
			return 500;
		if(ch=='M')
			return 1000;
		return 0;
	}
	
	public static int roman(String s)
	{
		int tot=0;
		for(int i=0;i<s.length();i++)
		{
			int s1=value(s.charAt(i));
			if(i+1<s.length())
			{
				int s2=value(s.charAt(i+1));
				if(s1>=s2)
				{
					tot+=s1;
				}
				else
					tot-=s1;
			}
			else
				tot+=s1;
			
		}
		return tot;
	}
	
	public static void main(String[] args)
	{
		String s="LVIII";
		System.out.println(roman(s));
	}

}
