package by.epam.java.maintask2.goodkevich.view;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class View {
	
	static File file1 = new File("C:\\Users\\Андрей\\eclipse-workspace\\MainTask2\\bin\\test2.txt");
	
	static public void outDouble(double d) throws IOException {
		BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file1)));
		String str = Double.toString(d);
		wr.write(str);
		wr.write("\n");
		wr.close();
	}
	
	static public void outInt(int d) throws IOException {
		BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file1)));
		String str = Integer.toString(d);
		wr.write(str);
		wr.write("\n");
		wr.close();
	}
	
	static public void outString(String str) throws IOException {
		BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file1)));
		wr.write(str+"\n");
		wr.close();
	}
}
