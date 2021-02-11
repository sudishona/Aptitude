class RightDiagonal
{
public static void main(String a[])
{
for(int num=0;num<=4;num++)
{
for(int num1=1;num1<=4;num1++)
{
//if (num<=num1)
//if(num+num1<=5)
if(num==num1)
{
//System.out.print(num+""+num1+"");
System.out.print("*"+"");
}
else
{
System.out.print("   ");
}
}
System.out.println();
}
}
}