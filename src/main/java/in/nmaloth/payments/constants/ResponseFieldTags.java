package in.nmaloth.payments.constants;

public enum  ResponseFieldTags {


    RESPONSE_CODE("RESPONSE_CODE"),
    BILL_AMOUNT("BILL_AMOUNT"),
    BILLING_CURRENCY("BILLING_CURRENCY"),
    ADDRESS_VERIFICATION("ADDRESS_VERIFICATION"),



    ;

    private String responseFieldTag;

    ResponseFieldTags(String responseFieldTag){
        this.responseFieldTag = responseFieldTag;
    }

    public String getResponseFieldTag() {
        return responseFieldTag;
    }
}
