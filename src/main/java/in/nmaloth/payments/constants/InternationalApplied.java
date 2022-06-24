package in.nmaloth.payments.constants;

public enum InternationalApplied {

    INTERNATIONAL("I"),
    DOMESTIC("D"),
    BOTH("B");

    private String blockInternational;

    InternationalApplied(String blockInternational) {

        this.blockInternational = blockInternational;
    }

    public String getBlockInternational() {
        return blockInternational;
    }

    public static InternationalApplied identify(String blockInternational) {
        switch (blockInternational) {
            case "I":
                return InternationalApplied.INTERNATIONAL;
            case "D":
                return InternationalApplied.DOMESTIC;
            default:
                return InternationalApplied.BOTH;
        }
    }


}
