public class MobileCustomer extends Customer{
    MobileCustomer(String name, Grade grade,DiscountService discountService){
        super(name, grade, discountService);
    }
    @Override
    public void printUserInfo() {
        System.out.printf(
                """
                        접속 경로: Mobile
                        이름: %s
                        등급: %s
                        """,getName(),getGrade().name());
    }
}
