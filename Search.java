

	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.Scanner;

	public class Search
	{
		public static int findNumLinear(int[] arr,int search) throws InterruptedException
		{
			for(int i=0;i<arr.length;i++)
			{
				System.out.println("The search is at:"+arr[i]);
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
				System.out.println("The search is at:"+s);
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
		System.out.println("Midpoint");
		while(high>=low)
		{
		System.out.println("Midpoint:"+midpoint+","+list.get(midpoint)+"\tHigh:"+high+"\tLow:"+low);
	
		if(list.get(midpoint).equals(target))
		return midpoint;
		if((list.get(midpoint)).compareTo(target+"")>0)
		high=midpoint-1;
		if((list.get(midpoint)).compareTo(target)<0)
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
			int[] arr2= {1,5,7,8,9,12,14,15,20,21,22,26,29,45,75,80,81};
			String[] arr3_5= {"apple","bees","beees","conifer","dog","elephant"};
			ArrayList<String> arr3=new ArrayList<String>(Arrays.asList("apple","bees","beees","conifer","dog","elephant"));
		
			String prompt,temp2;
			int temp;
			System.out.println("The Array is: "+Arrays.toString(arr));
			System.out.print("How many times do you want to test findNumLinear: ");
			times=input.nextInt();
			
			for(int i =1;i<=times;i++)
			{
				System.out.print("Test "+i+": Enter what you want to look for with linear search: ");
				num=input.nextInt();
				temp=findNumLinear(arr,num);
				if(temp==-1)
				System.out.println("The number "+num+" is not in the array");
				System.out.println("The number "+num+" has been found at position "+temp);
			}
			// System.out.println("Array: "+Arrays.toString(arr));
		
			System.out.println("The Array is: "+Arrays.toString(arr3_5));
			System.out.print("How many times do you want to test findByLetter: ");
			times=input.nextInt();
			
			for(int i =1;i<=times;i++)
			{
				System.out.print("Test "+i+": Enter what you want to look for with linear search: ");
				prompt=input.nextLine();
				temp2=findByLetter(arr3_5,prompt.charAt(0));
				if(temp2==null)
					System.out.println("The String "+prompt+" is not in the array");
				System.out.println("The String "+prompt+" is in the array");
			}
		
			System.out.println("The Array is: "+Arrays.toString(arr2));
			System.out.print("Enter how many times  you want to test findNumBinary: ");
			times=input.nextInt();
			input.nextLine();
			for(int i =1;i<=times;i++)
			{
				System.out.print("Test "+i+": Enter what you want to look for with binary search: ");
				num=input.nextInt();
				temp=findNumBinary(arr2,num);
			if(temp==-1)
				System.out.println("The number "+num+" is not in the array");
			else
				System.out.println("The number "+num+" has been found at position "+temp);
			}
		
		
			System.out.println("The Array is: "+arr3);
			System.out.print("Enter how many times  you want to test findWord: ");
			times=input.nextInt();
			input.nextLine();
			for(int i =1;i<=times;i++)
			{
			System.out.print("Test "+i+": Enter what you want to look for with findWord: ");
			prompt=input.nextLine();
		
			if(findWord(arr3,prompt)==-1)
				System.out.println("The word "+prompt+" is not in the array");
			else
				System.out.println("The word "+prompt+" has been found at position "+findWord(arr3,prompt));
			}
		
		}

}

