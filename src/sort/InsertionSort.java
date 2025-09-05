package sort;

import drawable.Sort;

public class InsertionSort extends Sort{

	public InsertionSort(int xOffset, int yOffset, String sortName) 
	{
		super(xOffset, yOffset , sortName);
		
	}
	
	
	public void sortFunction() 
	{
		int n = list.length;

		for (int i = 1; i < n; i++) {
		    int key = list[i];
		    int j = i - 1;

		    while (j >= 0 && list[j] > key) {
		    	
		        try {
		            Thread.sleep(1); 
		        } catch (InterruptedException e) {
		            Thread.currentThread().interrupt();
		            System.out.println("Sorting interrupted.");
		            return;
		        }

		        list[j + 1] = list[j];
		        j--;
		    }

		    list[j + 1] = key;
		}

		System.out.println("Insertion sort finished");
		return;


	}

}
