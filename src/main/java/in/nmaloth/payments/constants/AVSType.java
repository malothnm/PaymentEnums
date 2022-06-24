package in.nmaloth.payments.constants;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public enum AVSType {

    AVS_NOT_PRESENT("0"),
    AVS("1");

    private String avsType;

    private static final Logger log = LoggerFactory.getLogger(AVSType.class);

    AVSType(String avsType){
        this.avsType = avsType;
    }

    public String getAvsType(){
        return this.avsType;
    }

    public static AVSType identify(String avsType){
        switch (avsType){
            case "0": {
                return AVSType.AVS_NOT_PRESENT;
            }
            case "1" : {
                return AVSType.AVS;
            }
            default: {
                log.error("Invalid AVSType : {}", avsType);
                return AVSType.AVS_NOT_PRESENT;
            }
        }
    }

    public void toData(DataOutput dataOutput) throws IOException {
        dataOutput.writeUTF(avsType);
    }

    public static AVSType fromData(DataInput dataInput) throws IOException, ClassNotFoundException {
        return identify(dataInput.readUTF());
    }
}
