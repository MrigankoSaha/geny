

package geny;
import java.util.Scanner ;


/**
 *
 * @author Mriganko_Saha
 */
public class Geny {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int w = sc.nextInt();
        int s = sc.nextInt();
        int t=sc.nextInt();
        int q=sc.nextInt();
        circle ob = new circle (w,s,t,q);
        ob.findradius();
        ob.findarea();
        ob.show();
        
        // TODO code application logic here
    }
    
}
