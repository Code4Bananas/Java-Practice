
public class Assignment3 {
	public static void main(String[] args)
	{
		String s1 = "abc";
		String s2 = new String("abc");
		
		if(s1.contentEquals(s2))
		{
			System.out.println("The strings are equal");
		}
		else
		{
			System.out.println("The strings are not equal");
		}
	}
}
