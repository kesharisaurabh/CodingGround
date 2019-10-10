package Reflextion;

import java.lang.reflect.Method;

public class ReflionClass 
{
	public static void main(String[] args) 
	{
		Class cl=dataclass.class;
		Method[] md=cl.getDeclaredMethods();
		for(int i=0;i<md.length;i++)
		{
			String str=md[i].getName();
			System.out.println(str);
		}
		
	}
}
