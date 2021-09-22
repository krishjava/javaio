package stream.inout;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStream1 {

	public static void main(String[] args) throws Exception {
		FileInputStream fs=new FileInputStream("abc.txt");
		System.out.println(fs.available());
		fs.read();
		System.out.println(fs.available());
		byte b[]=new byte[3];
		fs.read(b);
		for (int i = 0; i < b.length; i++) {
			System.out.println((char)b[i]);
		}
		while(true) {
			int i=fs.read();
			if(i==-1)
				break;
			System.out.println((char)i);
		}
	}

}
