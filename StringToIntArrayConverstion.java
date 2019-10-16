package Assignement;

public class StringToIntArrayConverstion 
{
	public static void main(String[] args) 
	{
		String str1="10 20 30 40 50 60 70";
		String []str2=str1.split(" ");
		System.out.println(str2.length);
		int arr1[]=new int[(str2.length)];
		for(int i=0;i<str2.length;i++)
		{
			arr1[i]=Integer.parseInt(str2[i]);
		}
		for(int ar2:arr1)
		{
			System.out.print(ar2+" ");
		}
	}
}
