package stream.inout;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayInputStreamSkip2 {

	public static void main(String[] args) throws IOException {
		byte[] buf = { 5, 6, 7, 8, 9 }; 
		ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(buf); 
		System.out.println(byteArrayInputStream.read()); 
		byteArrayInputStream.skip(1); 
		System.out.println(byteArrayInputStream.read()); 
		System.out.println(byteArrayInputStream.read());
	}

}
