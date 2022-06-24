package in.nmaloth.payments.constants.ids;

public enum FieldID {

    BILL_AMOUNT("BILL_AMOUNT"),
    ACCOUNT_BALANCE("ACCOUNT_BALANCE"),
    ACCOUNT_TYPE("ACCOUNT_TYPE"),
    OTB("OTB"),
    OTB_TXN_CURR("OTB_TXN_CURR"),
    INTERNATIONAL("INTERNATIONAL"),
    CREDIT_LIMIT("CREDIT_LIMIT"),
    CREDIT_LIMIT_TXN_CURR("CREDIT_LIMIT_TXN_CURR"),
    BILLING_CURRENCY("BILLING_CURRENCY"),
    ADDRESS_VERIFICATION("ADDRESS_VERIFICATION"),
    CVV_RESULT("CVV_RESULT"),
    CVV2_RESULT("CVV2_RESULT"),
    CAVV_RESULT("CAVV_RESULT"),
    ARQC_RESULT("ARQC_RESULT"),
    DCVV2_RESULT("DCVV2_RESULT"),
    TAG_71("TAG_71"),
    TAG_73("TAG_73"),
    ARPC("ARPC"),
    ARQC("ARQC"),
    ENTRY_MODE("ENTRY_MODE"),
    CARD_DIGITS("CARD_DIGITS"),
    CASH_BACK("CASH_BACK"),
    TRANSACTION_TYPE("TRANSACTION_TYPE"),
    INSTRUMENT("INSTRUMENT")
    ;

    private String fieldId;

    FieldID(String fieldId){
        this.fieldId = fieldId;
    }

    public String getFieldId() {
        return fieldId;
    }
}
