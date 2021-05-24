package in.nmaloth.payments.constants;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public enum International {

    INTERNATIONAL("0"),
    DOMESTIC("1");

    private String international;

    International(String international){
        this.international = international;
    }

    public String getInternational() {
        return international;
    }

    public static International identify(String international){
        switch (international){
            case "0": return International.INTERNATIONAL;
            default: return International.DOMESTIC;
        }
    }
}
