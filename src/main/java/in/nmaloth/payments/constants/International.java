package in.nmaloth.payments.constants;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public enum International {

    INTERNATIONAL("0"),
    DOMESTIC("1");



    private String international;

    private static final Logger log = LoggerFactory.getLogger(International.class);


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
