public class MutImmut {
    public static void main(String args[]){
        String name = "Tunde";
        name = name + " Oladejo";
        System.out.println("Hello " + name);
        String s1 = "Olad";
        String s2 = "olad";
        System.out.println(s1 == s2);
    }
}
