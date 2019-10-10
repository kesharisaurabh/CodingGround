package Serialization_transiant;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class serialized
{
	public static void main(String[] args) throws IOException 
	{
		FileOutputStream pos=new FileOutputStream("src/Serialization/files.se");
		ObjectOutputStream oop=new ObjectOutputStream(pos);
		student st= new student();
		st.name="saurabh";
		st.sid=23;
		oop.writeObject(st);		
	}
}
