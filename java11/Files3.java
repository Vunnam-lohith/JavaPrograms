import java.io.*;
class File3
{
  public static void main(String args[])
  {
    File f=new File("files");
    String files[]=f.list();
    for(int i=0;i<files.length;i++)
      {
        System.out.println(files[i]);
      }
  }
}