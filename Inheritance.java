public class Inheritance{
    public static void main(String args[]){
        Fish shark = new Fish();
        shark.eat();
       
        // dobby.legs = 4;
        // System.out.println(dobby.leg Dog dobby = new Dog();
        // dobby.eat();

    }
}
// Base class
class Animal{
    String color;
    void eat(){
    System.out.println("eats");

}
  void breath(){
      System.out.println("breaths");
  }
  }
  // Multi level inheritance
  class Mammal extends Animal{
      void walk(){
          System.out.println("Walks");
      }
  }
  class Fish extends Animal{
      void swim(){
          System.out.println("Swim");
      }
  }
// Derived class
//   class Fish extends Animal{
//       int fins;

//       void swim(){
//           System.out.println("Swim in water");
//       }
//   }