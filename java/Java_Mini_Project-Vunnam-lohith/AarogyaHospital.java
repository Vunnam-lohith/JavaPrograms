//package aarogya_hospital;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Iterator;

public class AarogyaHospital
{
  static int count=100;
  
  class AarogyaMember
  {
    Scanner sc=new Scanner(System.in);
    String name,gender,city,address,date_of_admission,guardian_name,guardian_address;
    int age,id;
    long aadhar_card_number,contact_number,guardian_contact_number;

     public AarogyaMember()
    {
      count++;
      id=count;
    }
    
    public void input()
    {
      System.out.println("Patient's Information : ");
      System.out.println("Enter the name of the patient : ");
      name=sc.next();
      System.out.println("Enter the age of the patient : ");
      age=sc.nextInt();
      System.out.println("Enter the gender of the patient : ");
      gender=sc.next();
      System.out.println("Enter the aadhar card number of the patient : ");
      aadhar_card_number=sc.nextLong();
      System.out.println("Enter the contact number of the patient : ");
      contact_number=sc.nextLong();
      System.out.println("Enter the city of the patient : ");
      city=sc.next();
      System.out.println("Enter the address of the patient : ");
      address=sc.next();
      System.out.println("Enter the date of admission of the patient : ");
      date_of_admission=sc.next();
      System.out.println("Guardian's Information : ");
      System.out.println("Enter the guardian name of the patient : ");
      guardian_name=sc.next();
      System.out.println("Enter the guardian address of the patient : ");
      guardian_address=sc.next();
      System.out.println("Enter the guardian contact number of the patient : ");
      guardian_contact_number=sc.nextLong();
      System.out.println("Patient details added successfully with id number "+id);
    }
  }
  static void display(AarogyaHospital.AarogyaMember patient)
  {
    System.out.println("Patient details");
    System.out.println("Patient's id : "+patient.id);
    System.out.println("Patient's name : "+patient.name);
    System.out.println("Patient's age : "+patient.age);
    System.out.println("Patient's gender : "+patient.gender);
    System.out.println("Patient's city : "+patient.city);
    System.out.println("Patient's address : "+patient.address);
    System.out.println("Patient's aadhar card number : "+patient.aadhar_card_number);
    System.out.println("Patient's contact number : "+patient.contact_number);
    System.out.println("Patient's date of admission : "+patient.date_of_admission);
    System.out.println("Guardian details");
    System.out.println("Guardian's name : "+patient.guardian_name);
    System.out.println("Guardian's address : "+patient.guardian_address);
    System.out.println("Guardian's contact number : "+patient.guardian_contact_number);
  }
  static long choices()
  {
    System.out.println("Press 1 for adding new member");
    System.out.println("Press 2 to view list of all available members");
    System.out.println("Press 3 to search member by ID");
    System.out.println("Press 4 to search member from a particular city");
    System.out.println("Press 5 to search member from a particular age group");
    System.out.println("Press 6 to mark recovery of a member");
    System.out.println("Press 7 to delete data of a member");
    System.out.println("Press 0 to exit");
    Scanner ip=new Scanner(System.in);
    System.out.println("choose the option between 0 to 7 : ");
    long option=ip.nextLong();
    return option;
    }
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    AarogyaHospital ah=new AarogyaHospital();
    ArrayList<AarogyaMember> al=new ArrayList<AarogyaMember>();
    Iterator<AarogyaMember> itr=al.iterator();
    boolean found=false;
    while(true)
        {
          long option=choices();
          if(option<0||option>7)
          {
            System.out.println("Invalid input try again");
          }
          else if(option==1)
          {
            AarogyaHospital.AarogyaMember am=ah.new AarogyaMember();
            am.input();
            al.add(am);
          }
          else if(option==2)
          {
            itr=al.iterator();
            while(itr.hasNext())
            {
              AarogyaHospital.AarogyaMember am1=itr.next();
              display(am1);
            }
          }
          else if(option==3)
          {
            found=false;
            System.out.println("enter id number to search the patient : ");
            int id=s.nextInt();
            itr=al.iterator();
            while(itr.hasNext())
            {
              AarogyaHospital.AarogyaMember am2=itr.next();
              if(am2.id==id)
              {
                display(am2);
                found=true;
              }
            }
            if(found==false)
            {
              System.out.println("there is no patient with the entered id");
            }
          }
          else if(option==4)
          {
            found=false;
            System.out.println("enter city name to search the patient : ");
            String city=s.next();
            itr=al.iterator();
            while(itr.hasNext())
            {
              AarogyaHospital.AarogyaMember am3=itr.next();
              if(am3.city.equals(city))
              {
                display(am3);
                found=true;
              }
            }
            if(found==false)
            {
              System.out.println("there is no patient with the entered city name");
            }
          }
          else if(option==5)
          {
            found=false;
            System.out.println("enter age to search the patient : ");
            int age=s.nextInt();
            itr=al.iterator();
            while(itr.hasNext())
            {
              AarogyaHospital.AarogyaMember am4=itr.next();
              if(am4.age==age)
              {
                display(am4);
                found=true;
              }
            }
            if(found==false)
            {
              System.out.println("there is no patient with the entered age");
            }
          }
          else if(option==6)
          {
            boolean recovered=false;
            System.out.println("enter the id to search the recovered patient : ");
            int id=s.nextInt();
            itr=al.iterator();
            while(itr.hasNext())
            {
              AarogyaHospital.AarogyaMember am5=itr.next();
              if(am5.id==id)
              {
                display(am5);
                recovered=true;
                System.out.println("this patient has recoverd "+id);
              }
            }
            if(recovered==false) 
            {
              System.out.println("there is no patient recovered with the entered id");
            }
          }
          else if(option==7)
          { 
            System.out.println("enter the id to delete the patient from the list : ");
            int id=s.nextInt();
            itr=al.iterator();
            while(itr.hasNext())
            {
              AarogyaHospital.AarogyaMember am6=itr.next();
              if(am6.id==id)
              {
                itr.remove();
              }
            }
          }
          else
          {
            break;
          }
        }
  }
}
