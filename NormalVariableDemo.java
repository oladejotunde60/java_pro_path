class Mobile {

    String brand;
    int price;
    String network;
    String name;

    public void show(){
        System.out.println(brand + " : "+ price + " : "+ name);
    }

}

public class NormalVariableDemo {

        public static void main(String a[]) {

            Mobile obj2 = new Mobile();
            obj2.brand = "Apple";
            obj2.price = 1500;
            obj2.name = "SmartPhone";

            Mobile obj1 = new Mobile();
            obj1.brand = "Tecno";
            obj1.price = 1700;
            obj1.name = "SmartPhone";

            obj2.show();
            obj1.show();



        }
            

}
