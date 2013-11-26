package main.java.grep;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.nio.CharBuffer;

public class MyFile {
	public static String FILE_NAME = "file1.txt";
	public static String CARRIAGE_RETURN = "\r";

	public MyFile() {
	}
	
	private InputStream getInputStream() {
		InputStream in;
		in = getClass().getResourceAsStream(FILE_NAME);
		return in;
	}
	
	public String getWholeText() {
		InputStream in = null;
		String text = null;
		try {
			in = getInputStream();
	
			byte[] str = new byte[in.available()];
			in.read(str);
			text = new String(str);
			
			in.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
		return text;
	}

	public String getLineByWord(String textContains) {
		String lines = ""; 
		String s = null;
		BufferedReader in = new BufferedReader(new InputStreamReader(getInputStream()));
		try {
			while((s = in.readLine()) != null) {
				if(s.contains(textContains)){
					lines = lines.concat(s).concat(CARRIAGE_RETURN); //why i need to do lines=..
				}
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}	
		
		return lines;
	}
	
	public String getLineByMask(){
		Reader in;
			
		try {
			in = new CharArrayReader(new FileReader("C://Users/Katrja/workspace/Grep/resources/file1.txt"));
			
			in.
			//System.out.println(in.read());
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
