package in.nmaloth.payments.constants;

public enum ServiceResponse {

    //Card Validation
    OK("OK"),
    NO_ENTRY("NO_ENTRY"),
    STATUS("STATUS"),
    BLK("BLK"),
    TEMP_BLK("TEMP_BLK"),
    SUSPECT_FRAUD("SUSPECT_FRAUD"),
    FRAUD("FRAUD"),
    PICK_UP("PICK_UP"),
    PLASTIC_INVALID("PLASTIC_INVALID"),
    PLASTIC_ACT("PLASTIC_ACT"),
    TRANSACTION_TYPE("TRANSACTION_TYPE"),
    TERMINAL_TYPE("TERMINAL_TYPE"),
    PURCHASE_TYPE("PURCHASE_TYPE"),
    CASH_BACK("CASH_BACK"),
    INSTALLMENT("INSTALLMENT"),
    ACCT_LIMIT("ACCT_LIMIT"),
    NO_PRODUCT("NO_PRODUCT"),
    CARD_LIMIT("CARD_LIMIT"),
    SYSTEM_ERROR("SYSTEM_ERROR"),
    EXPIRED_CARD("EXPIRED_CARD"),
    ENTRY_MODE("ENTRY_MODE"),
    CURRENCY_CONVERSION("CURRENCY_CONVERSION"),
    INVALID_INSTRUMENT("INVALID_INSTRUMENT"),
    MESSAGE_ERROR("MESSAGE_ERROR"),
    INVALID_CURRENCY_CODE("INVALID_CURRENCY_CODE"),
    INVALID_ACCOUNT("INVALID_ACCOUNT"),
    INCOMING_REJECT("INCOMING_REJECT")



    ;

    private String serviceResponse;

    ServiceResponse(String serviceResponse){
        this.serviceResponse = serviceResponse;
    }

    public String getServiceResponse(){
        return this.serviceResponse;
    }
}
