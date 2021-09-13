package Week02;

public class Machine {

    private final int PRICE = 10000; // 상품 가격
    private int money = 0; // 자판기 돈
    private int productAmout = 10; // 상품 갯수

    private Customer customer;

    public void receiveMoney(int customerMoney) {
        this.money += customerMoney;
    }  

    public void checkMoney(int customerMoney) {
        if (customerMoney >= this.PRICE) {
            giveReturn(customerMoney);
            giveProduct();
        }
        else{
            System.out.println("가격이 부족합니다.");
            returnMoney(customerMoney);
        }
    }

    public void returnMoney(int customerMoney) {
        this.money -= customerMoney;
        this.customer.receiveMoney(customerMoney);
    }   

    public void giveReturn(int customerMoney) {
        this.customer.receiveMoney(customerMoney - this.PRICE);
        this.money -= customerMoney - this.PRICE;
    }

    public void giveProduct() {
        this.productAmout -= 1;
        this.customer.takeProduct(1);
    }

    public int getMoney() {
        return PRICE;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer ct) {
        this.customer = ct;
    }

}
