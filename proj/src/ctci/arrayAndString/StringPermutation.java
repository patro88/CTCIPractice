package ctci.arrayAndString;

import java.util.Arrays;

public class StringPermutation {
	
	public boolean isPermutationBySort(String s1, String s2){
		if(s1.length() != s2.length()) {
			return false;
		} else {
			return sort(s1).equals(sort(s2));
		}
	}
	
	public boolean isPermutationByCount(String s1, String s2){
		if(s1.length() != s2.length()) {
			return false;
		} 
		int[] times = new int[256];
		for(char ch : s1.toCharArray()) { 
			times[ch]++;
		}
		
		for(char ch : s2.toCharArray()) { 
			if(times[ch]-- < 0) {
				return false;
			}
		}
		return true;
	}
	
	public String sort(String s) { 
		char[] ch = s.toCharArray();
		Arrays.sort(ch);
		return new String(ch);
	}
	
	public static void main(String[] args) {
		StringPermutation rs = new StringPermutation();
		System.out.println(rs.isPermutationBySort("asdfa", "afdsa"));
		System.out.println(rs.isPermutationByCount("asdfa", "afdsa"));
	}
}