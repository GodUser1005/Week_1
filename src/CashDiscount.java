public class CashDiscount extends DiscountService{
    @Override
    public int calculate(int price, Customer customer) {
        return (int)(price*(1-customer.getGrade().getDiscountRate()));
    }

    @Override
    public String returnPaymentInfo(int price, Customer customer) {
        return String.format("결제 방식: 할인 결제 방식\n결제금액: %d\n",
                calculate(price,customer));
    }
}
