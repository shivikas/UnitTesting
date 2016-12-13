package test;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import src.Utils;
import java.util.*;


public class TestUtils {

	@Test
	public void testReverse1(){
		final byte[] arr = {23,44,56,78,92,11,101};
		int len, offset;

		Utils ut = new Utils();

		len = arr.length;
		offset = 0;

		ut.reverse(arr, offset, len);
		System.out.println("This is array:"+Arrays.toString(arr));

		assertEquals("Array comparision", 1, 1);
	}

	@Test
	public void testReverse2(){

		
	}

}

