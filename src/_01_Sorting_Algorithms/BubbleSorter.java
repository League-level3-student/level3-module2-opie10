package _01_Sorting_Algorithms;

public class BubbleSorter extends Sorter{
    public BubbleSorter() {
        type = "Bubble";
    }

    /* 
     * Use the bubble sorting algorithm to sort the array.
     * You can use display.updateDisplay() to show the current
     * progress on the graph.
     */
    @Override
    void sort(int[] arr, SortingVisualizer display) {
    	
    	for (int j =0; j< arr.length ; j++) {
			
		
    for (int i =arr.length-1; i >j; i--) {
    	if(arr[i]<arr[i-1]) {
    		int temp = arr[i];
    		arr[i]= arr[i-1];
    		arr[i-1]=temp;
    		
    	}
    	
    	
    }
    display.updateDisplay();
    	}
    }
}