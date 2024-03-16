class MobilePhone {

    String brand;
    int price;
    String network;
   static String name;

   //Static Block
   static {
    name = "Phone";
    System.out.println("This is the static block");
   }

   //Constructor
   public MobilePhone(){
    brand = "";
    price = 200;
    System.out.println("This is the constructor block");
   }

    // public void show(){
    //     System.out.println(brand + " : "+ price + " : "+ name);
    // }



public class StaticBlock {

        public static void main(String a[]) throws ClassNotFoundException{

            String className;
            Class.forName(className="MobilePhone");
            // MobilePhone obj2 = new MobilePhone();
            // obj2.brand = "Apple";
            // obj2.price = 1500;
            // MobilePhone.name = "SmartPhone";

            // MobilePhone obj1 = new MobilePhone();

           // MobilePhone.name = "Phone";

            // obj2.show();
            // obj1.show();


        }
            

}
