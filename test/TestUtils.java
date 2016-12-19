package test;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import static org.junit.Assert.*;
import src.Utils;
import java.util.*;


public class TestUtils {

	@Rule
		public ExpectedException thrown = ExpectedException.none();

	
	@Test
	public void test_1_ReverseByteArray(){
		
		final byte[] arr = {'a','c','b','t','n','g'};
		int offset = 0;
		int len = 6;
		
		//Utils ut = new Utils();
		
		final byte[] expectedArr = {'g','n','t','b','c','a'};
		
		Utils.reverse(arr, offset, len);
		assertTrue("Actual reversed array is different from Expected Array",Arrays.equals(expectedArr, arr));

	}

	@Test
	public void test_2_ReverseOffsetNonZero(){
		
		final byte[] arr = {'a','c','b','t','n','g', 'A','t','c','T','G'};
		int offset = 3;
		int len = 6;
		
		final byte[] expectedArr = {'a','c','b','c','t','A','g','n','t','T','G'};
		System.out.println("Printing array before calling reverse function"+Arrays.toString(arr));
		Utils.reverse(arr, offset, len);
		System.out.println("Printing array After calling reverse function"+Arrays.toString(arr));
		assertTrue("Wrong Array Reversal",Arrays.equals(expectedArr, arr));

	}
	
	@Test
	public void testReverseByteArrayError(){

		final byte[] arr = {'a','t','c','n','g','g','t','c','a','t'};
		int len = 10;
		int offset = 0;

		Utils ut = new Utils();
		
		final byte[] expectedArr = {'t','a','c','t','g','a','n','c','t','g'};  //Wrong array
		
		ut.reverse(arr, offset, len);
		
		assertFalse("Reverse array is supposed to be different from expected array.",Arrays.equals(expectedArr, arr));
	
	}

	
	@Test
	public void testReverseWithZeroLength(){

		final byte[] arr = {'a','c','t','g','n','c','t','t','g','n','a','c','t','g'};
		int len = 0;
		int	offset = 0;

		Utils ut = new Utils();
		
		//With (len=0) the expected array will be same as an actual array passed.
		final byte[] expectedArr = {'a','c','t','g','n','c','t','t','g','n','a','c','t','g'}; 

		ut.reverse(arr, offset, len);
		//System.out.println("Printing array before calling reverse function"+Arrays.toString(arr));
		assertTrue("Expected Array is not same as passed array.",Arrays.equals(expectedArr, arr));
	
	}

	@Ignore
	@Test
	public void testReverseWhenArrayShorterThenLen(){
		thrown.expect(ArrayIndexOutOfBoundsException.class);
		thrown.expectMessage("Actual array length is 5. But array length passes is 6");
		
		final byte[] arr = {'a', 'c', 'g', 't', 'n'};
		int len = 6;
		int offset = 0;
		Utils ut = new Utils();
		//System.out.println("Printing array before calling reverse function"+Arrays.toString(arr));
		ut.reverse(arr, offset, len);
		thrown.expect(ArrayIndexOutOfBoundsException.class);
		thrown.expectMessage("Actual array length is 5. But array length passes is 6");
		
	}

	@Ignore
	@Test
	public void testReverseWithNegLength(){

		final byte[] arr = {'a', 'c', 'g', 't', 'n'};
		int len = 6;
		int offset = 0;

		Utils ut = new Utils();

		final byte[] expectedArr = {};
		System.out.println("Printing array before calling reverse function"+Arrays.toString(arr));
		ut.reverse(arr, offset, len);
		System.out.println("This is with len=-3 array:"+Arrays.toString(arr));
		assertTrue("You are passing a -ve length",Arrays.equals(expectedArr, arr));

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

