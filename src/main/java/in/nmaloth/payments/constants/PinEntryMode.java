package in.nmaloth.payments.constants;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public enum  PinEntryMode {

    NO_PIN("0"),
    ONLINE_PIN("1"),
    OFFLINE_PIN("2");

    private String pinEntryMode;

    private static final Logger log = LoggerFactory.getLogger(PinEntryMode.class);


    PinEntryMode(String pinEntryMode){
        this.pinEntryMode = pinEntryMode;
    }

    public String getPinEntryMode() {
        return pinEntryMode;
    }

    public static PinEntryMode identify(String pinEntryMode){
        switch (pinEntryMode){
            case "0": {
                return PinEntryMode.NO_PIN;
            }
            case "1": {
                return PinEntryMode.ONLINE_PIN;
            }
            case "2" : {
                return PinEntryMode.OFFLINE_PIN;
            }
            default:{
                log.error("Invalid Pin Entry Mode {}", pinEntryMode);
                return PinEntryMode.NO_PIN;
            }
        }
    }

    public void toData(DataOutput dataOutput) throws IOException {
        dataOutput.writeUTF(pinEntryMode);
    }

    public static PinEntryMode fromData(DataInput dataInput) throws IOException, ClassNotFoundException {
        return identify(dataInput.readUTF());
    }
}
