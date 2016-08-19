package chaitanya.programmer.sorting.algorithms;

/**
 * This program performs bubble sort on an array of integers. This is more
 * efficients than the bubble sort program since it takes 50% less iterations in
 * worst case.
 * 
 * @author Chaitanya
 */
public class BubbleSortEfficient 
{
	
	public static void main(String[] args)
	{
		int[] array = {9,8,7,6,5,4,3,2,1,-3,-7};
		boolean sorted = true;
		int loopSize = 0;
		int length = 0;
		int count = 0;
		while(sorted)
		{
			sorted = false;
			if(loopSize == 0)
			{
				loopSize = array.length-1;
			}
			else 
			{
				loopSize = length;
			}
			for(int i=0;i<loopSize;i++)
			{
				if(array[i] > array[i+1])
				{
					sort(array, i);
					sorted = true;
					length = i;
					count ++;
				}
			}
		}
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		
		System.out.println("Number of iterations to go through :" + count);
	}

	/**
	 * This method sorts ith array element with (i+1)th array element
	 * 
	 * @param array
	 * @param i
	 * 
	 * @author Chaitanya
	 */
	private static void sort(int[] array, int i) 
	{
		int a = array[i];
		array[i] = array[i+1];
		array[i+1] = a;
	}

}
