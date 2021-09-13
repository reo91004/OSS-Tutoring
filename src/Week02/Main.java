package Week02;

import java.util.Scanner;

public class Main {

	/*
	private final Customer customer; 
	private final Machine Machine;
	 
	public Main(Customer customer, Machine Machine) { 
		this.customer = customer;
		this.Machine = Machine; 
	}
	*/
	 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Customer ct = new Customer();
		Machine mt = new Machine();

		System.out.print("예산을 입력하세요>>");
		int initmoney = sc.nextInt();
		ct.setMoney(initmoney);
		System.out.print("얼마를 넣으시겠습니까?>>");
		int temp = sc.nextInt();
		ct.putMoney(temp);
		mt.setCustomer(ct);
		mt.receiveMoney(temp);
		mt.checkMoney(temp);

		System.out.println("현재 돈은 " + ct.getMoney() + "원 입니다.");
		System.out.println("보유한 상품 개수는 " + ct.getProductAmount() + "개 입니다.");

		sc.close();
	}

}
