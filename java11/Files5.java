//writing the data in to file using byte stream
import java.io.*;
class File5
{
  public static void main(String args[]) throws IOException
  {
    FileOutputStream fou=new FileOutputStream("files/data.txt");
   try{
    fou.write(65);
    fou.close();
    System.out.println("success");
   }
    catch(IOException e)
     {
       System.out.println(e);
     }
  }
}