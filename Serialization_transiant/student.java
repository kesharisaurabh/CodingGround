package Serialization_transiant;

import java.io.Serializable;

public class student implements Serializable
{
	public final static long serialVersionUID=1L;
	
	transient int sid;
	String name;
	int phone;
}
