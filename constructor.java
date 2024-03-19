class person {
    private String name;
    private int age; 

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

    //CONSTRUCTOR
    public person(){
        name = "Tunde";
        age = 15;
    }

}

public class constructor {
    public static void main(String a[]){

    person obj = new person();

        // obj.setName("Tunde");
        // obj.setAge(20);

    System.out.println(obj.getName()+" : "+obj.getAge());
    
    }
 
}
