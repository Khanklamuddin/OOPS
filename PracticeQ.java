public class PracticeQ{
    public static void main(String args[]){
            final Car car = new ElecticCar(); // yahan par polymorphsim ka concept hai 
            System.out.print(car.Drive());
    }
}
// ye parent class hai 
class AutoMobile{
    private String drive(){ // ye private hai isiliye kisi bhi sub class ko inherit nahi karega
        return "Driving vehichal";
    }
}
// car class extends karega automobile ko
class Car extends AutoMobile{
    protected String Drive(){
        return "Driving car";
    }
}

class ElecticCar extends Car{

    @Override

    public final String Drive(){
        return "Driving electric car";
    }

}