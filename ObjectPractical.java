class calculator {
    // int a;
    public int add(int n1, int n2) {
       int r = n1 + n2;
       return r;
    }
}

public class ObjectPractical {
    public static void main(String args[]) {
    int num1 = 5;
   int num2 = 9;
    calculator calc = new calculator();
    int result = calc.add(num1, num2);
    System.out.println(result);
}
}
