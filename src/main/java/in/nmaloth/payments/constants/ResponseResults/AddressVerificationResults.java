package in.nmaloth.payments.constants.ResponseResults;

public enum AddressVerificationResults {

    ADDRESS_MATCH_ZIP_CODE_NO_MATCH("A"),
    STREET_ADDRESS_MATCH_POSTAL_CODE_NOT_VERIFIED("B"),
    STREET_ADDRESS_POSTAL_CODE_NOT_VERIFIED("C"),
    STREET_ADDRESS_POSTAL_CODE_MATCH("M"),
    ADDRESS_INFORMATION_NOT_VERIFIED("G"),
    NO_MATCH("N"),
    POSTAL_CODE_MATCH_ADDRESS_NO_MATCH("P"),
    ISSUER_NOT_AVAILABLE("I"),
    NOT_VERIFIED_DUE_TO_NON_PARTICIPATION("U")
    ;

    private String addressVerificationResult;

    AddressVerificationResults(String addressVerificationResult){
        this.addressVerificationResult = addressVerificationResult;
    }

    public String getAddressVerificationResult() {
        return addressVerificationResult;
    }

    public  AddressVerificationResults identify(String addressVerificationResult){
        switch (addressVerificationResult){
            case "A": return ADDRESS_MATCH_ZIP_CODE_NO_MATCH;
            case "B": return STREET_ADDRESS_MATCH_POSTAL_CODE_NOT_VERIFIED;
            case "C": return STREET_ADDRESS_POSTAL_CODE_NOT_VERIFIED;
            case "M": return STREET_ADDRESS_POSTAL_CODE_MATCH;
            case "G": return ADDRESS_INFORMATION_NOT_VERIFIED;
            case "N": return NO_MATCH;
            case "P": return POSTAL_CODE_MATCH_ADDRESS_NO_MATCH;
            case "I": return ISSUER_NOT_AVAILABLE;
            case "U": return NOT_VERIFIED_DUE_TO_NON_PARTICIPATION;
            default: {
                throw  new RuntimeException("Invalid Address Verification Result");
            }
        }
    }
}
