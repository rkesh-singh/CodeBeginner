//https://stackoverflow.com/questions/9942228/kadane-algorithm-negative-numbers
// https://www.youtube.com/watch?v=ohHWQf1HDfU&vl=en

public class Max_Sum_Subarray
{
	public static void main(String[] args)
	{
		int input[] = { -10, -5, -8 };
		int sum = 0, max_sum = -Integer.MAX_VALUE, max_element = -Integer.MAX_VALUE;

		for (int i = 0; i < input.length; i++)
		{
			sum = Math.max(sum + input[i], 0);
			max_sum = Math.max(sum, max_sum);
			// to handle all negative element in a array
			max_element = Math.max(max_element, input[i]);
		}

		if (max_sum == 0)
			max_sum = max_element;
		System.out.println(max_sum);
	}
}
