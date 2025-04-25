public class Constructor{

    public static void main(String args[]){
        Student s1 = new Student();
        // copy constructor
        s1.name = "klamuddin";
        s1.roll = 456;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 99;
        s1.marks[2] = 98;
       

        Student s2 = new Student(s1); // copy
        s2.password = "xyz";

        for(int i=0; i<3; i++){
            System.out.println(s2.marks[i]);
        }

        
    }
}
// constructor hai
class Student{
    String name;
    int roll;
    String password;
    // int marks[];


















































































     // copy constructor
    // Student(Student s1){                    
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
        
    // }
    // Deep copy constructor 
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i=0; i<marks.length; i++){
            this.marks[i] = s1.marks[i];
        }
    }
// yah non parameterized constructor hai
    Student(){
         marks = new int[3];
        System.out.println("Constructor is called");
    }
// yah parameterized constructor hai
    Student(String name){
         marks = new int[3];
        this.name = name;
    }
    Student(int roll){
         marks = new int[3];
        this.roll = roll;
    }

}