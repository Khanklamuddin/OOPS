public class Abstraction{
    public static void main(String args[]){
        // object create kiya 
    //     horse h = new horse();
    //     h.eat();
    //     h.walk();

    //    chiken c = new chiken();

    //    c.eat();
    //    c.walk();

    //    System.out.println(h.color);

 
 
    }
}

abstract class Animal{
    String color;
    Animal(){
        color = "brown";
    }
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk();
}

class horse extends Animal{
    void changeColor(){
        color = "Dark brown";
    }
    void walk(){
        System.out.println("walk on 4 legs");
    }
}

class chiken extends Animal{
    void changeColor(){
        color = "light brown";
    }
    void walk(){
        System.out.println("walk on 2 legs");
    }
}

// interfaces

interface Chessplayer{
    void moves();
}
class Queeen implements Chessplayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal");
    }
}

class Rook implements Chessplayer{
    public void moves(){
     System.out.println("up, down, left, right");
    }
}

class King implements Chessplayer{
    public void moves(){
       System.out.println("up, down, left right, diagonal one step ");
    }
}

