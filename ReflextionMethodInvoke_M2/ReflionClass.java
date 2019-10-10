package ReflextionMethodInvoke_M2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflionClass 
{
	void callReflex(String mzzz) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException 
	{
		dataclass dt=new dataclass();
		Class cls=dataclass.class;
		Method md=cls.getDeclaredMethod(mzzz,String.class);
		md.invoke(dt, "saurabh");
		
	}
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException
	{
		ReflionClass rf=new ReflionClass();
		rf.callReflex("M2");
	}
}
