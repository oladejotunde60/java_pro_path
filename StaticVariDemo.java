class MobilePhone {

    String brand;
    int price;
    String network;
   static String name;

    public void show(){
        System.out.println(brand + " : "+ price + " : "+ name);
    }

}

public class StaticVariDemo {

        public static void main(String a[]) {

            MobilePhone obj2 = new MobilePhone();
            obj2.brand = "Apple";
            obj2.price = 1500;
            MobilePhone.name = "SmartPhone";

            MobilePhone obj1 = new MobilePhone();
            obj1.brand = "Tecno";
            obj1.price = 1700;
            MobilePhone.name = "SmartPhone";

            MobilePhone.name = "Phone";

            obj2.show();
            obj1.show();



        }
            

}
