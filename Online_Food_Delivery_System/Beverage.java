package Online_Food_Delivery_System;

public class Beverage extends FoodItem{
    private int volumeInML;
    Beverage(int itemId, String itemName, double itemPrice,Customer c,int volumeInMl) throws LowPriceException {
        super(itemId,itemName,itemPrice,c);
        this.volumeInML=volumeInMl;
    }

    public int getVolumeInML() {
        return volumeInML;
    }

    public void setVolumeInML(int volumeInML) {
        this.volumeInML = volumeInML;
    }
    public void itemInfo(){
        System.out.println("This is Beverage");
    }
}
