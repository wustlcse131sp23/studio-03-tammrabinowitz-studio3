package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		//prompt user for number
		System.out.println("Enter a number");
		int num = in.nextInt();
		int[]array = new int[num - 1];

		//initializing the array
		for (int i = 0; i < array.length; i++) 
		{
			array[i] = i + 2;
		}

		//print array
		for (int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
		}

		//int[]array2 = new int[num - 1];

		for (int i = 0; i < array.length; i++)
		{
			if (array[i] != 0)
			{
				//getting rid of spots n spaces apart
				for (int x = (array [i] + i); x < array.length; x = x + array[i])
				{
					array[x] = 0;
				}
			}
		}
		for (int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
		}
		
		int n = 0; //initalize length of prime array
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] != 0)
			{
				n++;
			}
		}
		System.out.println (n);
		
		int [] prime = new int [n];
		int t = 0;
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] != 0)
			{
				prime[t] = array[i];
				t++;
			}
		}
		System.out.println();
		for (int i = 0; i < prime.length; i++)
		{
			System.out.print(prime[i] + " ");
		}
		//for (int x = 0; x < array.length; x++) {

	}
}


//}
