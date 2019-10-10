package ReflextionMethodInvoke_M1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflionClass 
{
	void callReflex(String mzzz) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException 
	{
		dataclass dt=new dataclass();
		Class cls=dataclass.class;
		Method md=cls.getDeclaredMethod(mzzz,int.class);
		md.invoke(dt, 34);
		
	}
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException
	{
		ReflionClass rf=new ReflionClass();
		rf.callReflex("M1");
	}
}
