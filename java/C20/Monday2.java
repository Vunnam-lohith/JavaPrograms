class Monday2
  {
    public static void main(String[]args)
    {
      int a[]={6,7,8,9,4,7,7,8};
      int count;
      int n=a.length;
      boolean vis[]=new boolean[n];
      System.out.println("the array elements are \n");
      for(int i=0;i<n;i++)
        {
          vis[i]=false;
        System.out.print(" "+a[i]+" ");
        }
       System.out.println("\n");
   
      for(int i=0;i<a.length;i++)
        {
          count=1;
          if(vis[i]==true)
            continue;
          for(int j=i+1;j<a.length;j++)
            {
              if(a[i]==a[j])
              {
                count++;
                vis[j]=true;
              }
            }
          System.out.println("frequency of "+a[i]+" is "+count+"\n");
        }
    }
  }