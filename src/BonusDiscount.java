public class BonusDiscount extends DiscountService{
    @Override
    public int calculate(int price, Customer customer) {
        return (int)(price*customer.getGrade().getDiscountRate());
    }

    @Override
    public String returnPaymentInfo(int price, Customer customer){
        return String.format("결제 방식: 보너스 결제 방식\n보너스: %d\n결제 금액: %d\n"
        , calculate(price,customer),price);
    }
}
