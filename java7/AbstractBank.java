abstract class Bank
  {
    abstract public int rateOfInterest();
  }
class SBI extends Bank
  {
    public int rateOfInterest()
    {
      return 7;
    }
  }
class PNB extends Bank
  {
    public int rateOfInterest()
    {
      return 12;
    }
  }
class AbstractEx1
  {
    public static void main(String args[])
    {
      SBI sb=new SBI();
      PNB pb=new PNB();
      System.out.println("rate of interest for sbi is:"+sb.rateOfInterest()+"%");
      System.out.println("rate of interest for sbi is:"+pb.rateOfInterest()+"%");
      
    }
  }