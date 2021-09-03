import java.io.*;
class File4
{
  public static void main(String[] args)throws IOException
  {
    File f1=new File("SaiCharan123");
    f1.mkdir();
    File f2=new File("SaiCharan123","abc.txt"); // or   File f2=newFile(f1,"abc.txt");
    f2.createNewFile();
  }
}
