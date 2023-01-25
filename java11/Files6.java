import java.io.*;
class File6
{
  public static void main(String args[]) throws IOException
  {
    FileOutputStream fou=new FileOutputStream("files/data.txt");
   try{
     String str="welcome to bitlabs";
     byte b[]=str.getBytes(); //converting the string into byte arry
    fou.write(b);
    fou.close();
    System.out.println("success");
   }
    catch(IOException e)
     {
       System.out.println(e);
     }
  }
}