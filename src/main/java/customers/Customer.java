package customers;

public class Customer {
    private double money;
    private String intention;
    private String cartypepreference;

    public Customer(double money, String intention, String cartypepreference){
        this.money = money;
        this.intention = intention;
        this.cartypepreference = cartypepreference;
    }

    public double getMoney() {
        return money;
    }

    public String getIntention() {
        return intention;
    }

    public String getCartypepreference() {
        return cartypepreference;
    }

    public void spendMoney(double price) {
        this.money -= price;
    }
}
