package Amen;

import Family.Cashier;
import Fun.Cart;

public class Paying{



    public String  pay (Cashier cashier) {
        if (cashier.getCart().equals(Cart.hnd) || cashier.getCart().equals( Cart.nce)){
            return " YOU HAVE BEEN PAID";
        }
        return " fool";

    }
}



