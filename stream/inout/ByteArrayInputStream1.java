package stream.inout;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayInputStream1 {

	public static void main(String[] args) throws IOException {
		String s="my name krishan";
		byte[] b=s.getBytes();
		ByteArrayInputStream bs=new ByteArrayInputStream(b);
		System.out.println(bs.available());
		bs.skip(5);
		for (int i = 0; i < b.length; i++) {
			System.out.print((char)b[i]);
		}
		System.out.println();
		System.out.println(bs.available());
		
	}

}
