package ctci.arrayAndString;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
	
	
	public Boolean isPalindromePermutation(String str) {
		String s = str.toLowerCase();
		Map<Character, Integer> countMap = new HashMap<>();
		for(char c : s.toCharArray()) {
			if(c != ' ') {
				Integer i = countMap.get(c);
				if(i == null) countMap.put(c, 1);
				else countMap.put(c, countMap.get(c)+1);
				
			}
		}
		System.out.println(countMap);
		int	count = 0;
		for(Integer i : countMap.values()){
			
			if(i % 2 != 0) {
				if(i == 1) {
					count++;
					if(count > 1) return false;
				} else {
					return false;
				}
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
		//System.out.println(rs.isPermutationBySort("asdfa", "afdsa"));
		//System.out.println(rs.isPermutationByCount("asdaaafa", "aaafdsa"));
		System.out.println(rs.isPalindromePermutation("Taco cat").toString());
	}
}