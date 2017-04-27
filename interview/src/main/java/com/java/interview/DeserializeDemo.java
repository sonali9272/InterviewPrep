package com.java.interview;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo {

	public static void main(String[] args) throws IOException {
		DeserializeDemo demo = new DeserializeDemo();
		demo.deserializeEmp();
	}
	
	public Employee deserializeEmp() throws IOException {
		Employee eObj = null;
		ObjectInputStream ois = null;
		
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\Sonali Singh\\Desktop\\Serialize.ser");
			ois = new ObjectInputStream(fis);
			
			eObj = (Employee) ois.readObject();
			System.out.println(eObj.getContact()+ "\t"+ eObj.getDesignation() +"\t"+ eObj.getName() + "\t"+eObj.getSsn());
			
		} catch(FileNotFoundException e) {
			System.out.println(e.getMessage());	
		} catch (ClassNotFoundException e){
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			if (ois != null) {
				ois.close();
			}
		}
		
		return eObj;
	}
}
