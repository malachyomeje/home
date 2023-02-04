import Amen.Employ;
import Amen.Paying;
import Family.Cashier;
import Family.Manager;
import Family.Users;
import Fun.Adress;
import Fun.Cart;
import Fun.Userrole;
public class Main {
    public static void main(String[] args) {
        Users user = new Users();
        Manager manager0 = new Manager();
        Manager manager = new Manager(" omeje malachy",27,Userrole.MANAGER,Cart.phd,Adress.OBOLLO);
        Manager manager2 = new Manager();

        System.out.println("NAME:" + manager.getName() + "  ADRESS:" + manager.getAdress());
        System.out.println(" \n''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''");

        Cashier cashier = new Cashier(" omeje victor",38,Userrole.CASHIER,Cart.hnd,Adress.OBOLLO);
        System.out.println(" NAME:" + cashier.getName() + "" + cashier.getCart());
        System.out.println(" \n ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
        Paying food = new Paying();
        System.out.println( food.pay(cashier));

        Employ employ= new Employ();
        System.out.println(employ.employ(manager));

    }
}