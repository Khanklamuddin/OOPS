public class Getters{
    public static void main(String args[]){
        Pen p1 = new Pen(); // created a pen object called p1
        // new keyword memory me jagah gherta
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(8);
        System.out.println(p1.getTip());

    
    }

} 

class Pen{ // pen ka blueprint
// properties
    private String color;
    private int tip;
// function 
        //getters
    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
    // setters 
    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}