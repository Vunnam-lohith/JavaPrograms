class Method4 { 
  int x=20;
  //Instance variable 
  static int y=39; 
  public static void main(String args[]) 
  {
    ExMethod obj=new ExMethod(); 
    // Creating the object and allocating the memory or space by using new keyword
    System.out.println("the value is:"+obj.x);
    System.out.println("the value is:"+ExMethod.y); 
    System.out.println("the value is:"+y);
  }
}