package src;
import java.security.MessageDigest;
import java.util.*;
import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.io.*;

public class Utils {
	
	public static void reverse(final byte[] array, int offset, int len){
		final int lastIndex = len-1;
		int i, j; 

		for(i=offset,j=offset+lastIndex; i<j; ++i,--j){
			final byte tmp = array[i];
			array[i] = array[j];
			array[j] = tmp;
		}

		if(len%2==1){
			array[i] = array[i];
		}

	}


	public static void reverseComplement(final byte[] bases, int offset, int len){
		final int lastIndex = len-1;
		int i,j;

		for(i=offset, j=offset+lastIndex; i<j; ++i, --j){
			final byte tmp = complement(bases[i]);
			bases[i] = complement(bases[j]);
			bases[j] = tmp;
		}

		if(len%2 == 1){
			bases[i] = complement(bases[i]);
		}
		
	}


	public static final byte a='a', c='c', g='g', t='t', n='n', A='A', C='C', G='G', T='T', N='N';


	public static byte complement(final byte b){
		switch(b) {
			case a:
				return t;

			case c:
				return g;

			case t:
				return a;

			case g:
				return c;

			case A:
				return T;

			case C:
				return G;

			case T:
				return A;

			case G:
				return C;

			default:
				return b;

		}

	}


	public static final byte upperCase(byte base){
		return base >= 'a' ? (byte)(base - ('a'-'A')) : base;

	}


	public static final byte[] upperCase(byte[] bases){
		for(int i=0; i<bases.length; i++)
			bases[i] = upperCase(bases[i]);
		
		return bases;

	}

	public static String calculateMD5String(byte[] data){
		return calculateMD5String(data, 0, data.length);

	}

	public static String calculateMD5String(byte[] data, int offset, int len){
		byte[] digest = calculateMD5(data, offset, len);
		return String.format("%032x", new BigInteger(1, digest));

	}

	public static byte[] calculateMD5(byte[] data, int offset, int len){
		MessageDigest md5_MessageDigest;

		try{
			md5_MessageDigest = MessageDigest.getInstance("MD5");
			md5_MessageDigest.reset();

			md5_MessageDigest.update(data, offset, len);
			return md5_MessageDigest.digest();
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException(e);
		}
	}
		
	
}