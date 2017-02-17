package ctci.arrayAndString;
public class ReverseString {

	private char[] charArr;
	
	public ReverseString(String str) {
		charArr = str.toCharArray();
	}
	
	public Character[] reverse(){
		int size = charArr.length;
		Character[] charArrNew = new Character[size];
		
		for (Character ch : charArr) {
			charArrNew[--size] = ch;
		}
		return charArrNew;
	}
	
	public static void main(String[] args) {
		String s = "askderoiwy";
		ReverseString rs = new ReverseString(s);
		for(Character ch : rs.reverse()) {
			System.out.println(ch);
		}
	}
}