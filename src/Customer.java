public abstract class Customer {

    // State
    private String name;
    private Grade grade;
    private DiscountService discountService;

    // Creation
    Customer(String name, Grade grade,DiscountService discountService){
        this.name = name;
        this.grade = grade;
        this.discountService = discountService;
    }
    // Operation
    public abstract void printUserInfo();

    public void printPayment(int price){
        System.out.print(discountService.returnPaymentInfo(price,this));
    }



    // getters, setters
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
    public Grade getGrade() {
        return grade;
    }

    public void setDiscountService(DiscountService discountService) {
        this.discountService = discountService;
    }
    public DiscountService getDiscountService() {
        return discountService;
    }
}
