package src;

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

}