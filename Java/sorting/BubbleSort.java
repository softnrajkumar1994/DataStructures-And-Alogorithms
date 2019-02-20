//@author softnrajkumar1994@gmail.com mobile : +918903425725
package sorting;

import sorting.Sort;
import util.ArrayUtils;

class BubbleSort extends Sort
{
	//Bubble sort compares each element with other elements in order to sort them.its very poor sorting technology when the size of the array is large.Time complexity for BubbleSort is BigO(n pow 2) always.Here n denotes number of elements.

	public BubbleSort(int[] a)
	{
		super(a);
	}

	public void doSort(boolean isasc)
	{
		for(int i=0;i<data.length;i++)
		{
			for(int j=0;j<data.length;j++)
			{
				//for ascending order sort
				if(data[i] < data[j] && isasc)
				{
					ArrayUtils.swap(data,i,j);
				}
				//for descending order sort
				else if(data[i] > data[j] && !isasc)
				{
					ArrayUtils.swap(data,i,j);
				}
			}
		}
	}

	public static void main(String[] args)
	{
		int[] a = {100,100,9,2,4,50,34,29,20,38,45,28,84};
		BubbleSort bs = new BubbleSort(a);
		bs.doAscendingSort();
		bs.doDescendingSort();
	}
}
