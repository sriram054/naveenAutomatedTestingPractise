package co.PractiseSessions;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		 int a[]= {1,4,3,2,5};
		 System.out.println(getSecondLargest(a));

	}

	private static int getSecondLargest(int[] a) 
	{
		/*
		Arrays.sort(a);
		return a[a.length-2];*/
		int temp,length=a.length;
		for(int i=0;i<length;i++)
		{
			for(int j=i+1;j<length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[length-2];
	}
}
