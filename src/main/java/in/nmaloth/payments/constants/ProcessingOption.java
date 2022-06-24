package in.nmaloth.payments.constants;

public enum ProcessingOption {

    NOT_PROCESSED("0"),
    PROCESSED_IN_CLUSTER("1"),
    PROCESSED_OUT_CLUSTER("2"),
    PROCESSED_OUT_CLUSTER_WITH_STAND_IN("3")

    ;


    private String processingOption;

    ProcessingOption(String processingOption){
        this.processingOption = processingOption;
    }

    public String getProcessingOption() {
        return processingOption;
    }

    public ProcessingOption identify(String processingOption){

        switch (processingOption){
            case "1": return PROCESSED_IN_CLUSTER;
            case "2": return PROCESSED_OUT_CLUSTER;
            case "3": return PROCESSED_OUT_CLUSTER_WITH_STAND_IN;
            default: return NOT_PROCESSED;
        }
    }
}
