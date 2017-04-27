package com.java.interview;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.java.interview.Employee;

public class SerializeDemo {

	public static void main(String[] args) throws IOException {
		Employee eObj = new Employee(1234, "Mary", "Software Engineer", 678909868);
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try{
			fos = new FileOutputStream("C:\\Users\\Sonali Singh\\Desktop\\Serialize.ser");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(eObj);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (oos != null){
				oos.close();
			}
			if (fos != null){
				fos.close();
			}	
		}
	}
}
