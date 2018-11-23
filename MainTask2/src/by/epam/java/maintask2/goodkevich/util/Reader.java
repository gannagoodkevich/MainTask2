package by.epam.java.maintask2.goodkevich.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reader {
	public static String reader(File file1) throws IOException
	{
		String str = " ";
		//File file1 = new File("C:\\Users\\Андрей\\eclipse-workspace\\MainTask2\\bin\\test1.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file1)));
		while(br.read()!=-1) {
			str += br.readLine();
		}
		br.close();
		return str;
	}
}
