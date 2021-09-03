import java.io.*;
class FileReader3Error
{
    public static void main(String[] args)throws IOException
    {
	File f=new File("cricket.txt");
	char[] ch=new char[f.length()]; //small amount of data
	FileReader fr=new FileReader(f);
	fr.read(ch);
	for(char ch1:ch)
	  {
		System.out.print(ch1);
	  }
     }
}
