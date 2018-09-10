package mainpackage;

import java.util.ArrayList;

public class Main
{
	public static void main(String[] args)
	{
		ArrayList<Integer> primes = new ArrayList<Integer>();
		primes.add(2);
		System.out.println("2");

		int test = 3;
		int length;
		boolean isprime;

		while (true)
		{
			length = primes.size();
			isprime = true;

			for (int i = 0; i < length; i++)
			{
				if (test % primes.get(i) == 0)
				{
					isprime = false;
					break;
				}
			}

			if (isprime)
			{
				primes.add(test);
				System.out.println(test);
			}
			test += 2;
		}
	}
}