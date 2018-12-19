/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geny;

/**
 *
 * @author Mriganko_Saha
 */
public class plane {
    protected int x1;
    protected int y1;
    plane (int nx,int ny)
    {
        x1=nx;
        y1=ny;
    }
    void show()
    {
        System.out.println(x1 + "," + y1);
    }
}
 class circle extends plane 
 {
     int x2;
     int y2;
     double radius;
     double area;
     circle (int a ,int b,int m, int n)
     {
         super(a,b);
         x2=n;
         y2=m;
         radius =0.0d ;
         area =0.0d;
     }
             void findradius()
             {
                 radius= (Math.sqrt(Math.pow((x2-super.x1),2)+Math.pow((y2-super.y1),2))/2) ;
                 
             }
             void findarea ()
             {
                 area= (22/7) * radius * radius ;
                 
             }
             void show()
             {
                 super.show();
                 System.out.println(x2+","+y2);
                 System.out.println("radius="+ radius);
                 System.out.println("area="+area);
                         
             }
 }

