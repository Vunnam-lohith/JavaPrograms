//array sort in acc order
/*import java.util.*;
class Monday4
  {
    static int array_sort(int[] a)
    {
      
      for(int i=0;i<a.length;i++)
        {
          for(int j=i+1;j<a.length;j++)
            {
              int temp=0;
              if(a[i]>a[j])
              {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
              }
            }//return a[i];
          System.out.print(a[i]+" ");
        }return a[0];
    }
    public static void main(String[]args)
    {
      Scanner ntr=new Scanner(System.in);
      System.out.println("Enter the size of the array");
      int n=ntr.nextInt();
      int arr[]=new int[n];
      System.out.println("Enter the elements into the array");
      Monday4 obj=new Monday4();
      for(int i=0;i<arr.length;i++)
        {
          arr[i]=ntr.nextInt();
          
        }
      System.out.println();
      obj.array_sort(arr);
    }
  }*/
import java.util.*;
class Monday4
  {
    public static int sort()
    {
      
      char a[]=s.toCharArray();
       for(int i=0;i<a.length;i++)
        {
          for(int j=i+1;j<a.length;j++)
            {
              char temp='0';
              if(a[i]>a[j])
              {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
              }
            }
          System.out.println(a[i]);        
        }return a[0];
  
    }
    public static void main(String[]args)
    {
      Scanner ntr=new Scanner(System.in);
      System.out.println("ENter the first string value");
      String s1=ntr.nextLine();
      System.out.println("Enter the second string value");
      String s2=ntr.nextLine();
      Monday4 obj=new Monday4();
      
      if(s1.length()==s2.length())
      {
        obj.sort();
        obj.sort();
        System.out.println("The Given Strings Are Anagrams");
      }else
      {
        System.out.println("The Given Strings Are Not Anagrams");
      }
    }
   /* public static void main(String[]args)
    {
      Scanner ntr=new Scanner(System.in);
      System.out.println("ENter the first string value");
      String s1=ntr.nextLine();
      System.out.println("Enter the second string value");
      String s2=ntr.nextLine();
      if(s1.length()==s2.length())
      {
        char ch1[]=s1.toCharArray();
        char ch2[]=s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        String str1=new String(ch1);
        String str2=new String(ch2);
        if(str1.equals(str2))
        {
          System.out.println("The Given Strings Are Anagrams");
        }
        else
          System.out.println("The Given Strings Are Not Anagrams");
        
      }else
      {
        System.out.println("The Given Strings Are Not Anagrams");
      } 
    }*/
  }