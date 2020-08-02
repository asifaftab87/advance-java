package org.inhert;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class FileHandle {

	public static void main(String[] args) {
		
		 File myObj = new File("filename.txt");
		 
	     Scanner myReader;
		try {
			myReader = new Scanner(myObj);
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	     
	   
	}
}
