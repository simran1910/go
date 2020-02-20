package com.arraylist;

import java.io.*;
import java.util.*;

// we are retrieving the stream of bytes from learnfile which we have stored using the above class.
//We are type casting the returned object to ArrayList and displaying the elements of ArrayList.
//Observe the output: We are getting the same elements which we have added to the ArrayList before the serialization.


public class DeserializationFileAL {

	public static void main(String[] args) {
		ArrayList<String> a2=new ArrayList<String>();
		try {
			FileInputStream fis=new FileInputStream("learnfile");
			ObjectInputStream ois=new ObjectInputStream(fis);
			a2=(ArrayList) ois.readObject();
			ois.close();
			fis.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		for(String st:a2) {
			System.out.println(st);
		}

	}

}
