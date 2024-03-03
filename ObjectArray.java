class Student{
    int rollno;
    String name;
    int marks;
}

public class ObjectArray {
    
public static void main(String args[]){

    Student s1 = new Student();
    s1.rollno = 1;
    s1.name = "Tunde";
    s1.marks = 98;

    Student s2 = new Student();
    s2.rollno = 2;
    s2.name = "Ife";
    s2.marks = 97;

    Student s3 = new Student();
    s3.rollno = 3;
    s3.name = "Emmanuel";
    s3.marks = 96;

    Student s4 = new Student();
    s4.rollno = 4;
    s4.name = "Oreofe";
    s4.marks = 96;

    Student students[] = new Student[4];
    students[0] = s1;
    students[1] = s2;
    students[2] = s3;
    students[3] = s4;

    // for(int i=0; i<students.length; i++)
    // {
        
    //     System.out.println(students[i].rollno + " " + students[i].name + " : " + students[i].marks);
    
    // }
    for(Student stud : students){
        System.out.println(stud.rollno + " " + stud.name + " : " + stud.marks);

    }

// int nums[] = new int[7];
// nums[0] = 6;
// nums[1] = 1;
// nums[2] = 5;
// nums[3] = 9;

// for(int i=0; i<nums.length; i++){
//     System.out.println(nums[i]);
// }

}

}
