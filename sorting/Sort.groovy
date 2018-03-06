//@author softnrajkumar1994@gmail.com mobile : +918903425725
package sorting;

public abstract class Sort
{
	public int[] data;

	public void doAscendingSort()
	{
		doSort(true);
	}

	public void doDescendingSort()
	{
		doSort(false);
	}

	public Sort(int[] data)
	{
		this.data = data;
	}

	public abstract void doSort(boolean isasc);
}
