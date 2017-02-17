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
	
	
	public void uniqueChars(String s) {
		for(Character ch: s.toCharArray()) { 
				System.out.println("Duplicates exists");
			
		}
		
		System.out.println("No Duplicates");
	}
	
	
	public static void main(String[] args) {
		String s = "askderoiwy";
		StringUniqueCharacters suc = new StringUniqueCharacters();
		suc.uniqueCharsUsingArr(s);
		suc.uniqueChars(s);
	}
}