//@author softnrajkumar1994@gmail.com mobile : +918903425725
package sorting;

import sorting.Sort;
import utils.ArrayUtils;

class ShellSort extends Sort
{
	public ShellSort(int[] data)
	{
		this.data = data;
	}

	public void doSort(boolean isasc)
	{

	}

	public static void main(String[] args)
	{
		int[] a = [100,100,9,2,4,50,34,29,20,38,45,28,84];
		ShellSort bs = new ShellSort(a);
		bs.doAscendingSort();
		bs.doDescendingSort();
	}
}
