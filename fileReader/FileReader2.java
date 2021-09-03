import java.io.*;
class FileReader2
{
    public static void main(String[] args)throws IOException
   {
   	FileReader fr=new FileReader("cricket.txt");
	int i=fr.read();
	//more amount of data
	while(i!=-1)
	   {
		System.out.print(i);
		i=fr.read();
 	   }
	fr.close();
	}
}
