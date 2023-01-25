import java.io.*;
class File
{
  public static void main(String args[]) throws IOException
  {
    File f=new File("sample.txt");
    if(f.exists())
    {
      System.out.println("name of the file "+f.getName());
      System.out.println("path of the file "+f.getAbsolutePath());
      System.out.println("can read "+f.canRead());
      System.out.println("can write "+f.canWrite());
      System.out.println("size of the file "+f.length());
    }
  }
}