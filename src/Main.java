import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 세일 서비스 객체 생성
        DiscountService bonusWay = new BonusDiscount();
        DiscountService cashWay = new CashDiscount();

        // 고객 객체 생성
        Customer cus1 = new WebCustomer("Link",Grade.BRONZE,cashWay);
        Customer cus2 = new WebCustomer("Daniel",Grade.SILVER,cashWay);
        Customer cus3 = new MobileCustomer("Kang",Grade.GOLD,bonusWay);

        // 고객 리스트 생성
        ArrayList<Customer> customers = new ArrayList<>(List.of(cus1,cus2,cus3));

        // 고객 리스트 추가
        customers.add(new MobileCustomer("Guri",Grade.GOLD,bonusWay));

        // 고객 정보 조회 & 가격 계산
        System.out.print("고객의 이름을 입력하시오: ");
        String name = input.nextLine();
        System.out.print("상품의 가격을 입력하시오: ");
        int price = input.nextInt();

        for(Customer customer : customers){
            if(customer.getName().equals(name)){
                System.out.println("=======================");
                customer.printUserInfo();
                customer.printPayment(price);
                System.out.println("=======================");
            }
        }


    }
}
