class calculator
{
public int add(int n1, int n2, int n3)
{
    return n1 + n2 + n3;
}

public int add(int n1, int n2)
{
    return n1 + n2;
}

public double add(double n1, int n2)
{
    return n1 + n2;
}

}

public class methodOverload {

    public static void main(String args[])
    {
    calculator calc = new calculator();
   int r1 = calc.add(2, 4, 6);
   int r2 = calc.add(2, 3);
  double  r3 = calc.add(4.0, 2);
    System.out.println(r1);
    System.out.println(r2);
    System.out.println(r3);
    }



    
    
}
