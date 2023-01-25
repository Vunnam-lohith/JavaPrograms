class MyRunnable extends Runnable{
  public void run(){
    for (int i=0;i<10;i++){
      System.out.println("child Thread");
    }
  }
}
 class Thread{
  public static void main(String[]args){
    MyRunnable obj=new MyRunnable();
    Thread obj2=new Thread(obj);
    obj2.start();
    for(int i=0;i<10;i++){
      System.out.println("main Thread");
    }
  }
}