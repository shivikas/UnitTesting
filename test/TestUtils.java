package test;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import src.Utils;
import java.util.*;


public class TestUtils {

	@Test
	public void testReverseByteArray(){
		
		final byte[] arr = {23,44,56,78,92,11,101};
		int len, offset;
		len = arr.length;
		offset = 0;

		Utils ut = new Utils();
		
		final byte[] expectedArr = {101,11,92,78,56,44,23};
		
		ut.reverse(arr, offset, len);
		//System.out.println("This is array:"+Arrays.toString(arr));

		assertTrue("Actual reversed array is different from Expected Array",Arrays.equals(expectedArr, arr));

	}

	
	@Test
	public void testReverseByteArrayError(){

		final byte[] arr = {23,44,56,78,92,11,101};
		int len, offset;
		len = arr.length;
		offset = 0;

		Utils ut = new Utils();
		
		final byte[] expectedArr = {101,11,92,78,56,44,23,6};  //Wrong array
		
		ut.reverse(arr, offset, len);
		//System.out.println("This is array:"+Arrays.toString(arr));

		assertFalse("Reverse array is supposed to be different from expected array.",Arrays.equals(expectedArr, arr));
	
	}

	
	@Test
	public void testReverseWithNoLength(){

		final byte[] arr = {'a','c','t','g','n','c','t','t','g','n','a','c','t','g'};
		int len, offset;
		len = 0;
		offset = 0;

		Utils ut = new Utils();
		
		final byte[] expectedArr = {}; 
		
		ut.reverse(arr, offset, len);
		System.out.println("This is array:"+Arrays.toString(arr));

		assertTrue("Length provided is 0.",Arrays.equals(expectedArr, arr));
	
	}

	@Ignore("not ready yet")
	@Test
	public void testReverse4(){

		System.out.println("when length is -ve");

	}

	@Ignore("not ready yet")
	@Test
	public void testReverse5(){

		System.out.println("when empty array is passed");

	}

	@Ignore("not ready yet")
	@Test
	public void testReverse6(){

		System.out.println("when array with 1 element is passed");

	}

	@Ignore("not ready yet")
	@Test
	public void testReverse7(){

		System.out.println("when array with null pointer is passed");

	}

	@Ignore("not ready yet")
	@Test
	public void testReverse8(){

		System.out.println("when array is shorter than the length passed");

	}


}

