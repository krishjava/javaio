import java.io.*;
class File8
{
   public static void main(String[] args)throws IOException
   {
	int count=0;
	File f=new File("/home/krishan/Desktop");
	String[] s=f.list();
	for(String s1:s) {
		File f1=new File(f,s1);
		if(f1.isDirectory()) { // s1.isFile() can’t use bcz s1 is String but not file object
		  count++;
		  System.out.println(s1);
	          }
              }
         System.out.println("total number : "+count);
   }
}
