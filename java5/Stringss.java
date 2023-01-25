class Stringss
  {
    
public static void main(String args[])
{
String str="Helo welcome to bitlabs";
char ch[]=new char[7];
str.getChars(5,12,ch,0);
System.out.println(ch);
}
}
/*valueOf()
class Operations
{
public static void main(String args[])
{
int a=123;
String s=String.valueOf(a);
System.out.println(s);
System.out.println(a+23);
System.out.println(s+23);
}
}
/*substring()
class Operations
{
public static void main(String args[])
{
String s="welcome to bitlabs";
System.out.println(s.substring(3)); //come to bitlabs
System.out.println(s.substring(0,7)); //welcome
System.out.println(s.substring(8,10));//to

}
}
/*trim()
class Operations
{
public static void main(String args[])
{
String s=" welcome ";
String s1=" Bitlabs welcome ";
System.out.println(s1.trim()); //welcome
System.out.println(s.trim());//Bitlabs welcome

}
}
/*toLowerCase() and to UpperCase()
class Operations
{
public static void main(String args[])
{
String s1="Bitlabs";
System.out.println(s1.toLowerCase());
System.out.println(s1.toUpperCase());


}
}
/*toCharArray()
class Operations
{
public static void main(String args[])
{
String s1="welcome to bitlabs";
char ch[]=s1.toCharArray();
for(int i=0;i<ch.length;i++)
{
System.out.println(ch[i]);
}

}
}
/*oCharArray()
class Operations
{
public static void main(String args[])
{
String s1="welcome";
char ch[]=s1.toCharArray();
for(int i=0;i<ch.length;i++)
{
System.out.println(ch[i]);
}


}
}*/
/*split()
class Operations
{
public static void main(String args[])
{
String s1="learning made easy";
String s[]=s1.split("a");
for(int i=0;i<s.length;i++)
{
System.out.println(s[i]);
}
}
}*/
/*split()
class Operations
{
public static void main(String args[])
{
String s1="welcome to bit labs";
String s[]=s1.split(" ");
for(int i=0;i<s.length;i++)
{
System.out.println(s[i]);
}
}
}
/*replace() and replaceAll()
class Operations
{
public static void main(String args[])
{
String s1="welcome to bilabs";
System.out.println(s1.replace("e","a"));
System.out.println(s1.replace("come","go"));
System.out.println(s1.replaceAll(" ",","));
System.out.println(s1.replace(" ",""));
}
}
/*isEmpty()
class Operations
{
public static void main(String args[])
{
String s="welcome";
String s1=""; //empty string
System.out.println(s.isEmpty()); //false
System.out.println(s1.isEmpty()); //true

}
}*/
/*getBytes()
class Operations
{
public static void main(String args[])
{
String s="abcd";
byte b[]=s.getBytes();
for(int i=0;i<b.length;i++)
{
System.out.println(b[i]);
}
}
}*/
/*equals() and == operator
class Operations
{
public static void main(String args[])
{
String s1="hello";
String s2="hello";
String s=new String("hai");
String s3=new String("hai");
System.out.println(s1.equals(s2)); //true
System.out.println(s1==s2); //true
System.out.println(s.equals(s3)); //true
System.out.println(s==s3); //false

}
}*/
/*equals() & equalsIgnoreCase()
class Operations
{
public static void main(String args[])
{
String s1="hello";
String s2="hello";
String s3="welcome";
String s4="Hello";
System.out.println(s1.equals(s2));//true
System.out.println(s1.equals(s3));//false
System.out.println(s1.equals(s4)); //false
System.out.println(s1.equalsIgnoreCase(s4));








}
}*/
/*start With()
class Operations
{
public static void main(String args[])
{
// String s1="hello";
// String s2="hello";
String s3="welcome";
// String s4="apple";
System.out.println(s3.startsWith("me")); //false
System.out.println(s3.startsWith("w")); //true
System.out.println(s3.startsWith("wel")); //true
}
}*/
/*endsWith()
class Operations
{
public static void main(String args[])
{
// String s1="hello";
// String s2="hello";
String s3="welcome";
// String s4="apple";
System.out.println(s3.endsWith("me"));//true
System.out.println(s3.endsWith("ma")); //false
System.out.println(s3.endsWith("come")); //true
}
}*/
/*contains()
class Operations
{
public static void main(String args[])
{
// String s1="hello";
// String s2="hello";
String s3="welcome";
// String s4="apple";
System.out.println(s3.contains("a")); //false
System.out.println(s3.contains("we"));//true
System.out.println(s3.contains("lac"));//false

}
}*/
/*concat()
class Operations
{
public static void main(String args[])
{
String s1="hello";
String s2="hello";
String s3="welcome";
String s4="apple";
System.out.println(s1.concat(s3));
System.out.println(s1.concat("hai"));
System.out.println(s1.concat(s2).concat(s3));

}
}*/

/*compareTo
class Operations
{
public static void main(String args[])
{
String s1="hello";
String s2="hello";
String s3="welcome";
String s4="apple";
System.out.println(s1.compareTo(s2)); //0
System.out.println(s1.compareTo(s3)); //-15
System.out.println(s1.compareTo(s4)); //7

}
}*/
/* to find the complete name of character

class Operations
{
public static void main(String args[])
{
String s="welcome";
// System.out.println("length of the string is :"+s.length());
for(int i=0;i<s.length();i++)
{

System.out.println(s.charAt(i));
}
}
}*/
/* to find the length
class StringEx
{
public static void main(String args[])
{
String s="welcome";
System.out.println("length of the string is :"+s.length());
}
}*/
/*class StringEx
{
public static void main(String args[])
{
String s1=new String("praveen");
String s=new String("kumar");
String s2="kumar";
String s3="praveen";
System.out.println(s1);
System.out.println(s2);
System.out.println(s3);
System.out.println(s);
}
}*/