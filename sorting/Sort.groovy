//@author softnrajkumar1994@gmail.com mobile : +918903425725
package sorting;

public abstract class Sort
{
	public int[] data;

	public Sort(int[] data)
	{
		this.data = data;
	}

	public void doAscendingSort()
	{
		println "\nBubble Ascending Sort Started With Elements "+data;
		doSort(true);
		println "\nBubble Sort Ended With Result :"+data;
	}

	public void doDescendingSort()
	{
		println "\nBubble Descending Sort Started With Elements "+data;
		doSort(false);
		println "\nBubble Sort Ended With Result :"+data;
	}

	public abstract void doSort(boolean isasc);
}
