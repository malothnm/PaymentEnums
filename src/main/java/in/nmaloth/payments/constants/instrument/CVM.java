package in.nmaloth.payments.constants.instrument;

public enum CVM {

    SIGNATURE("S"),
    ONLINE_PIN("ON"),
    OFFLINE_PIN("OF"),
    NO_VERIFICATION("N")
    ;

    private String cvm;

    CVM(String cvm){
        this.cvm = cvm;
    }

    public String getCvm() {
        return cvm;
    }

    public static CVM identify(String cvm){
        switch (cvm){
            case "S": return CVM.SIGNATURE;
            case "ON": return CVM.ONLINE_PIN;
            case "OF": return CVM.OFFLINE_PIN;
            default: return CVM.NO_VERIFICATION;
        }
    }
}
