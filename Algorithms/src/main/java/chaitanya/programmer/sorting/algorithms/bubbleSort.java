package chaitanya.programmer.sorting.algorithms;

/**
 * This program performs bouble sort on an array of integers.
 */
public class bubbleSort 
{
	
	public static void main(String[] args)
	{
		int[] array = {1,4,8,2,6,9,3,5,7,-3,-7};
		boolean sorted = true;
		while(sorted)
		{
			sorted = false;
			for(int i=0;i<array.length-1;i++)
			{
				if(array[i] > array[i+1])
				{
					sort(array, i);
					sorted = true;
				}
			}
		}
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
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
