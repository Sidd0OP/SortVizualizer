package sort;

import drawable.Sort;

public class MergeSort extends Sort{

	public MergeSort(int xOffset, int yOffset, String sortName) 
	{
		super(xOffset, yOffset , sortName);
		
	}

	
	
	public void sortFunction() 
	{
		mergeSort(0, list.length - 1);
		
		System.out.println("Merge sort finsinshed");
	}
	
	

	private void mergeSort(int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(left, mid);
            mergeSort(mid + 1, right);
            merge(left, mid, right);
        }
    }

    private void merge(int left, int mid, int right) 
    {
    	int[] leftArr = java.util.Arrays.copyOfRange(list, left, mid + 1);
        int[] rightArr = java.util.Arrays.copyOfRange(list, mid + 1, right + 1);

        int i = 0, j = 0, k = left;

        while (i < leftArr.length && j < rightArr.length) {
            try {
                Thread.sleep(1); 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Merge interrupted.");
                return;
            }

            if (leftArr[i] <= rightArr[j]) {
                list[k++] = leftArr[i++];
            } else {
                list[k++] = rightArr[j++];
            }
        }

        while (i < leftArr.length) list[k++] = leftArr[i++];
        while (j < rightArr.length) list[k++] = rightArr[j++];
    }
        
    
}
