package ctci.arrayAndString;
public class ReplaceString {
	
	
	public String replaceSpaces(String str, int length) {
		int countSpaces = 0;
		for (int i = 0; i < length; i++) {
			if(str.charAt(i) == ' ') {
				countSpaces++;
			}
		}
		if(countSpaces == 0) return str;
		
		char[] newStr = new char[length+(countSpaces*3)]; 
		for(int i = 0, j=0; i < length; i++ ){
			
			if(str.charAt(i) == ' ') {
				newStr[j++] = '%';
				newStr[j++] = '2';
				newStr[j++] = '0';
			} else {
				newStr[j++] = str.charAt(i);
			}
		}
		return new String(newStr);
	}
	
	public static void main(String args[]){
		String str = "sdkfh sdfkhsdf sdfkljs sdlfj      ";
		ReplaceString rs = new ReplaceString();
		System.out.println("Before ----> " + new String(str));
		str = rs.replaceSpaces(str, 28);	
		System.out.println("After  ----> " + new String(str));
	}
}