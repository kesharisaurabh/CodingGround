package demo;

public class demo4 {
	public static void main(String[] args) {
		long num1=578378923;
		int pro=0;
		String str1=Long.toString(num1);
		for(int j=0;j<=str1.length()-1;j++)
		{
			for(int k=j+1;k<=str1.length()-1;k++)
			{
				if(str1.charAt(j)==str1.charAt(k))
				{
					pro++;
				}
			}
		}
		System.out.println(pro);
	}

}
