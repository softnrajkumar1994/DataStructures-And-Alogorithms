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
		System.out.println("\nBubble Ascending Sort Started With Elements "+data);
		doSort(true);
		System.out.println("\nBubble Sort Ended With Result :"+data);
	}

	public void doDescendingSort()
	{
		System.out.println("\nBubble Descending Sort Started With Elements "+data);
		doSort(false);
		System.out.println("\nBubble Sort Ended With Result :"+data);
	}

	public abstract void doSort(boolean isasc);
}
