package stream.inout;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayInputStreamSkip3 {

	public static void main(String[] args) throws IOException {
		String s="my name krishan";
		byte b[]=s.getBytes();
		ByteArrayInputStream bs=new ByteArrayInputStream(b);
		for (int i = 0; i < b.length; i++) {
			if(i%2==0) {
				bs.skip(1);
			}else
			{
				System.out.print((char)bs.read());
			}
		}
	}

}
