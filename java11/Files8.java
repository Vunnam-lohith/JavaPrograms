//to read data from file using byte stream
import java.io.*;
class File8
{
  public static void main(String args[]) throws IOException
  {
    FileInputStream fis=new FileInputStream("files/data.txt");
    try{
      int i;
    while((i=fis.read())!=-1)
      {
    System.out.print((char)i);
   
    }
       System.out.println("Success");
    }
    catch(IOException e)
      {
        System.out.println(e);
      }
  }
}