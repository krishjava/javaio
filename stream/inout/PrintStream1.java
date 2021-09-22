package stream.inout;
import java.io.*;
import java.util.Locale;
public class PrintStream1 {

	public static void main(String[] args) throws IOException {
		 	FileOutputStream fout=new FileOutputStream("abc.txt");
	        PrintStream out=new PrintStream(fout);
	        char c[]={'A','B','C','K'};
	        out.print('K');
	        out.print(true);
	        out.print(c);
	        out.println();
	        out.printf("%f", 1.4);
	        out.printf(Locale.getDefault(),"%s","kk");
	        out.println();
	        byte b[]= {97,66,67};
	        out.write(b);
	        out.flush();
	        out.close();
	}

}
