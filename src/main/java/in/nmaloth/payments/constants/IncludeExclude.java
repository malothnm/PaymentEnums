package in.nmaloth.payments.constants;

public enum IncludeExclude {

    INCLUDE("I"),
    EXCLUDE("E"),
    NOT_APPLICABLE("N")
    ;
    private String includeExclude;

    IncludeExclude(String includeExclude){
        this.includeExclude = includeExclude;
    }

    public String getIncludeExclude() {
        return includeExclude;
    }
    public static IncludeExclude identify(String includeExclude){
        switch (includeExclude){
            case "I": return IncludeExclude.INCLUDE;
            case "E": return IncludeExclude.EXCLUDE;
            default: return IncludeExclude.NOT_APPLICABLE;
        }
    }
}
