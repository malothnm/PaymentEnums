package in.nmaloth.payments.constants.ResponseResults;

public enum ValidationResult {

    VALIDATION_NOT_DONE("0"),
    VALIDATION_FAILED("1"),
    VALIDATION_PASSED("2")
    ;

    private String validationResult;

    ValidationResult(String validationResult){
        this.validationResult = validationResult;
    }

    public String getCvcValidationResult() {
        return validationResult;
    }

    public ValidationResult identify(String cvcValidationResult){
        switch (cvcValidationResult){
            case "1": return VALIDATION_FAILED;
            case "2": return VALIDATION_PASSED;
            default: return VALIDATION_NOT_DONE;
        }
    }
}
