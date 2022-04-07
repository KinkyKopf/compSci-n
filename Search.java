package unit7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Search 
{
	public static int findNumLinear(int[] arr,int search) throws InterruptedException
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("The search is at:"+arr[i]);
			if(arr[i]==search)
				return i;
			Thread.sleep(200);
		}
		return -1;
	}
	public static String findByLetter(String[] arr,char c) throws InterruptedException
	{
		for(String s:arr)
		{
			System.out.print("The search is at:"+s);
			if(s.charAt(0)==c)
				return s;
			Thread.sleep(200);
		}
		return null;
	}
	public static int findNumBinary(int[] arr,int target) throws InterruptedException
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
			System.out.println("Midpoint:"+midpoint+","+arr[midpoint]+"\tHigh:"+high+"\tLow:"+low);
			Thread.sleep(200);
		}
		return-1;
	}
	public static int findWord(ArrayList<String> list,String target)
	{
		int low,high,midpoint;
		low=0;
		high=list.size()-1;
		midpoint=(high+low)/2;
		while(high>=low)
		{
			if(list.get(midpoint).equals(target))
				return midpoint;
			if((list.get(midpoint)).compareTo(target+"")<0)
				high=midpoint-1;
			if((list.get(midpoint)).compareTo(target)>0)
				low=midpoint+1;
			midpoint=(high+low)/2;
			System.out.println("Midpoint:"+midpoint+","+list.get(midpoint)+"\tHigh:"+high+"\tLow:"+low);
		}
		return -1;
	}
	public static void main(String[] args) throws InterruptedException
	{
		Scanner input=new Scanner(System.in);
		int times,num;
		int[] arr= {1,4,2,3,6,8,7,6,13,8,44,22,11,5,9};
		System.out.print("How many times do you want to test findNumLinear: ");
		times=input.nextInt();
		input.nextLine();
		for(int i =1;i<=times;i++)
		{
		System.out.print("Test "+i+": Enter what you want to look for with linear search: ");
		num=input.nextInt();
		
		System.out.println(findNumLinear(arr,num));
		}
		System.out.println("Array: "+Arrays.toString(arr));
		
		int[] arr2= {1,5,7,8,9,12,14,15,20,21,22,26,29,45,75,80,81};
		ArrayList<String> arr3=new ArrayList<String>(Arrays.asList("apple","bees","beees","conifer","dog","elephant"));
		
		System.out.println(findNumBinary(arr2,13));
		System.out.println(findWord(arr3,"aple"));
	}

}