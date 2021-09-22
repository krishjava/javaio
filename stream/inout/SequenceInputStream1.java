package stream.inout;

import java.io.*;

public class SequenceInputStream1 {

	public static void main(String[] args) throws IOException {
		FileInputStream fs=new FileInputStream("abc.txt");
		FileInputStream fs1=new FileInputStream("test.txt");
		SequenceInputStream ss=new SequenceInputStream(fs, fs1);
		System.out.println(  ss.read());
		for(int i=0;i<10;i++){
			System.out.println((char)ss.read());
		}
	}

}
