package search;

//@author softnrajkumar1994@gmail.com mobile : +918903425725

public abstract class Search
{
	int data[] ;
	
	public Search(int[] data)
	{
		this.data = data;
	}
	
	public abstract boolean isContains(int element);
}
