package unit5;

public class Searcher 
{
	public static int findNumLinear(int[] arr,int search)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==search)
				return i;
		}
		return -1;
	}
	public static String findByLetter(String[] arr,char c)
	{
		for(String s:arr)
		{
			if(s.charAt(0)==c)
				return s;
		}
		return null;
	}
	public static int findNumBinary(int[] arr,int target)
	{
		int low,high,midpoint;
		low=0;
		high=arr.length-1;
		midpoint=(high+low)/2;
		while(high>=low)
		{
			if(target==arr[midpoint])
				return midpoint;
			if(target<arr[midpoint])
				high=midpoint-1;
			if(target>arr[midpoint])
				low=midpoint+1;
			midpoint=(high+low)/2;
//			System.out.println("MIdpoint:"+midpoint+","+arr[midpoint]+"\tHigh:"+high+"\tLow:"+low);
		}
		return-1;
	}
	public static void main(String[] args)
	{
		int[] arr= {1,4,2,3,6,8,7,6,13,8,44,22,11,5,9,88,44,54,74,13,26,11,0,36,98};
		System.out.println(findNumLinear(arr,123));
		int[] arr2= {1,5,7,8,9,12,14,15,20,21,22,26,29,45,75,80,81};
		System.out.println(findNumBinary(arr2,13));
		
	}

}
