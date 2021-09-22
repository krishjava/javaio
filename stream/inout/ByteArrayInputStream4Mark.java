package stream.inout;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayInputStream4Mark {

	public static void main(String[] args) throws IOException {
		String s="my name krishan";
		byte[] b=s.getBytes();
		ByteArrayInputStream bs=new ByteArrayInputStream(b);
		for (int i = 0; i < 2; i++) {
			System.out.println((char)bs.read());
		}	
		bs.mark(122);
		System.out.println((char)bs.read());
		System.out.println((char)bs.read());
		System.out.println((char)bs.read());
		System.out.println((char)bs.read());
		bs.reset();
		System.out.println((char)bs.read());
		System.out.println((char)bs.read());
		System.out.println((char)bs.read());
		
	}

}
