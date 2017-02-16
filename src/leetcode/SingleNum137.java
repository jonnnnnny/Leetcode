package leetcode;

import java.util.Arrays;

public class SingleNum137
{

	public int singleNumber(int[] nums)
	{
		Arrays.sort(nums);
		int number = 0;  
        boolean flag = true;  
        for(int i = 0 ; i<nums.length-2 ; i++){  
            if(nums[i] == nums[i+1] && nums[i+1] == nums[i+2]){  
                i+=2;  
            }else{  
                if(nums[i]==nums[i+1]){  
                    number = i + 1;  
                }else{  
                    number = i;  
                }  
                flag=false;  
                break;  
            }  
        }  
        if(flag){  
            number = nums.length-1;  
        }  
        return nums[number];  
	}
	
	public int singleNum(int[] nums)
	{
		int result =0;
		for(int i=0;i<32;i++)
		{
			int sum=0;
			for (int j = 0; j < nums.length; j++)
			{
				if ((nums[j]>>i & 1) !=0)
				{
					sum++;
				}
			}
			sum%=3;
			result |= sum<<i;
		}
		return result;
	}
	
	public static void main(String[] args)
	{
		int[] nums = {1,1,1,2,2,2,3,3,4,4,4,5,5,5};
		SingleNum137 single = new SingleNum137();
		int i = single.singleNumber(nums);
		System.out.println(i);
	}
}
