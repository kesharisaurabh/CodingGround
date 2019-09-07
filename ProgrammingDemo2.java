import java.util.Scanner;

public class ProgrammingDemo2
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		int sum=0;
		for(int i=0;i<= n-1;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<=n-1;i++)
		{
			System.out.print(arr[i]+" ");
			sum=sum+arr[i];
		}
		System.out.println();
		System.out.println(sum);
		
		
	}
}
