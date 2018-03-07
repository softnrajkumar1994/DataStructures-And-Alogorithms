//@author softnrajkumar1994@gmail.com mobile : +918903425725
package util;

class ArrayUtils
{
	public static void swap(int[] array,int toindex,int fromindex)
	{
		int temp = array[toindex];
		array[toindex] = array[fromindex];
		array[fromindex] = temp;	
	}
}
