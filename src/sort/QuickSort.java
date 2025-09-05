package sort;

import drawable.Sort;

public class QuickSort extends Sort{

	public QuickSort(int xOffset, int yOffset, String sortName) 
	{
		super(xOffset, yOffset , sortName);
		
	}

	
	
	public void sortFunction() 
	{
		quickSort(0, list.length - 1);
		
		System.out.println("Quick sort finsinshed");
	}
	
	

    private void quickSort(int low, int high) {
        if (low < high) {
            int pi = partition(low, high);
            quickSort(low, pi - 1);
            quickSort(pi + 1, high);
        }
    }

    private int partition(int low, int high) {
        int pivot = list[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            
        	try {
                Thread.sleep(1); 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Sorting interrupted.");
                return low; // fallback
            }

            if (list[j] < pivot) {
                i++;
                int temp = list[i]; list[i] = list[j]; list[j] = temp;
            }
        }

        int temp = list[i + 1]; list[i + 1] = list[high]; list[high] = temp;
        return i + 1;
    }
}
