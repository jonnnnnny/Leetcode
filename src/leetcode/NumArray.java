package leetcode;

public class NumArray {
	 private int[] num;
	    private int[] BTsum;
	    private int len;
	    public   NumArray(int[] nums) {
	        len = nums.length;
	        BTsum = new int[len+1];
	        num = new int[len];
	        for(int i = 0; i<len; i++){
	            update(i, nums[i]);
	        }
	    }

	   void update(int i, int val) {
	        int diff = val - num[i]; 
	        num[i++] = val;
	        while(i <= len){
	            BTsum[i] += diff;
	            i += (-i&i);
	        }
	    }
	    private  int getsum(int i){
	        int sum = 0;
	        i++;
	        while(i > 0){
	            sum += BTsum[i];
	            i -= (-i&i);
	        }
	        return sum;
	    }
	    public int sumRange(int i, int j) {
	        return getsum(j) - getsum(i-1);
	    }
	    public static void main(String[] args) {
			int[] num={1,3,5};
			NumArray numArray=new NumArray(num);
			int a= numArray.sumRange(0, 2);
			System.out.println(a);
			numArray.update(1, 2);
			for (int i : numArray.num) {
				System.out.print(i);
				
			}
			
			
		}
}
