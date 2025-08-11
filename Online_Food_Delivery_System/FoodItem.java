package Online_Food_Delivery_System;

public class FoodItem implements Ordarable{
    private int itemId;
    private String itemName;
    private double itemPrice;
    Customer c1;

    public FoodItem(int itemId, String itemName, double itemPrice,Customer c1) throws LowPriceException{
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.c1=c1;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public void itemInfo(){
        System.out.println("Info of Food Item: ");
        System.out.println("Item Id: "+getItemId());
        System.out.println("Item Name: "+getItemName());
        System.out.println("Item's price: "+getItemPrice());
        System.out.println("#######################");
    }

    public void currentPrice(){
        System.out.println("Current Price of the item: "+getItemPrice());
    }
    public void currentPrice(double offer){
        itemPrice=itemPrice-(itemPrice*offer);
        System.out.println("Current price after offer: "+getItemPrice());
    }

    @Override
    public void placeOrder(int quantity) throws LowPriceException{
        if(c1.WalletMoney<500) throw new LowPriceException("You have not enough Money");
       else  System.out.println("Total Cost after order: "+quantity*itemPrice);
    }

    @Override
    public void cancelOrder() {
        System.out.println("Your order is cancelled");
    }
}
