//@author softnrajkumar1994@gmail.com mobile : +918903425725
package sorting;

import sorting.Sort;

class SelectionSort extends Sort
{
	public SelectionSort(int[] data)
	{
		super(data); 
	}

	public void doSort(boolean isasc)
	{
		int counter = 0;
		for(int i=0;i<data.length;i++)
		{
			if(isasc)
			{
				int min = data[i];
				int tempindex = i;
				for(int j=i+1;j<data.length;j++)
				{
					if(min < data[j])
					{
						min = data[j];
						tempindex = j;
					}
				}
				int temp = data[counter];
				data[tempindex] = data[counter];
				data[counter++] = min;
			}
			else if(!isasc)
			{
				int max = data[i];
				int tempindex = i;
				for(int j=i+1;j<data.length;j++)
				{
					if(max > data[j])
					{
						max = data[j];
						tempindex = j;
					}
				}
				int temp = data[counter];
				data[tempindex] = data[counter];
				data[counter++] = max;
			}
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
