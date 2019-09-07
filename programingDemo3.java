public class programingDemo3
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		int count=1;
		int i;
		for(i=1;i<=str1.length() -1;i++)
		{
			if(str1.charAt(i-1)==str1.charAt(i))
			{
				count++;
			}
			else
			{
				System.out.print(str1.charAt(i-1)+""+count);
				count=1;
				
			}
			
		}System.out.print(str1.charAt(i-1)+""+count);
		
	}
}


//Input-- aaaaaSSSSSSnnnnnAAAAJJJJJJIIIIIII
OutPut-----a5S6n5A4J6I7
