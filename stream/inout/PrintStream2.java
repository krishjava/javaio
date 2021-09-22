package stream.inout;
import java.io.*;
import java.util.Locale;
public class PrintStream2 {

	public static void main(String[] args) throws IOException {
		 	FileOutputStream fout=new FileOutputStream("abc.txt");
	        PrintStream out=new PrintStream(fout);
//	        redirect console output into the file
	        System.setOut(out);
	        System.out.println("krishan");
	        System.out.println(1.232f);
//	        redirect error into the file 
	        System.setErr(out);
	        System.err.println("something went wrong.....");
	}
}
