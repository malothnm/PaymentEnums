package in.nmaloth.payments.constants.ids;

public enum FieldID {

    BILL_AMOUNT("BILL_AMOUNT"),
    ACCOUNT_BALANCE("ACCOUNT_BALANCE"),
    OTB("OTB"),
    BILLING_CURRENCY("BILLING_CURRENCY")
    ;

    private String fieldId;

    FieldID(String fieldId){
        this.fieldId = fieldId;
    }

    public String getFieldId() {
        return fieldId;
    }
}
