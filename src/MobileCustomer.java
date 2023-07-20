public class MobileCustomer extends Customer{
    MobileCustomer(String name, Grade grade,DiscountService discountService){
        super(name, grade, discountService);
    }
    @Override
    public void printUserInfo() {
        System.out.print( String.format(
                "접속 경로: Mobile\n" +
                "이름: %s\n" +
                "등급: %s\n",getName(),getGrade().name()));
    }
}
