package in.nmaloth.payments.constants.card;



import in.nmaloth.payments.constants.exception.InvalidEnumConversion;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public enum PeriodicType {

    SINGLE("S"),
    DAILY("D"),
    MONTHLY("M"),
    CYCLE_TO_DATE("C"),
    YEARLY("Y");

    private String periodicType;

    private static final Logger log = LoggerFactory.getLogger(PeriodicType.class);

    PeriodicType(String periodicType){
        this.periodicType = periodicType;
    }

    public String getPeriodicType() {
        return periodicType;
    }

    public static PeriodicType identify(String periodicType){
        switch (periodicType){
            case "S": {
                return PeriodicType.SINGLE;
            }
            case "D" : {
                return PeriodicType.DAILY;
            }
            case "M": {
                return PeriodicType.MONTHLY;
            }
            case "Y": {
                return PeriodicType.YEARLY;
            }
            default:{
                log.error("Invalid periodic Type ..{}",periodicType);
                throw  new InvalidEnumConversion("Invalid periodic Type");
            }

        }

    }

    public void toData(DataOutput dataOutput) throws IOException {
        dataOutput.writeUTF(periodicType);
    }

    public static PeriodicType fromData(DataInput dataInput) throws IOException, ClassNotFoundException {
        return identify(dataInput.readUTF());
    }

}
