//delete()
class StringBufferDel
  {
    public static void main(String args[])
    {
     StringBuffer sb=new StringBuffer("welcome");
      sb.delete(3,6); //Begining indexposition and end index position
      System.out.println(sb); //wele
     StringBuffer sb1=new StringBuffer("Bitlabs");
      sb1.replace(3,6,"course"); //Begining indexposition and end index position
      System.out.println(sb1); //Bitcourses
      
      //insert()
     StringBuffer sb2=new StringBuffer("welcome");
     sb2.insert(4,"hello");
      System.out.println(sb2); //welchelloome
    }
  }