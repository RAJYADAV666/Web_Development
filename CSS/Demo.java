import java . util.*;
class Demo
{
   public static void main(String arg[])
   {
     Scanner sobj = new Scanner(System.in);

    int No1=0;
    int No2=0;
    int Ans=0;

    System.out.println("Enter the First Number");
    No1=sobj.nextInt();

    System.out.println("ENter the Second Number");
    No2=sobj.nextInt();

    Arithmatic aobj = new Arithmatic(No1,No2);

   Ans= aobj.Addtion();
   System.out.println("Addtion is :" +Ans);

   Ans=aobj.Subtraction();
   System.out.println("Subtraction is :" +Ans);
   }
}
class Arithmatic
{
    public int Value1;
    public int Value2;

    Arithmatic(int No1,int No2)
    {
        Value1=No1;
        Value2=No2;  
    }

    int Addtion()
    {
        int iAns=0;

        iAns=Value1+Value2;
        return iAns;
    }
    int Subtraction()
    {
        int iAns=0;

        iAns=Value1- Value2;
        return iAns;
    }

}