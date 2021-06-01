package in.nmaloth.payments.constants.ids;

public enum FieldID {

    BILL_AMOUNT("BILL_AMOUNT"),
    ACCOUNT_BALANCE("ACCOUNT_BALANCE"),
    OTB("OTB"),
    BILLING_CURRENCY("BILLING_CURRENCY"),
    ADDRESS_VERIFICATION("ADDRESS_VERIFICATION"),
    CVV_RESULT("CVV_RESULT"),
    CVV2_RESULT("CVV2_RESULT"),
    CAVV_RESULT("CAVV_RESULT"),
    ARQC_RESULT("ARQC_RESULT"),
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
