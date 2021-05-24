package in.nmaloth.payments.constants;

import lombok.extern.slf4j.Slf4j;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

@Slf4j
public enum  TerminalPinCapability {

    UNKNOWN("0"),
    ACCEPTS_ONLINE_PIN("1"),
    ACCEPTS_OFFLINE_PIN("2"),
    ACCEPTS_EITHER("3"),
    CANNOT_ACCEPT_PIN("4");

    private String terminalPinCapability;

    TerminalPinCapability(String terminalPinCapability){
        this.terminalPinCapability = terminalPinCapability;
    }

    public String getTerminalPinCapability() {
        return terminalPinCapability;
    }

    public static TerminalPinCapability identify(String terminalPinCapability){
        switch (terminalPinCapability){

            case "0": {
                return TerminalPinCapability.UNKNOWN;
            }
            case "1" : {
                return TerminalPinCapability.ACCEPTS_ONLINE_PIN;

            }
            case "2" : {
                return TerminalPinCapability.ACCEPTS_OFFLINE_PIN;
            }
            case "3" : {
                return TerminalPinCapability.ACCEPTS_EITHER;
            }
            case "4" : {
                return TerminalPinCapability.CANNOT_ACCEPT_PIN;
            }
            default:{
                log.error(" Invalid Terminal Pin Capability :: {}",terminalPinCapability);
                return TerminalPinCapability.UNKNOWN;
            }
        }
    }
    public void toData(DataOutput dataOutput) throws IOException {
        dataOutput.writeUTF(terminalPinCapability);
    }

    public static TerminalPinCapability fromData(DataInput dataInput) throws IOException, ClassNotFoundException {
        return identify(dataInput.readUTF());
    }
}
