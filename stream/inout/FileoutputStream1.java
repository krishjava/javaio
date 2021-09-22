package stream.inout;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileoutputStream1 {

	public static void main(String[] args) throws Exception {
		FileOutputStream fs=new FileOutputStream("abc.txt");
		fs.write(-128);
		String s="my name is krish";
		System.out.println(s.getBytes().length);
		fs.write(s.getBytes(), 3, 10); // write 3-12 bcz b[off] to b[off+len-1]
		fs.write(92);
		String s1="\n";
		fs.write(s1.getBytes());
		fs.write(s.getBytes());
		fs.close();
	}
}
