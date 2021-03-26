package com.abc.misc;

import org.apache.commons.codec.binary.Base64;

public class EncodingdecodingStrings {

	public static void main(String[] args) {
		String str = "xxxxxx$$";
		
		byte[] encodestring=Base64.encodeBase64(str.getBytes());
		System.out.println("encoded string:"+new String(encodestring)); 
		
		byte[] decodestring=Base64.decodeBase64(encodestring);
		System.out.println("encoded string:"+new String(decodestring)); 
	}

}
