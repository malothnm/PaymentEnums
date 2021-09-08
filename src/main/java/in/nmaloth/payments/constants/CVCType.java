package in.nmaloth.payments.constants;

public enum CVCType {

    CVC("0"),
    CVC2("1"),
    DYNAMIC_CVC2("2"),
    CVC3("3"),
    CAVV("4")

    ;

    private String cvcType;

    CVCType(String cvcType){
        this.cvcType = cvcType;
    }

    public String getCvcType() {
        return cvcType;
    }

    public static CVCType identify(String cryptoType){
        switch (cryptoType){
            case "0": return CVCType.CVC;
            case "1": return CVCType.CVC2;
            case "2": return CVCType.DYNAMIC_CVC2;
            case "3": return CVCType.CVC3;
            default: return CVCType.CAVV;
        }
    }
}
