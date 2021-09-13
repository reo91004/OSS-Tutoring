package Week02;

public class Customer {

    private int money; // 고객이 가지고 있는 돈
    private int productAmount = 0; // 고객이 가지고 있는 상품 갯수

    public void putMoney(int price) {
        this.money -= price;
    }

    public void receiveMoney(int receiveMoney) {
        this.money += receiveMoney;
    }

    public void takeProduct(int amount) {
        this.productAmount += amount;
    }

    public int getMoney() {
        return money;
    }

    public int getProductAmount() {
        return productAmount;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setProductAmount(int productAmount) {
        this.productAmount = productAmount;
    }
    
}