/**
 * Created by svitlana.masanovets on 2/28/2016.
 */
public class SquareEquation {


    public static void main(String[] args) {
        SquareEquation test1 = new SquareEquation();
        double a, b, c;
        a = 0;
        b = 1;
        c = 1;


   /* public void doEquation(double a,b,c) {
        this.a = a;
        this.b = b;
        this.c = c;
*/
        double d, x1, x2;

        if ((a == 0) & (b == 0) & (c == 0)) {
            System.out.println("There are plenty of resolutions [-infinity;+infinity]");
        } else if ((a == 0) & (b == 0)) {
            System.out.println("There are no resolution");
        } else if ((a == 0) && (b != 0)) {
            x1 = -c / b;
            System.out.println("There is one resolution x=" + x1);
        } else {
            d = Math.pow(b, 2) - 4 * a * c;

            if (d < 0.0) {
                System.out.println("There are no resolution");
            } else if (d == 0) {
                x1 = -b / (2 * a);
                System.out.println("There is one resolution x=" + x1);
            } else if (d > 0) {
                x1 = (-b - Math.sqrt(d)) / (2 * a);
                x2 = (-b + Math.sqrt(d)) / (2 * a);
                System.out.println("First resolution is x1=" + x1);
                System.out.println("Second resolution is x2=" + x2);
            }
        }
    }
}
