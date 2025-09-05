package sort;

import drawable.Sort;

public class CountSort extends Sort{

	public CountSort(int xOffset, int yOffset, String sortName) 
	{
		super(xOffset, yOffset , sortName);
		
	}

	
	
	public void sortFunction() 
	{
		int max = findMax(list);
        int[] count = new int[max + 1];

        // Count occurrences
        for (int num : list) {
            try {
                Thread.sleep(1); // Delay during counting
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Counting interrupted.");
                return;
            }
            count[num]++;
        }

        // Reconstruct sorted array
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i]-- > 0) {
                try {
                    Thread.sleep(1); // Delay during reconstruction
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.out.println("Reconstruction interrupted.");
                    return;
                }
                list[index++] = i;
            }
        }
		
		System.out.println("Merge sort finsinshed");
	}
	
	

	private int findMax(int[] arr) 
	{
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }
        return max;
    }
        
    
}
