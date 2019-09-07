import java.util.Scanner;

public class ProgramingDemo4
{
	public static void main(String[] args) {
		int fn=0;
		int sn=1;
		int sum=0;
		int count=1;
		
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		while(true)
		{
			
			if(no<=count)
			{
				break;
			}
			sum=fn+sn;
			fn=sn;
			sn=sum;
			count++;
		}
		System.out.println(no+" "+sum);

	}
}

//Input==15
//Output==15 610

  
