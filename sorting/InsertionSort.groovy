//@author softnrajkumar1994@gmail.com mobile : +918903425725
package sorting;

import sorting.Sort;
import utils.ArrayUtils;

class InsertionSort extends Sort
{
	public InsertionSort(int[] data)
	{
		this.data = data;
	}

	public void doSort(boolean isasc)
	{
			
	}

	public static void main(String[] args)
	{
		int[] a = [100,100,9,2,4,50,34,29,20,38,45,28,84];
		InsertionSort bs = new InsertionSort(a);
		bs.doAscendingSort();
		bs.doDescendingSort();
	}
}
