package Online_Food_Delivery_System;

public interface Ordarable {
    void placeOrder(int quantity) throws LowPriceException;
    void cancelOrder();
}
