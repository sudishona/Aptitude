class Triangle
{
public static void main(String a[])
{
Triangle s=new Triangle();
s.triangle(9);
}
void triangle(int n){
int mid=n/2;
//for(int i=0;i<n;i++)
for(int i=0;i<n-(n/3);i++)
{
for(int j=0;j<n;j++)
{
if(i+j==mid || i==mid ||j-i==mid)
{
System.out.print(" * ");
}
else
{
System.out.print("   ");
}
}
System.out.println("");
}
}
}