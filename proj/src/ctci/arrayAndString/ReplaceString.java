package ctci.arrayAndString;
public class ReplaceString {
	
	char[] str;
	
	public ReplaceString(String s) { 
		str = s.toCharArray();
	}
	
	public void replaceSpaces() {
		for(int i = 0; i < str.length; i++ ){
			if(str[i] == ' ') {
				str[i++] = '%';
				str[i++] = '2';
				str[i++] = '0';
			}
		}
	}
	
	public static void main(String args[]){
		ReplaceString rs = new ReplaceString("sdkfh sdfkhsdf sdfkljs sdlfj");
		System.out.println("Before ----> " + new String(rs.str));
		rs.replaceSpaces();	
		System.out.println("After  ----> " + new String(rs.str));
	}
}