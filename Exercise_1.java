//java program-2


import java.util.Scanner;
public class Exercise_1
{
 
public static void main(String [] args)

{

Scanner s=new Scanner(System.in);
double radius=s.nextDouble();
double perimeter;
double area;

if(radius<=0)
{
System.out.println(" Please enter non zero positive number");
}

else
{
perimeter=Math.PI*2*radius;
area=Math.PI*radius*radius;                                                                                                                                       
}

System.out.println(area);
System.out.println(perimeter);
}
}