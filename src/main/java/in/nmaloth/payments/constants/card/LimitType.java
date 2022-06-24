package in.nmaloth.payments.constants.card;



import in.nmaloth.payments.constants.exception.InvalidEnumConversion;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public enum LimitType {

    NO_SPECIFIC("N"),
    RETAIL("R"),
    CASH("C"),
    OTC("O"),
    ATM("A"),
    QUASI_CASH("Q");

    private static final Logger log = LoggerFactory.getLogger(LimitType.class);

    private String limitType;

    LimitType(String limitType){
        this.limitType = limitType;
    }

    public String getLimitType() {
        return limitType;
    }

    public static LimitType identify(String limitType) {

        switch (limitType){
            case "N" : return LimitType.NO_SPECIFIC;
            case "C" : return LimitType.CASH;
            case "R" : return LimitType.RETAIL;
            case "O" : return LimitType.OTC;
            case "Q" : return LimitType.QUASI_CASH;
            case "A" : return LimitType.ATM;
        }

        log.error(" Invalid Limit Type ..{}", limitType);
        throw new InvalidEnumConversion("Invalid Limit Type");

    }

    public void toData(DataOutput dataOutput) throws IOException {
        dataOutput.writeUTF(limitType);
    }

    public static LimitType fromData(DataInput dataInput) throws IOException, ClassNotFoundException {
        return identify(dataInput.readUTF());
    }
}
