package ctci.arrayAndString;
public class StringUniqueCharacters {
	
	public void uniqueCharsUsingArr(String s) {
		Integer [] c = new Integer[122];
		for(Character ch: s.toCharArray()) { 
			Integer in = c[(int)ch];
			if(in == null) {
				c[ch] = 1;
			} else if(in ==1) {
				System.out.println("Duplicates exists");
				return;
			}
		}
		
		System.out.println("No Duplicates");
	}
	
	
	public boolean isStringUnique(String s) {
		if(s.length() == 1) return true;
		String first = s.substring(0,1);
		String rest = s.substring(1);
		if(rest.contains(first)) return false;
		else return isStringUnique(rest);
	}
	
	
	public static void main(String[] args) {
		String s = "qweiutyfsfdgp";
		StringUniqueCharacters suc = new StringUniqueCharacters();
		//suc.uniqueCharsUsingArr(s);
		if(suc.isStringUnique(s)) System.out.println("No Duplicates");
		else System.out.println("Duplicates exists");
	}
}