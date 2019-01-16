package program;

public class Assignment7 {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for(int j = 0; j < arr.length; j++)
		{
			for(int k = 1; k <= 10; k++)
			{
				System.out.println(arr[j]*k);
			}
		}
	}
}
