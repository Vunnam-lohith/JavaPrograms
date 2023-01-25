import java.io.*;
class File7
{
  public static void main(String args[]) throws IOException
  {
    FileInputStream fis=new FileInputStream("files/data.txt");
    try{
    int i=fis.read();
    System.out.println((char)i);
     System.out.println("Success");
    }
    catch(IOException e)
      {
        System.out.println(e);
      }
  }
}