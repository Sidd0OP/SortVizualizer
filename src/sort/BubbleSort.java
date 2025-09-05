package sort;

import drawable.Sort;

public class BubbleSort extends Sort{

	public BubbleSort(int xOffset, int yOffset , String sortName) 
	{
		super(xOffset, yOffset, sortName);
		
	}

	
	
	public void sortFunction() 
	{
		int n = list.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) 
        {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
            	
            	
                try {
                    Thread.sleep(1); 
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.out.println("Sorting interrupted.");
                    return;
                }

                if (list[j] > list[j + 1]) {
                    
                	int temp = list[j];
                	list[j] = list[j + 1];
                	list[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) break;
        }
        
        
        System.out.println("Bubble sort finished");
        return;
	}
}
