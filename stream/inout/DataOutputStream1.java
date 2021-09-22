package stream.inout;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStream1 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fs=new FileOutputStream("abc.txt");
		DataOutputStream ds=new DataOutputStream(fs);
		ds.write(100);
		ds.writeBoolean(true);
		ds.writeByte(97);
		ds.writeBytes("krishan");
		ds.writeChar(65);
		ds.writeChars("kumawat");
		
	
		
		
		
//		ds.flush();
	}

}
