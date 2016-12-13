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

		System.out.println("when offset value is -ve");

	}

	@Test
	public void testReverse3(){

		System.out.println("when length is 0");

	}

	@Test
	public void testReverse4(){

		System.out.println("when length is -ve");

	}

	@Test
	public void testReverse5(){

		System.out.println("when empty array is passed");

	}

	@Test
	public void testReverse6(){

		System.out.println("when array with 1 element is passed");

	}

	@Test
	public void testReverse7(){

		System.out.println("when array with null pointer is passed");

	}

	@Test
	public void testReverse8(){

		System.out.println("when array is shorter than the length passed");

	}


}

