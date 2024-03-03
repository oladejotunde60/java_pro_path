import java.lang.Math;

class squareroot {
    // int a;
    public double root(double n1) {
       double r = n1;
       return Math.sqrt(r);
    }
}

public class Sqrt {
    public static void main(String args[]) {
    int num1 = 9;
    squareroot findroot = new squareroot();
    double result = findroot.root(num1);
    System.out.println(result);
}
}
