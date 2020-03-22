package tddjunit;

public class Remove_A_atFirst2Char {
	public String delete_A(String string)
	{
		String result = new String();
		char a,b;
		a = string.charAt(0);
		b = string.charAt(1);
		if(a == 'A' && b == 'A')
		{
			result = string.substring(2);
		}
		else if (a == 'A'){
		    result = b+string.substring(2);
		}
		else if(b == 'A')
		{
			result = a+string.substring(2);;
		}
		else
			result = string;
	     return result;
	}
}
