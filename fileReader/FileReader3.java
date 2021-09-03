import java.io.*;
class FileReader3
{
    public static void main(String[] args)throws IOException
    {
	File f=new File("cricket.txt");
	char[] ch=new char[(int)f.length()]; //small amount of data
	FileReader fr=new FileReader(f);
	fr.read(ch);
	for(char ch1:ch)
	  {
		System.out.print(ch1);
	  }
     }
}
