package com.ydsworld.Seralization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeDemo {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.name = " Sai Baba";
		e.address = "Sainath Rord, Petlad";
		e.SSN = 11122333;
		e.number = 1;
		
		try {
			File file = new File("c:\\tmp\\employee.ser");
			FileOutputStream fileOut = 
					new FileOutputStream(file);
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(e);
			fileOut.close();
			System.out.println("Serialized data is saved in /tmp/employee.ser");
		} catch (IOException e2) {
			e2.printStackTrace();
		}
	}
}
