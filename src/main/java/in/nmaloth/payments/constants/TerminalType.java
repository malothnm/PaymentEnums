package in.nmaloth.payments.constants;

import lombok.extern.slf4j.Slf4j;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

@Slf4j
public enum TerminalType {

    UNSPECIFIED("U"),
    UNATTENDED_CARDHOLDER_ACTIVATED_NO_AUTH("NA"),
    ATM("A"),
    UNATTENDED_CARDHOLDER_AUTHORIZED("UCA"),
    ELECTRONIC_CASH_REGISTER("ECR"),
    HOME_TERMINALS("HT"),
    MOTO("MOTO"),
    MOBILE_ACCEPTANCE_SOLUTION("M");

    private String terminalType;

    TerminalType(String terminalType){
        this.terminalType = terminalType;
    }

    public String getTerminalType(){
        return this.terminalType;
    }

    public static TerminalType identify(String terminalType){

        switch (terminalType){
            case "U" : {
                return TerminalType.UNSPECIFIED;
            }
            case "NA" : {
                return TerminalType.UNATTENDED_CARDHOLDER_ACTIVATED_NO_AUTH;
            }
            case "A" : {
                return TerminalType.ATM;
            }
            case "UCA" : {
                return TerminalType.UNATTENDED_CARDHOLDER_AUTHORIZED;
            }
            case "ECR" : {
                return TerminalType.ELECTRONIC_CASH_REGISTER;
            }
            case "HT" : {
                return TerminalType.HOME_TERMINALS;
            }
            case "MOTO" : {
                return TerminalType.MOTO;

            }
            case "M" : {
                return TerminalType.MOBILE_ACCEPTANCE_SOLUTION;
            }
            default: {

                log.error("Invalid Terminal TYpe :: {} ", terminalType);
                return TerminalType.UNSPECIFIED;

            }
        }
    }

    public void toData(DataOutput dataOutput) throws IOException {
        dataOutput.writeUTF(terminalType);
    }

    public static TerminalType fromData(DataInput dataInput) throws IOException, ClassNotFoundException {
        return identify(dataInput.readUTF());
    }


}
