//import static org.junit.Assert.*;
//import org.junit.Assert;
import org.junit.jupiter.api.Test;

/*
* testSelectionSort.java
*
* To change this template, choose Tools | Template Manager
* and open the template in the editor.
*/

public class testSelectionSort {
	@Test
	public void test() {
	testPositive();
	testNegative();
	testMixed();
	testDuplicates();
}
public testSelectionSort() {
}
    @Test
	public void testPositive(){
    	// TODO Auto-generated method stub
		int[] arr = new int[5];
		arr[0] = 8;
		arr[1] = 9;
		arr[2] = 7;
		arr[3] = 10;
		arr[4] = 2;
		int[] Sortedarr = new int[5];
		Sortedarr[0] = 2;
		Sortedarr[1] = 7;
		Sortedarr[2] = 8;
		Sortedarr[3] = 9;
		Sortedarr[4] = 10;
		/** add tests to check for this unit test **/
		 SelectionSort selectionSort = new SelectionSort();
	     assertArrayEquals(Sortedarr, selectionSort.basicSelectionSort(arr));
	}
    
    @Test
	public void testNegative(){
    	// TODO Auto-generated method stub
    	int[] arr = new int[5];
		arr[0] = -8;
		arr[1] = -9;
		arr[2] = -7;
		arr[3] = -10;
		arr[4] = -2;
		int[] Sortedarr = new int[5];
		Sortedarr[0] = -2;
		Sortedarr[1] = -7;
		Sortedarr[2] = -8;
		Sortedarr[3] = -9;
		Sortedarr[4] = -10;
		/** Test data contains negative values only **/
    	SelectionSort selectionSort = new SelectionSort();
	     assertArrayEquals(Sortedarr, selectionSort.basicSelectionSort(arr));
		
	}
public void testMixed(){
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		arr[0] = -8;
		arr[1] = 9;
		arr[2] = -7;
		arr[3] = 10;
		arr[4] = -2;
		int[] Sortedarr = new int[5];
		Sortedarr[0] = 2;
		Sortedarr[1] = -7;
		Sortedarr[2] = 8;
		Sortedarr[3] = -9;
		Sortedarr[4] = 10;
		/** Test data contains with both positive, negative and zeros **/
		SelectionSort selectionSort = new SelectionSort();
	     assertArrayEquals(Sortedarr, selectionSort.basicSelectionSort(arr));
		
	}
	public void testDuplicates(){
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		arr[0] = 8;
		arr[1] = 9;
		arr[2] = 8;
		arr[3] = 9;
		arr[4] = 2;
		int[] Sortedarr = new int[5];
		Sortedarr[0] = 2;
		Sortedarr[1] = 7;
		Sortedarr[2] = 8;
		Sortedarr[3] = 7;
		Sortedarr[4] = 2;
		/** Test data contains duplicates **/
		SelectionSort selectionSort = new SelectionSort();
	     assertArrayEquals(Sortedarr, selectionSort.basicSelectionSort(arr));
		
	}
	
	private void assertArrayEquals(int[] sortedarr, int[] basicSelectionSort) {
		// TODO Auto-generated method stub
	}
	
}