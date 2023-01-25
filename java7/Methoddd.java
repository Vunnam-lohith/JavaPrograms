class employe
  {
    String name;
    int id;
    String adress;
    public void setName(String name)
    {
      this.name=name;
    }
    public String getName()
    {
      return name;
    }
    public void setId(int id)
    {
      this.id=id;
    }
    public int getId()
    {
      return id;
    }
    public void setAdress(String adress)
    {
      this.adress=adress;
    }
    public String getAdress()
    {
      return adress;
    }
  }
class Ex
  {
    public static void main(String args[])
    {
      employe st=new employe();
      st.setName("praveen");
      String sname=st.getName();
      System.out.println(sname);
      st.setId(55);
      System.out.println(st.getId());
      st.setAdress("vijayawada");
      System.out.println(st.getAdress());
    }
  }