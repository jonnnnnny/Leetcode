package leetcode;

import static org.junit.Assert.*;

public class Test
{

	@org.junit.Test
	public void test()
	{
		int[] nums = {1,1,1,2,2,2,3,3,4,4,4,5,5,5};
		SingleNum137 single = new SingleNum137();
		int i = single.singleNumber(nums);
		System.out.println(i);
	}

}
