package Family;

import Fun.Adress;
import Fun.Cart;
import Fun.Userrole;
public class Users {
    private String name;
    private int age;
    private Userrole role;
    private Cart cart;
       private Adress adress;

    public Users(String name, int age, Userrole role, Cart cart, Adress adress ) {

        this.name = name;
        this.age = age;
        this.cart = cart;
        this.adress = adress;
        this.role=role;
    }
    public Users(){

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Userrole getRole() {
        return role;
    }

    public void setRole(Userrole role) {
        this.role = role;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }



}
