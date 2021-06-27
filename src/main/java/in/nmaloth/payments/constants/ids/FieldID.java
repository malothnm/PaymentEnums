package in.nmaloth.payments.constants.ids;

public enum FieldID {

    BILL_AMOUNT("BILL_AMOUNT"),
    ACCOUNT_BALANCE("ACCOUNT_BALANCE"),
    ACCOUNT_TYPE("ACCOUNT_TYPE"),
    OTB("OTB"),
    INTERNATIONAL("INTERNATIONAL"),
    CREDIT_LIMIT("CREDIT_LIMIT"),
    BILLING_CURRENCY("BILLING_CURRENCY"),
    ADDRESS_VERIFICATION("ADDRESS_VERIFICATION"),
    CVV_RESULT("CVV_RESULT"),
    CVV2_RESULT("CVV2_RESULT"),
    CAVV_RESULT("CAVV_RESULT"),
    ARQC_RESULT("ARQC_RESULT"),
    DCVV2_RESULT("DCVV2_RESULT"),
    TAG_71("TAG_71"),
    TAG_73("TAG_73"),
    ARPC("ARPC")
    ;

    private String fieldId;

    FieldID(String fieldId){
        this.fieldId = fieldId;
    }

    public String getFieldId() {
        return fieldId;
    }
}
