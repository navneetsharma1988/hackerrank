package com.learning.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "myfile.txt";
		File file = new File(fileName);

		if (!file.exists()) {
			System.out.println("this file doesn't exist,,, Writing file ");
			try {
				file.createNewFile();
				FileWriter fileWriter = new FileWriter(fileName);
				BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
				bufferedWriter.write("write something here ");
				bufferedWriter.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		} else {
			System.out.println("this file exists,,, Reading file & printing output to console...");
			try {
				byte[] buffer = new byte[100];
				FileInputStream fileInputStream = new FileInputStream(fileName);
				while ((fileInputStream.read(buffer)) != -1) {
					System.out.println(new String(buffer));
				}
				fileInputStream.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}

	}

}
