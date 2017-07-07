package com.javaex.problem05;

public class StringUtil {
    
    public static String concatString(String[] str){
    	String result = "";
    	
        //메소드 내용작성
    	for(int i = 0; i<str.length; i++) {
    		result += str[i];
    	}
        
    	
    	return result;
    }

}
