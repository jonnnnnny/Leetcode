package leetcode;

public class ToHex {
	public static String toHex(int num) {
		char[] map={'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
		if (num==0) {
			return "0";
		}
		StringBuilder sb=new StringBuilder();
		while(num!=0){
			sb.append(map[(num&15)]);
			num=num>>>4;
		}
		sb.reverse();
		return sb.toString();
		
	}

}
