//@author softnrajkumar1994@gmail.com mobile : +918903425725
package sorting;

import sorting.Sort;
import util.ArrayUtils;

//select sort is far better than Bubble sort.But when it comes to large set of data .It also will take so much time to execute Big O of n power2.
class SelectionSort extends Sort
{
	public SelectionSort(int[] data)
	{
		super(data); 
	}

	public void doSort(boolean isasc)
	{
		for(int i=0;i<data.length;i++)
		{
			int tempindex = i;
			if(isasc)
			{
				int min = data[i];	
				for(int j=i+1;j<data.length;j++)
				{
					if(min > data[j])
					{
						min = data[j];
						tempindex = j;
					}
				}
			}
			else if(!isasc)
			{
				int max = data[i];
				for(int j=i+1;j<data.length;j++)
				{
					if(max < data[j])
					{
						max = data[j];
						tempindex = j;
					}
				}
			}
			ArrayUtils.swap(data,i,tempindex);
		}
	}

	public static void main(String[] args)
	{
		int[] a = [100,100,9,2,4,50,34,29,20,38,45,28,84];
		SelectionSort bs = new SelectionSort(a);
		bs.doAscendingSort();
		bs.doDescendingSort();
	}
}
