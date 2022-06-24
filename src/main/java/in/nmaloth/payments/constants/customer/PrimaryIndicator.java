package in.nmaloth.payments.constants.customer;

public enum  PrimaryIndicator {
    PRIMARY(0),
    ADDITIONAL_1(1),
    ADDITIONAL_2(2),
    ADDITIONAL_3(3),
    ADDITIONAL_4(4),
    ADDITIONAL_5(5),
    ADDITIONAL_6(6),
    ADDITIONAL_7(7),
    ADDITIONAL_8(8),
    ADDITIONAL_9(9);

    private int type;
    PrimaryIndicator(int type){
        this.type = type;
    }
    public  int getType(){
        return this.type;
    }




}
