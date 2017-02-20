package ctci.arrayAndString;
public class StringOneAway {
	
	public boolean oneAway(String str1, String str2){
		String s1, s2;
		if(str1.length() > str2.length()) {
			s1 = str1; s2=str2;
		}else {
			s1 = str2; s2=str1;
		}
		if(s1.length() - s2.length() > 1) return false;
		int count =0;
		for(int i = 0; i < s2.length() ; i++) {
			if(s1.charAt(i) != s2.charAt(i)){
				if(++count > 1) return false;
			}
		}
//		if(count == 0 && ) return false;
		return true;
	}

	
	public static void main(String[] args) {
		StringOneAway rs = new StringOneAway();
		System.out.println(rs.oneAway("pals", "pal"));
	}
}