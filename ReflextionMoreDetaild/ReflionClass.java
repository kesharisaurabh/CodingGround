package ReflextionMoreDetaild;

import java.lang.reflect.Method;

public class ReflionClass 
{
	public static void main(String[] args) 
	{
		Class cls=dataclass.class;
		Method[] md=cls.getDeclaredMethods();
		for(int i=0;i<md.length;i++)
		{
			Method mm=md[i];
			System.out.println("Class Method Name");
			System.out.println(mm.getName());
			
			System.out.println("Class Method ReturnTypes");
			System.out.println(mm.getReturnType());
			
			System.out.println("Class Method Parameter Count");
			System.out.println(mm.getParameterCount());
			
			System.out.println("Class Method Modifieres");
			System.out.println(mm.getModifiers());
			
			System.out.println("Class Method Default Value");
			System.out.println(mm.getDefaultValue());
			
			System.out.println("Class Method AnnotationException");
			System.out.println(mm.getAnnotatedExceptionTypes());
			
			System.out.println();
			System.out.println();
		}
	}
}
