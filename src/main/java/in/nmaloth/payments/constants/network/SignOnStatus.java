package in.nmaloth.payments.constants.network;

public enum SignOnStatus {

    SIGN_ON("1"),
    SIGN_OFF("0")

    ;

    private String signOnStatus;

    SignOnStatus(String signOnStatus){
        this.signOnStatus = signOnStatus;
    }

    public String getSignOnStatus() {
        return signOnStatus;
    }

    public static SignOnStatus identify(String signOnStatus){

        if(signOnStatus.equals("1")){
            return SIGN_ON;
        }
        return SIGN_OFF;
    }
}
