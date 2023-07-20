public class WebCustomer extends Customer{

    WebCustomer(String name, Grade grade,DiscountService discountService){
        super(name, grade, discountService);
    }
    @Override
    public void printUserInfo() {
        System.out.print( String.format(
                "접속 경로: Web\n" +
                "이름: %s\n" +
                "등급: %s\n",getName(),getGrade().name()));
    }
}
