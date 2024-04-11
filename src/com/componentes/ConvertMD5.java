package com.componentes;
import java.security.*;
import java.math.BigInteger;

public class ConvertMD5 {
	public static String getMD5hash(String input) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] messageDigest = md.digest(input.getBytes());
			BigInteger no = new BigInteger(1,messageDigest);
			
			String hashText = no.toString(16);
			while(hashText.length() < 32) {
				hashText = "0" + hashText;
			}
			
			return hashText;
			
		}catch(NoSuchAlgorithmException e) {
			throw new RuntimeException(e);
		}
	
	}
}
