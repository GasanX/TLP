import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        double x1, x2, x3, y1, y2, y3, z1, z2, z3;
        Scanner sc = new Scanner(System.in);


        x1 = sc.nextDouble();
        x2 = sc.nextDouble();
        x3 = sc.nextDouble();
        y1 = sc.nextDouble();
        y2 = sc.nextDouble();
        y3 = sc.nextDouble();
        z1 = sc.nextDouble();
        z2 = sc.nextDouble();
        z3 = sc.nextDouble();


        Point3d d = new Point3d(x1,y1,z1);
        Point3d e = new Point3d(x2, y2, z2);
        Point3d k = new Point3d(x3,y3,z3);
//System.out.print(a+" "+b+" "+c);
        if(!d.equals(e)&&!e.equals(k)&&!k.equals(d)){
            System.out.print( computeArea(d, e, k));
        }
        else{
            System.out.print("Точки равны");
        }


    }
    public static double computeArea(Point3d d, Point3d e, Point3d k){
        double AB = d.distanceTo(e);
        double AC = d.distanceTo(k);
        double BC = e.distanceTo(k);
        double p = (AB+AC+BC)/2;
        return Math.sqrt(p*(p-AB)*(p-AC)*(p-BC));
    }

}

