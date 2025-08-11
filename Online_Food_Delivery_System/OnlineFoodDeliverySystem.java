package Online_Food_Delivery_System;

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) throws LowPriceException{
        Customer c=new Customer();
        c.name="Iffath";
        c.phoneNo= 1856;
        FoodItem fi=new FoodItem(12007,"Pizza",500,c);
        fi.itemInfo();
        double off=15;
        fi.currentPrice(off/100);

        try {
            c.WalletMoney=100;
            fi.placeOrder(3);
        }catch (LowPriceException e){
            System.out.println("Exception found : "+e.getMessage());
        }
        c.customerDetails();
    }
}
