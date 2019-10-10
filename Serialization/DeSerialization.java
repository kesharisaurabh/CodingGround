package Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialization 
{
	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		FileInputStream pis=new FileInputStream("src/Serialization/files.se");
		ObjectInputStream oos=new ObjectInputStream(pis);
		student st=(student)oos.readObject();
		System.out.println(st.sid);
		System.out.println(st.name);
		
		
	}
}
