class Method7
  {
    String ename;
    int eid;
    Employee(String ename,int eid)
    {
      this.ename=ename;
      this.eid=eid;
    }
    public void display()
    {
      System.out.println(ename+" "+eid);
    }
    public static void main(String args[])
    {
      Employee e1=new Employee("raj kumar",101);
      Employee e2=new Employee("anitha",102);
      e1.display();
      e2.display();
    }
  }