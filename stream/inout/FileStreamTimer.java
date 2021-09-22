package stream.inout;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileStreamTimer {

	public static void main(String[] args) throws Exception {
		FileInputStream fs=new FileInputStream("abc.txt");
		Timer.startTime();
		while(true) {
			int i=fs.read();
			if(i==-1)
				break;
			System.out.print((char)i);
		}
		System.out.println();
		Timer.endTime();
	}

}
