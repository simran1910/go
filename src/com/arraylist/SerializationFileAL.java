package com.arraylist;

import java.io.*;
import java.util.*;

//It will create a file learnfile which will be having ArrayList object in form of Stream of bytes.
//We would be using “learnfile” at the receivers end to recreate the Object from stream of bytes.
//Note: We did not implemented the Serializable interface in the below class because ArrayList is already been serialized by default.


public class SerializationFileAL {

	public static void main(String[] args) {
		
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("Hello");
		a1.add("Hi");
		a1.add("Howdy");
		
		try {
			FileOutputStream fos=new FileOutputStream("learnfile");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(a1);
			oos.close();
			fos.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
