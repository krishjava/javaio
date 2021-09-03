import java.io.*;
class File1
{
public static void main(String[] args)throws IOException
{
File f=new File("cricket.txt");
System.out.println(f.exists());//false
f.createNewFile();// create physical file
System.out.println(f.exists());//true
}
}
