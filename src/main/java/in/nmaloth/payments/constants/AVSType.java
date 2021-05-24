package in.nmaloth.payments.constants;

import lombok.extern.slf4j.Slf4j;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

@Slf4j
public enum AVSType {

    AVS_NOT_PRESENT("0"),
    AVS("1");

    private String avsType;

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
