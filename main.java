import java.util.*;
import java.io.*;
import java.text.*;

import PersonClass.*;
import StudentClass.*;
import FacultyClass.*;
import AdministratorClass.*;
import OtherClass.*;

class main
{

    public static void transfer(int i) throws Exception     //transfer
    {
        Scanner x = new Scanner(System.in);
        int id,resp;

        if(i==1)
        {
            System.out.print("\nEnter the Faculty Number to make him Administrator:");
            id = x.nextInt();

            File f = new File("Faculty/"+id);

            if(f.exists())
            {

            }

            else
            {
                System.out.print("\nSorry the Account was not found..");
            }

            System.out.print("\n\nAdministrator Added Successfully...");

        }
        else
        {

            System.out.print("\nEnter the Administrator Number to remove him from Administrator:");
            id = x.nextInt();

            File f = new File("Administrator/"+id);

            if(f.exists())
            {

                System.out.print("\n\nPerson removed Successfully...");

            }

            else
            {
                System.out.print("\nSorry the Account was not found..");
            }

        }

    }

    public static void del(int j, int i) throws Exception
    {
        String str;

        if(j==1)
        {
            str="Faculty/";

            try
            {

                File f = new File(str+i+"/Inbox");

                File [] list = f.listFiles();

                for(int k=0;k<list.length;k++)
                {
                    list[k].delete();
                }

                f.delete();

                File f1 = new File(str+i+"/Answers");

                File [] list2 = f1.listFiles();

                for(int k=0;k<list2.length;k++)
                {
                    list2[k].delete();
                }

                f1.delete();


                File f2 = new File(str+i);

                File [] list1 = f2.listFiles();

                for(int k=0;k<list1.length;k++)
                {
                    list1[k].delete();
                }

                f2.delete();



                System.out.print("\nAccount Deleted Successfully...");

            }
            catch(Exception e)
            {
                System.out.print("\nAccount not Found sorry...");
            }

        }

        else if(j==2)
        {
            str="Administrator/";

            try
            {

                File f = new File(str+i+"/Inbox");

                File [] list = f.listFiles();

                for(int k=0;k<list.length;k++)
                {
                    list[k].delete();
                }

                f.delete();

                File f1 = new File(str+i+"/Answers");

                File [] list2 = f1.listFiles();

                for(int k=0;k<list2.length;k++)
                {
                    list2[k].delete();
                }

                f1.delete();


                File f2 = new File(str+i);

                File [] list1 = f2.listFiles();

                for(int k=0;k<list1.length;k++)
                {
                    list1[k].delete();
                }

                f2.delete();



                System.out.print("\nAccount Deleted Successfully...");

            }
            catch(Exception e)
            {
                System.out.print("\nAccount not Found sorry...");
            }

        }

        else
        {
            str="Students/";

            try
            {

                File f = new File(str+i+"/Inbox");

                File [] list = f.listFiles();

                for(int k=0;k<list.length;k++)
                {
                    list[k].delete();
                }

                f.delete();


                File f2 = new File(str+i);

                File [] list1 = f2.listFiles();

                for(int k=0;k<list1.length;k++)
                {
                    list1[k].delete();
                }

                f2.delete();



                System.out.print("\nAccount Deleted Successfully...");

            }
            catch(Exception e)
            {
                System.out.print("\nAccount not Found sorry...");
            }

        }

    }

