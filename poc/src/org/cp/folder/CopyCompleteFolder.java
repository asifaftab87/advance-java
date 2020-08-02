package org.cp.folder;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.FileUtils;

public class CopyCompleteFolder {

	public static void main(String[] args) {
		
		String source = "\\\\?\\D:\\longpath\\aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb\\cccccccccccccccccccccccccccc\\dddddddddddddddddddddddddddd\\eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee\\ffffffffffffffffffffffffffffffffff\\gggggggggggggggggggggggggggggggggg\\hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh\\iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii\\sdfads.txt";
		
		File file = new File(source);
		
		//String source = "D:\\longpath\\aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb\\cccccccccccccccccccccccccccc\\dddddddddddddddddddddddddddd";
		
		try {
			InputStream is = new FileInputStream(source);
			//InputStream is = new FileInputStream(file);
		} 
		catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		
		File srcDir = new File(source);

		String destination = "D:\\longpath";
		File destDir = new File(destination);

		try {
		    FileUtils.copyDirectory(srcDir, destDir);
		} 
		catch (IOException e) {
		    e.printStackTrace();
		}
	}
}
