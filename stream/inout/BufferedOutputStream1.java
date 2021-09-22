package stream.inout;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStream1 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fs=new FileOutputStream("abc.txt");
		BufferedOutputStream bs=new BufferedOutputStream(fs);
		for (int i = 95; i < 105; i++) {
			bs.write(i);
		}
		byte b[]= {120,33,78};
		bs.write(b);
		bs.flush();
		System.out.println("hel");
	}

}
