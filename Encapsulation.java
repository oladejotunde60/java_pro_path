class person {
    private String name;
    private int age; 

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String n){
        name = n;
    }
    public void setAge(int a){
        age = a;
    }

}



public class Encapsulation {
    public static void main(String a[]){

    person obj = new person();
        obj.setName("Tunde");
        obj.setAge(20);

    System.out.println(obj.getName()+" : "+obj.getAge());
    
    }
 
}
