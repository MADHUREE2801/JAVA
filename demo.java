class circle
{
    double x,y,r;
    void setpoint(double x,double y, double r)
    {
        this.x=x;
        this.y=y;   //this keyword has to be used when class variables and function argument variables are same.
        this.r=r;  //if this keyword is not used,it results in ambiguity.Answer comes out to be wrong
    }
    double area()
    {
        double a;
        a=3.14*r*r;
        return a;
    }
}



public class demo{

     public static void main(String []args){
         circle c=new circle();
         c.setpoint(1,1,2.0);
         
        System.out.println("area is:"+c.area());
     }
}