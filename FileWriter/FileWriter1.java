import java.io.*;
class FileWriter1
{
   public static void main(String[] args)throws IOException
   {
	FileWriter fw=new FileWriter("cricket.txt");
	fw.write(99);//adding a single character
	fw.write("haran\nsoftware solutions");
	fw.write("\n");
	char[] ch={'a','b','c'};
	fw.write(ch);
	fw.write("\n");
	fw.flush();
	fw.close();
  }
}
