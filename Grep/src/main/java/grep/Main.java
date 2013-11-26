package main.java.grep;

public class Main {
	
	public Main() {
	}
	
	public static void main(String[] args) {
		MyFile in = new MyFile();
		//System.out.println(in.getLineByWord("e"));
		System.out.println(in.getLineByMask());
		
	}

}
