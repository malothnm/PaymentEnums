package in.nmaloth.payments.constants;

public enum PinBlockFormat {

    ISO_0("0"),
    ISO_1("1"),
    ISO_2("2"),
    ISO_3("3"),
    ISO_4("4"),
    DIEBOLD_IBM("DI"),
    DOCUTEL("D"),
    VISA_4("V4")
    ;

    private String pinBlockFormat;

    PinBlockFormat(String pinBlockFormat){
        this.pinBlockFormat = pinBlockFormat;
    }

    public String getPinBlockFormat() {
        return pinBlockFormat;
    }

    public static PinBlockFormat identify(String pinBlockFormat){

        switch (pinBlockFormat){
            case "0": return PinBlockFormat.ISO_0;
            case "1": return PinBlockFormat.ISO_1;
            case "2": return PinBlockFormat.ISO_2;
            case "3": return PinBlockFormat.ISO_3;
            case "DI": return PinBlockFormat.DIEBOLD_IBM;
            case "D": return PinBlockFormat.DOCUTEL;
            case "V4": return PinBlockFormat.VISA_4;
            default:{
                return PinBlockFormat.ISO_4;
            }
        }
    }
}