    public static void main(String[] arg) throws Exception
    {
		Person p, p1;
        int ans=1, input, inp, usr;
        String pass;
        File f1, f2, f3;
        String path1,path2,path3;
        exam exa = new exam();
        browser b = new browser();


        Scanner x = new Scanner(System.in);

        c:
        do
        {

            try
            {
                File f = new File("Administrator");

                if(!f.exists())
                {
                    throw new Exception();
                }


            }
            catch(Exception e)
            {
                File F = new File("Administrator");
                F.mkdirs();

                File F1 = new File("Faculty");
                F1.mkdirs();

                File F2 = new File("Students");
                F2.mkdirs();

                File F3 = new File("Cinbox");
                F3.mkdirs();

                File F4 = new File("Calendar");
                F4.mkdirs();
              //----------------------------------------------
                try
                {
                    int Id=0, yr, j;
                    String name;
                    char gen;
                    Date dt;
                    String blg, db;
                    String pos;
                    String eid;
                    String dummy;

                    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

                    Scanner h1=new Scanner(System.in);

                    System.out.print("\nYou Are the First Administrator of this College, So Best of Luck:-\n\n");

                    Id=0000001;
                    System.out.print("\nYour Id is:"+Id);

                    System.out.print("\n\nEnter your Full Name:");
                    name=h1.nextLine();

                    System.out.print("\nEnter your Gender(M/F):");
                    gen=h1.next().trim().charAt(0);
                    h1.nextLine();

                    System.out.print("\nEnter your Email-ID(your E-mail ID Is your Temporary Password):");
                    eid = h1.next();


                    System.out.print("\nEnter your Birth Date(DD/MM/YYYY):");
                    db=h1.next();

                    dt = df.parse(db);


                    System.out.print("\nEnter the Year of Joining:");
                    yr = h1.nextInt();


                    System.out.print("\nEnter your Blood Group:");
                    blg=h1.next();

                    h1.nextLine();

                    System.out.print("\nEnter your Position as Faculty:");
                    pos=h1.nextLine();


                    System.out.print("\nEnter number of the Subjects you would take:");
                    j=h1.nextInt();

                    h1.nextLine();

                    String[] sub=new String[j];
                    for(int l=0;l<j;l++)
                    {
                        System.out.print("\nEnter Subject "+(l+1)+":");
                        sub[l]=h1.nextLine();
                        h1.nextLine();
                    }

                    System.out.print("\nEnter number of the Classes you will Take:");
                    j=h1.nextInt();
                    h1.nextLine();

                    String[] cls=new String[j];
                    for(int l=0;l<j;l++)
                    {
                        System.out.print("\nEnter Class "+(l+1)+":");
                        cls[l]=h1.nextLine();
                        h1.nextLine();
                    }

                    Person a= new Administrator(pos,sub,cls,name,gen,blg,dt,Id,eid,yr);

                    File f=new File("Administrator/"+Id+"/Inbox");
                    f.mkdirs();

                    File f8=new File("Administrator/"+Id+"/Answers");
                    f8.mkdirs();

                    FileOutputStream fin = new FileOutputStream("Administrator/"+Id+"/"+Id+".bin");
                    ObjectOutputStream fin1 = new ObjectOutputStream(fin);

                    fin1.writeObject(a);
                    fin1.flush();
                    fin1.close();

                    FileWriter fw1 = new FileWriter("Administrator/"+Id+"/pn.bin");
                    fw1.write(0);
                    fw1.close();

                    System.out.print("\nYour Details are:-");
                    ((Administrator)a).getDetails(1,Id);

                    System.out.print("\n\n\nSuccesfully Signed Up...\n\n");

                    System.out.print("\n\n----------------------------------------------------");

                    continue c;


                }

                catch(Exception E)
                {
                    System.out.print("\nSorry Sign Up Failed, want to exit(1/2)?");
                    inp = x.nextInt();

                    if(inp==1)
                        break c;


                }


            }

            int res;

            System.out.print("\nEnter From Below:-");
            System.out.print("\n\n1).Sign In");
            System.out.print("\n2).Exit");
            System.out.print("\n\nEnter:");
            res = x.nextInt();

            if(res==2)
            {
                System.out.print("\nBye Bye, Leaving So Soon ......\n\n");
                break c;
            }

            System.out.print("\n\nUser ID:");
            usr = x.nextInt();
            System.out.print("\nPassword:");
            pass = x.next();

            path1 = "Administrator/"+usr;
            path2 = "Faculty/"+usr;
            path3 = "Students/"+usr;

            f1 = new File(path1);
            f2 = new File(path2);
            f3 = new File(path3);

            if((!f1.exists())&&(!f2.exists())&&(!f3.exists()))
            {
                System.out.print("\nSorry The User ID not found, please try again....\n");
                continue c;
            }
            else if(f1.exists())
            {
               try
               {
                    FileInputStream fin1 = new FileInputStream(path1+"/"+usr+".bin");
                    ObjectInputStream oIn1 = new ObjectInputStream(fin1);

                    p1 =(Person)oIn1.readObject();

                    oIn1.close();

                    if(!p1.getPass().equals(pass))
                    {
                        System.out.print("\nSorry You Entered Wrong Password..Try Again\n");
                        continue c;
                    }

                    else
                    {
                         System.out.print("\nSign In Successful....\n\n");

                    }

               }
               catch(Exception e)
               {
                   System.out.print("\nThere is an Error:"+e);
                   continue c;
               }

                int ans2=1;

                do
                {
                    int inpt;

                    ((Administrator)p1).notification();

                    System.out.print("\n\nEnter From The Choices Below:-");
                    System.out.print("\n1).Add Students");
                    System.out.print("\n2).Add Faculty");
                    System.out.print("\n3).Make College Calendar");
                    System.out.print("\n4).See the Inbox");
                    System.out.print("\n5).Reset the Password");        //string
                    System.out.print("\n6).See the Password");
                    System.out.print("\n7).Make the Exam");         //int 1=admin, 2=faculty
                    System.out.print("\n8).Send the Notice");
                    System.out.print("\n9).Tell more About You");   //3=admin, 2=stud, 1=fac
                    System.out.print("\n10).See more About Someone");     //see background details
                    System.out.print("\n11).Add or Remove an Administrator");       //transfer left //change details also left
                    System.out.print("\n12).See Details");      //rollno, 1,2,3
                    System.out.print("\n13).Delete an Account");
                    System.out.print("\n14).Change Details");
                    System.out.print("\n15).See the Details By the Faculty");
                    System.out.print("\n16).Exit");
                    System.out.print("\nEnter:");
                    inpt = x.nextInt();

                    switch(inpt)
                    {
                        case 1: ((Administrator)p1).addStudent();
                                break;

                        case 2: ((Administrator)p1).addFaculty();
                                break;

                        case 3: ((Administrator)p1).clgCalendar();
                                break;

                        case 4: ((Administrator)p1).showQuery();
                                break;

                        case 5: String pst;

                                System.out.print("\nEnter the New Password:");
                                pst = x.next();

                                p1.resetPass(pst);

                                FileOutputStream fout = new FileOutputStream(path1+"/"+usr+".bin");
                                ObjectOutputStream out = new ObjectOutputStream(fout);

                                out.writeObject(p1);

                                out.close();

                                break;

                        case 6: System.out.print("\nYour Password is:"+p1.getPass());
                                break;

                        case 7: ((Administrator)p1).makeExam(1);
                                break;

                        case 8: int i1;
                                System.out.print("\nEnter 1 for Common Notice and 2 for Sending Notice to Specific Student:");
                                i1=x.nextInt();

                                ((Administrator)p1).uploadNotice(i1);
                                break;

                        case 9: p1.setBackgroundDetails(3);
                                break;

                        case 10:int I1, i3;

                                System.out.print("\nEnter the ID of the Person, whose Background Details you want to see:");

                                I1 = x.nextInt();

                                System.out.print("\nEnter 1 if he/she is a Faculty, Enter 2 if he/she is a Student or else 3 for Others:");
                                i3 = x.nextInt();

                                p1.getBackgroundDetails(i3, I1);

                                break;

                        case 11:int r;

                                System.out.print("\nEnter 1 to add and 2 to delete:");
                                r = x.nextInt();

                                transfer(r);

                                break;

                        case 12:int I2, i2;
                                System.out.print("\nEnter the ID of the Person, whose Details you want to see:");

                                I1 = x.nextInt();

                                System.out.print("\nEnter 1 for others, Enter 2 if he/she is a Faculty or else 3 for Student:");
                                i3 = x.nextInt();

                                ((Administrator)p1).getDetails(i3, I1);

                                break;

                        case 13:int I3, i4;

                                System.out.print("\nEnter the ID of the Person, whom to be Deleted:");

                                I3 = x.nextInt();

                                System.out.print("\nEnter 1 if he/she is a Faculty, Enter 2 if he/she is a Administrator or else 3 for Student:");
                                i4 = x.nextInt();

                                del(i4, I3);

                                break;

                        case 14:int idd;

                                System.out.print("Enter the Id for the Person to change the Details:");
                                idd = x.nextInt();

                                ((Administrator)p1).changeDetails(idd);

                                break;

                        case 15:try
                                {
                                    b.show();
                                }
                                catch(Exception e)
                                {
                                    System.out.print("Sorry The Content was Not Uploaded");
                                }
                                finally
                                {
                                    break;
                                }




                        default: continue c;
                    }

                }while(ans2==1);
            }

            else if(f2.exists())
            {
               try
               {
                    FileInputStream fin2 = new FileInputStream(path2+"/"+usr+".bin");
                    ObjectInputStream oIn2 = new ObjectInputStream(fin2);

                    p1 =(Person)oIn2.readObject();

                    oIn2.close();

                    if(!p1.getPass().equals(pass))
                    {
                        System.out.print("\nSorry You Entered Wrong Password..Try Again\n");
                        continue c;
                    }

                    else
                    {
                         System.out.print("\nSign In Successful....\n\n");

                    }

               }
               catch(Exception e)
               {
                   System.out.print("\nThere is an Error:"+e);
                   continue c;
               }

                int ans2=1;

                do
                {
                    int inpt;

                    ((Faculty)p1).notification();
                                                                            //((Administrator)p).showQuery();

                    System.out.print("\n\nEnter From The Choices Below:-");
                    System.out.print("\n1).See the Inbox");
                    System.out.print("\n2).Reset the Password");        //string
                    System.out.print("\n3).See the Password");
                    System.out.print("\n4).Make the Exam");         //int 1=admin, 2=faculty
                    System.out.print("\n5).Send the Notice");
                    System.out.print("\n6).Tell more About You");   //3=admin, 2=stud, 1=fac
                    System.out.print("\n7).See more About Someone");     //see background details
                    System.out.print("\n8).See Details");
                    System.out.print("\n9).See Materials By the Faculty");
                    System.out.print("\n10).Exit");
                    System.out.print("\nEnter:");
                    inpt = x.nextInt();

                    switch(inpt)
                    {

                        case 1: ((Faculty)p1).showQuery();
                                break;

                        case 2: String pst;

                                System.out.print("\nEnter the New Password:");
                                pst = x.next();

                                p1.resetPass(pst);

                                FileOutputStream fout = new FileOutputStream(path2+"/"+usr+".bin");
                                ObjectOutputStream out = new ObjectOutputStream(fout);

                                out.writeObject(p1);

                                out.close();

                                break;

                        case 3: System.out.print("\nYour Password is:"+p1.getPass());
                                break;

                        case 4: ((Faculty)p1).makeExam(2);
                                break;

                        case 5: int i1;
                                System.out.print("\nEnter 1 for Common Notice and 2 for Sending Notice to Specific Student:");
                                i1=x.nextInt();

                                ((Faculty)p1).uploadNotice(i1);
                                break;

                        case 6: p1.setBackgroundDetails(1);
                                break;

                        case 7: int I1, i3;

                                System.out.print("\nEnter the ID of the Person, whose Background Details you want to see:");

                                I1 = x.nextInt();

                                System.out.print("\nEnter 1 if he/she is a Faculty, Enter 2 if he/she is a Student or else 3 for Others:");
                                i3 = x.nextInt();

                                p1.getBackgroundDetails(i3, I1);

                                break;

                        case 8: int I2, i2;
                                System.out.print("\nEnter the ID of the Person, whose Details you want to see:");

                                I1 = x.nextInt();

                                System.out.print("\nEnter 1 for others, Enter 2 if he/she is a Faculty or else 3 for Student:");
                                i3 = x.nextInt();

                                ((Faculty)p1).getDetails(i3, I1);

                                break;

                        case 9:try
                               {
                                  b.show();
                               }
                               catch(Exception e)
                               {
                                   System.out.print("Sorry The Content was Not Uploaded");
                               }
                               finally
                               {
                                   break;
                               }


                        default: continue c;
                    }

                }while(ans2==1);
            }

            else
            {
               try
               {
                    FileInputStream fin2 = new FileInputStream(path3+"/"+usr+".bin");
                    ObjectInputStream oIn2 = new ObjectInputStream(fin2);

                    p1 =(Person)oIn2.readObject();

                    oIn2.close();

                    if(!p1.getPass().equals(pass))
                    {
                        System.out.print("\nSorry You Entered Wrong Password..Try Again\n");
                        continue c;
                    }

                    else
                    {
                         System.out.print("\nSign In Successful....\n\n");

                    }

               }
               catch(Exception e)
               {
                   System.out.print("\nThere is an Error:"+e);
                   continue c;
               }

                int ans2=1;

                do
                {
                    int inpt;

                    ((Student)p1).notification();
                                                                            //((Administrator)p).showQuery();

                    System.out.print("\n\nEnter From The Choices Below:-");
                    System.out.print("\n1).See the Notice");
                    System.out.print("\n2).Reset the Password");        //string
                    System.out.print("\n3).See the Password");
                    System.out.print("\n4).Send the Query");
                    System.out.print("\n5).Tell more About You");   //3=admin, 2=stud, 1=fac
                    System.out.print("\n6).See more About Someone");     //see background details
                    System.out.print("\n7).See your Details");
                    System.out.print("\n8).Take Quiz");
                    System.out.print("\n9).See the College Calendar");
                    System.out.print("\n10).See the Materials By the Faculty");
                    System.out.print("\n11).Exit");
                    System.out.print("\nEnter:");
                    inpt = x.nextInt();

                    switch(inpt)
                    {

                        case 1: ((Student)p1).readNotice();
                                break;

                        case 2: String pst;

                                System.out.print("\nEnter the New Password:");
                                pst = x.next();

                                p1.resetPass(pst);

                                FileOutputStream fout = new FileOutputStream(path3+"/"+usr+".bin");
                                ObjectOutputStream out = new ObjectOutputStream(fout);

                                out.writeObject(p1);

                                out.close();

                                break;

                        case 3: System.out.print("\nYour Password is:"+p1.getPass());
                                break;

                        case 4:((Student)p1).query();
                                break;

                        case 5: p1.setBackgroundDetails(1);
                                break;

                        case 6: int I1, i3;

                                System.out.print("\nEnter the ID of the Person, whose Background Details you want to see:");

                                I1 = x.nextInt();

                                System.out.print("\nEnter 1 if he/she is a Faculty, Enter 2 if he/she is a Student or else 3 for Others:");
                                i3 = x.nextInt();

                                p1.getBackgroundDetails(i3, I1);

                                break;

                        case 7: ((Student)p1).showThisDetails();

                                break;

                        case 8: exa.Method();

                                break;

                        case 9:((Student)p1).showCalendar();

                                break;

                        case 10:try
                                {
                                   b.show();
                                }
                                catch(Exception e)
                                {
                                   System.out.print("Sorry The Content was Not Uploaded");
                                }
                                finally
                                {
                                   break;
                                }


                        default: continue c;
                    }

                }while(ans2==1);
            }






        }while(ans==1);


    }
};
