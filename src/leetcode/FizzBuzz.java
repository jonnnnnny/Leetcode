package leetcode;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.JInternalFrame;

public class FizzBuzz {
	public static List<String> fizzBuzz(int n) {
		List<String> list=new ArrayList<>();
		list.add("fizz");
		list.add(0, "Buzz");
		return list;
		
		
	}

	public static void main(String[] args) {
		System.out.println(fizzBuzz(1));
		Map<Integer, Integer> map= new HashMap<>();
		map.put(1, 1);
		map.containsKey(1);
		System.out.println(map.containsKey(1)+" "+ map.containsKey(2));
		if (map.containsKey(1)) {
			map.replace(1, 2);
		}
		System.out.println(map.get(1));
		Set<Integer> key=map.keySet();
		System.out.println();
		int i=1;

		int j=8;
		System.out.println(i^j);
		
		
	}
}
