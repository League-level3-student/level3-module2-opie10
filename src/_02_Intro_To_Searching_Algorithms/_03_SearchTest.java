package _02_Intro_To_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _03_SearchTest {

    /*
     *  A minimum of 3 tests are required for each method
     */

    @Test
    public void testLinearSearch() {
    	String[] arr1 = {"freestyle","backstroke","butterfly","breastroke","IM"};
        String[] arr2 = {"red","blue","green", "brown","purple","black"};
        String[] arr3 = {"dogs","cats", "lizards","hamsters"};
       
        // 1. Use the assertEquals() method to test your linear search method
        
        assertEquals(_01_LinearSearch.linearSearch(arr1,"IM" ),4);
        assertEquals(_01_LinearSearch.linearSearch(arr2,"augie" ),-1);
        assertEquals(_01_LinearSearch.linearSearch(arr3,"cats" ),1);
    }

    @Test
    public void testBinarySearch() {
    	int[] arr1 = {1,3,8,9,16,36,74};
        int[] arr2 = {5,8,100,150,270};
        int[] arr3 = {7,9,10,180,230,700};
        assertEquals(0,_02_BinarySearch.binarySearch(arr1,0,arr1.length-1,1));
        assertEquals(-1,_02_BinarySearch.binarySearch(arr2,0,arr2.length-1,3));
        assertEquals(3,_02_BinarySearch.binarySearch(arr3,0,arr3.length-1,180));
        // 2. Use the assertEquals() method to test your binary search method
        //    remember that the array must be sorted
        
    }
}
