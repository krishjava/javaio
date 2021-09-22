package stream.inout;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectoutputStream1 {

	public static void main(String[] args)throws IOException {
		FileOutputStream fout=new FileOutputStream("abc.txt");
		ObjectOutputStream os=new ObjectOutputStream(fout);
		os.write(65);
		os.writeByte(3543);
		os.flush();
		
		FileInputStream fin=new FileInputStream("abc.txt");
		ObjectInputStream oin=new ObjectInputStream(fin);
		int i;
		while((i=oin.read())!=-1) {
			System.out.println((char)i);
		}
//		oin.read();
	}

}
