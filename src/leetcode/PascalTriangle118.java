package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PascalTriangle118 {

	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result=new ArrayList<>();
		if (numRows<1) {
			return result;
		}
		if(numRows>=1){
			 List<Integer> list=new ArrayList<>();
			list.add(1);
			result.add(list);
		}
		if (numRows>=2) {
			List<Integer> list =new ArrayList<>();
			list.add(1);
			list.add(1);
			result.add(list);
		}
		if (numRows>=3) {
			
			for(int i=3;i<=numRows;i++){
				List<Integer> list =new ArrayList<>();
				list.add(1);
				for(int j=1;j<i-1;j++){
					list.add(result.get(i-2).get(j-1)+result.get(i-2).get(j));
				}
				list.add(1);
				result.add(list);
			}
		}
		return result;
		
		
	}
}
