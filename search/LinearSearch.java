package search;

import search.Search;

//@author softnrajkumar1994@gmail.com mobile : +918903425725

//Linear Search algorithms only suits for small amount of data.At worst case time complexity of this algorithm will be Big O(n) - here n will number of elements in to be checked in array

class LinearSearch extends Search
{
	public LinearSearch(int a[])
	{
		super(a);
	}

	public boolean isContains(int element)
	{
		for(int i=0;i<this.data.length;i++)
		{
			if(data[i] == element)
			{
				return true;
			}
		}
		return false;
	}

	public static void main(String args[])
	{
		int data[] = {100,200,12,34,7,34,24,78};
		LinearSearch search = new LinearSearch(data);
		System.out.println("Is element 20 is available in {100,200,12,34,7,34,24,78}"+search.isContains(20)); 
		System.out.println("Is element 78 is available in {100,200,12,34,7,34,24,78}"+search.isContains(78)); 
	}
}
