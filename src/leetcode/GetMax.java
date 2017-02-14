package leetcode;

public class GetMax
{

	static int a = 0;
	public static int sum(int n)
	{
		a++;
		if (n == 0)
		{
			return 1;
		}
		else if (n == 1)
		{
			return 2;
		}
		else {
			return sum(n-1)+sum(n-2);
		}
	}
	
	public static void main(String[] args)
	{
		sum(8);
		System.out.println(a);
	}
}
