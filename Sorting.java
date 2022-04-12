import java.util.ArrayList;
import java.util.Arrays;

public class Sorting 
{
	public static void sortArraySelection(int[] arr)
	{
		int smallest=arr[0];
		int smallestIndex=0;
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			smallest=arr[i];
			 smallestIndex=i;
			for(int k=i;k<arr.length;k++)
			{
				if(arr[k]<smallest)
				{
				smallest=arr[k];
				smallestIndex=k;
//				System.out.println("new smallest: "+smallest+"\n");
				}
//				System.out.println("Looking at:"+arr[k]);
			}
			temp=arr[i];
			arr[smallestIndex]=temp;
			arr[i]=smallest;
//			System.out.println(Arrays.toString(arr)+"\n\nSmallest:"+smallest+"\nSmallestindex:"+smallestIndex+"\n");
			
		}
	}
	public static void sortArrayListSelection(ArrayList<Integer> arr)
		{
			int smallest=arr.get(0);
			int smallestIndex=0;
			int temp;
			for(int i=0;i<arr.size();i++)
			{
				smallest=arr.get(i);
				 smallestIndex=i;
				for(int k=i;k<arr.size();k++)
				{
					if(arr.get(k)<smallest)
					{
					smallest=arr.get(k);
					smallestIndex=k;
//					System.out.println("new smallest: "+smallest+"\n");
					}
//					System.out.println("Looking at:"+arr.get(k));
				}
				temp=arr.get(i);
				arr.set(smallestIndex, temp);
				arr.set(i,smallest);
//				System.out.println(Arrays.toString(arr)+"\n\nSmallest:"+smallest+"\nSmallestindex:"+smallestIndex+"\n");
				
			}
	}
	public static void sortArrayInsertion(int[] arr) throws InterruptedException
	{
		int temp;
		for(int i=1;i<arr.length;i++)
		{
			int k=i-1;
			temp=arr[i];
			while(k>=0&&temp<arr[k])
			{
				arr[k+1]=arr[k];
				k--;
			}
			arr[k+1]=temp;
		}
	}
	
	public static void main(String[] args) throws InterruptedException
	{
		int[] arr= {4,3,1,7,8,9,14,22,0,5,4,12,3,62,18};
//		ArrayList<Integer> arr2= new ArrayList<Integer>(Arrays.asList(4,3,1,7,8,9,14,22,0,5,4,12,3,62,18));
//		System.out.println(Arrays.toString(arr));
//		System.out.println(arr2);
//		sortArraySelection(arr);
//		sortArrayListSelection(arr2);
//		System.out.println(arr2);
		sortArrayInsertion(arr);
		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.toString(arr));
	}

}
