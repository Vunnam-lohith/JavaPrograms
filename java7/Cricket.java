class Match
  {
    String name;
    int runs;
    public void setName(String name)
    {
      this.name=name;
    }
   public String getName()
    {
      return name;
    }
    public void setRuns(int runs)
    {
      this.runs=runs;
    }
    public int getRuns()
    {
      return runs;
    }
  }
class SetGet
  {
    public static void main(String args[])
    {
      Match mt=new Match();
      mt.setName("Dhoni");
      String sname=mt.getName();
      System.out.println("Player name :- "+sname);
      mt.setRuns(186);
      System.out.println("best score:- "+mt.getRuns());
    }
  }