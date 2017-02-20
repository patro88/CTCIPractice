package ctci.arrayAndString;

public class CompressedString {
	
	String str;
	
	public CompressedString(String s) { 
		str = s;
	}
	
	public String compress() {
		StringBuilder strb = new StringBuilder("");
		int i=0, j=1, count= 1;
		while(j < str.length()) {
			if(str.charAt(i) == str.charAt(j) ) {
				count++;
				j++;
			}
			else {
				strb.append(str.charAt(i)).append(count);
				i=j;
				j++;
				count = 1;
			}
		}
		strb.append(str.charAt(i)).append(count);
		if(strb.length() == str.length()*2) return str;
		else return strb.toString();
	}
	
	public static void main(String args[]){
		CompressedString rs = new CompressedString("ssddffee");
		System.out.println("Before ----> " + rs.str);
		System.out.println("After  ----> " + rs.compress());
	}
}
