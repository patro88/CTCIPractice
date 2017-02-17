/*package proj;

import java.util.HashSet;
import java.util.Set;

public class Snippet {
	*//**
	* Automotive
	* A6e
	*
	* Automotive Repair
	* A6e R4r
	
	* Automotive Repair%Ref
	* A6e R4r%R1f
	*//*
	
	public String compress(String str){
	    StringBuffer finals = new StringBuffer();
	    compressString(str, finals, 0); 
	    return finals.toString();
	}
	
	public void compressString(String str, StringBuffer finalStr, int pos) {
	    StringBuffer subStr =new StringBuffer();
	    Character specialChar = null;
	    //Regex reg = new Regex("[A-Z]|[a-z]");
	    while(pos < str.length()) {
	        for(int i = 0; i< str.length ; i++) {
	            if(reg.match(str.charAt(i).toString())){
	                subStr.append(str.charAt(i));
	            } else{
	                finalStr.append(compressStringWithoutSpecials(subStr.toString()));
	                specialChar = str.charAt(i);
	                finalStr.append(specialChar);
	                pos = i+1;
	                break;
	            }
	        }
	        compressString(str,finalStr, pos);
	    }
	    
	    
	}
	
	public String compressStringWithoutSpecials(String str) {
	    Char first = str.charAt(0);
	    Char last = str.charAt(str.length()-1);
	     
	    Integer uniqueChars = uniqueChars(str.substring(1, str.length()-2));
	    return first.toString()+uniqueChars.toString()+last.toString;
	}
	
	public int uniqueChars(String str) {
	    Set<Char> visited = new HashSet<Char>();
	    for(int i = 0; i< str.length ; i++) {
	        Char c = str.charAt(i);
	        visited.add(c); 
	    }
	    return visited.size();
	}
}

*/