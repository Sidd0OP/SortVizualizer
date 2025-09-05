package sort;

import drawable.Sort;

public class SelectionSort extends Sort{

	public SelectionSort(int xOffset, int yOffset, String sortName) 
	{
		super(xOffset, yOffset , sortName);
		
	}
	
	
	public void sortFunction() 
	{
		int n = list.length;

		for (int i = 0; i < n - 1; i++) 
		{
		    int minIndex = i;

		    for (int j = i + 1; j < n; j++) 
		    {
		        try {
		            Thread.sleep(1); 
		        } catch (InterruptedException e) {
		            Thread.currentThread().interrupt();
		            System.out.println("Sorting interrupted.");
		            return;
		        }

		        if (list[j] < list[minIndex]) {
		            minIndex = j;
		        }
		    }

		    // Swap the found minimum element with the first unsorted element
		    if (minIndex != i) {
		        int temp = list[i];
		        list[i] = list[minIndex];
		        list[minIndex] = temp;
		    }
		}

		System.out.println("Selection sort finished");
		return;

	}

}
