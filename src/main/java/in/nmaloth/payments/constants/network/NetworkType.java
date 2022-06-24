package in.nmaloth.payments.constants.network;

public enum NetworkType {

    VISA_VIP("VI"),
    MASTERCARD("MC"),
    VISA_SMS("VS"),
    MASTERCARD_SMS("MS"),
    AMEX_POS("AP"),
    AMEX_ATM("AA"),
    PROSA_ATM("PA"),
    PROSA_POS("PP"),
    RUPAY_ATM("RA"),
    RUPAY_POS("RP"),
    RUPAY_SMS("RS")

    ;

    private String networkType ;

    NetworkType(String networkType){
        this.networkType = networkType;
    }

    public String getNetworkType() {
        return networkType;
    }


    public static NetworkType identify(String networkType){

        switch (networkType){
            case "VI": {
                return NetworkType.VISA_VIP;
            }
            case "MC": {
                return NetworkType.MASTERCARD;
            }
            case "VS": {
                return NetworkType.VISA_SMS;
            }
            case "MS": {
                return NetworkType.MASTERCARD_SMS;
            }
            case "AP": {
                return NetworkType.AMEX_POS;
            }
            default: {
                return AMEX_ATM;
            }
        }
    }
}
