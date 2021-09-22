package stream.inout;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputStream1 {

	public static void main(String[] args) throws IOException {
		ByteArrayOutputStream bs=new ByteArrayOutputStream();
		String s="my name krishan";
		byte b[]=s.getBytes();
		bs.write(b);
		System.out.println("Size :"+bs.size());
//		bs.reset(); // ................. 1
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]);
		}
		System.out.println("Size :"+bs.size());
//		inserting byte array into the file 
		FileOutputStream fs=new FileOutputStream("abc.txt");
		FileOutputStream fs1=new FileOutputStream("abcd.txt");
		bs.writeTo(fs);
		bs.writeTo(fs1);
		fs.close();
		fs1.close();
//		we can perform operation on bs after closing the file
		bs.close();
		System.out.println(bs.toString());
	}

}
