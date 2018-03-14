package search;

import search.Search;

//@author softnrajkumar1994@gmail.com mobile : +918903425725

//1)Elements should be ordered in order to use binary search

class BinarySearch extends Search
{
	public BinarySearch(int a[])
	{
		super(a);
	}

	public boolean isContains(int element)
	{
		return isContains(0,this.data.length,element);
	}

	private boolean isContains(int sindex,int eindex,int element)
	{
		if(sindex > eindex)
		{
			return false;
		}
		int mid = (sindex + eindex) / 2;
		
		if(this.data[mid] == element)
		{
			return true;
		}
		else if(this.data[mid] > element)
		{
			return isContains(sindex,mid-1,element);
		} 
		else
		{
			return isContains(mid+1,eindex,element);
		}
	}

	public static void main(String args[])
	{
		int data[] = {7,12,24,34,34,78,100,200};
		BinarySearch search = new BinarySearch(data);
		System.out.println("Is element 20 is available in {7,12,24,34,34,78,100,200}"+search.isContains(20)); 
		System.out.println("Is element 78 is available in {7,12,24,34,34,78,100,200}"+search.isContains(78)); 
	}
}
