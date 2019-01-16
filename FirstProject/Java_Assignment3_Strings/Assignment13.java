
public class Assignment13 {

	public static void main(String[] args)
	{
		String str1 = "angel";
		String str2 = "angel";
		
		for(int i = 0; i < str1.length(); i++)
		{
			if(str1.indexOf(i) != (str2.indexOf(i)))
			{
				System.out.println("The strings are not anagrams");
			}
		}
	}
}
