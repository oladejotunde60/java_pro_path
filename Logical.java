public class Logical {
    public static void main(String[] args) {
        int a = 4;
        int b = 6;
        int x = 9;
       int y = 3;
       boolean result = a < b || x > y;
       boolean result2 = a < b && x > y;
       boolean result3 = a < b || x > y;
       System.out.println(result);
       System.out.println(result2);
       System.out.println(!result3);




    }
}
