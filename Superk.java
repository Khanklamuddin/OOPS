public class Superk{
    public static void main(String args[]){
        Horse h = new Horse(); // ye object hai 

    }
}

class Animal{ // ye animal class hai 
    Animal(){ // ye constructor hai 
        System.out.println("Animal constructor is called");
    }
}

class Horse extends Animal{  // ye hoprse class hai 
    Horse(){ // ye bhi constructor hai 
        super();  // super keyword immidiate parent class object ko call lagata hai 
        System.out.println("horse constructor is called");
    }
}