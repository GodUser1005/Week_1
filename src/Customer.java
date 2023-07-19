public abstract class Customer implements PaymentWithBonus,PaymentWithDiscount{

    // State
    private String name;
    private Grade grade;
    private DiscountWay discountWay;

    // Creation
    Customer(String name, Grade grade,DiscountWay discountWay){
        this.name = name;
        this.grade = grade;
        this.discountWay = discountWay;
    }
    // Operation
    public abstract void printUserInfo();



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

    public void setDiscountWay(DiscountWay discountWay) {
        this.discountWay = discountWay;
    }
    public DiscountWay getDiscountWay() {
        return discountWay;
    }
}
