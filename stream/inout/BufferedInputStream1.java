package stream.inout;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStream1 {

	public static void main(String[] args) throws IOException {
		FileInputStream fs=new FileInputStream("abc.txt");
		BufferedInputStream bs=new BufferedInputStream(fs);
//		byte [] b= bs.readAllBytes();
//		for (int i = 0; i < b.length; i++) {
//			System.out.println((char)b[i]);
//		}
		int i=bs.read();
		System.out.println((char)i);
		byte b[]=new byte[3];
		bs.read(b);
		for (int j = 0; j < b.length; j++) {
			System.out.println((char)b[j]);
		}
	}

}
