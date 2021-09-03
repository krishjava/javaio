import java.io.*;
class TotalMergeFile {
	public static void main(String[] args)throws IOException {
		PrintWriter pw=new PrintWriter("output.txt");
		File f=new File("/home/krishan/Desktop/IO");
		String[] s=f.list();
		for(String s1:s) {
		 File f2=new File(f,s1);
		  if(f2.isFile()){	
		      File f1=new File(f,s1);
		      BufferedReader br=new BufferedReader(new FileReader(f1));
		      String line=br.readLine();
		      while(line!=null)
 		       {
			 pw.println(line);
			 line=br.readLine();
 		       }
		      }
	       }
		pw.flush();
	}
}
