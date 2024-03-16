class MobilePhone {

    String brand;
    int price;
    String network;
   static String name;

    // public void show(){
    //     System.out.println(brand + " : "+ price + " : "+ name);
    // }

        public static void show1(MobilePhone obj){

            System.out.println(obj.brand + " : "+ obj.price + " : "+ name);

        }
}

public class StaticMethod {

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

            // obj2.show();
            // obj1.show();
            MobilePhone.show1(obj2);
            MobilePhone.show1(obj1);


        }
            

}
