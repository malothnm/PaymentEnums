package in.nmaloth.payments.constants;

import lombok.extern.slf4j.Slf4j;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

@Slf4j
public enum EntryMode {

    UNKNOWN("0"),
    MANUAL_KEY_ENTRY("1"),
    MOTO("2"),
    ECOMM("3"),
    MAG_CVV_NOT_POSSIBLE("4"),
    OPTICAL_CODE("5"),
    ICC("6"),
    STORE_VALUE_PRE_REGISTERED("7"),
    CONTACT_LESS_ICC("8"),
    COF("9"),
    COF_TOKEN("A"),
    MAG("B"),
    CONTACT_LESS_MAG("C"),
    FALLBACK("D"),
    ICC_INVALID_CVV_I_CVV("E"),
    WALLET_CONTACT_LESS_ICC("F"),
    WALLET_CONTACT_MST("G"),
    WALLET_CONTACT_LESS_MAG_STRIPE("H"),
    CHEQUE("I");

    private String entryMode;

    EntryMode(String entryMode){
        this.entryMode = entryMode;
    }

    public String getEntryMode() {
        return entryMode;
    }

    public static EntryMode identify(String entryMode){
        switch (entryMode){

            case "0": {
                return EntryMode.UNKNOWN;
            }
            case "1" : {
                return EntryMode.MANUAL_KEY_ENTRY;
            }
            case "2" : {
                return EntryMode.MOTO;
            }
            case "3" : {
                return EntryMode.ECOMM;
            }
            case "4" : {
                return EntryMode.MAG_CVV_NOT_POSSIBLE;
            }
            case "5" : {
                return EntryMode.OPTICAL_CODE;
            }
            case "6" : {
                return EntryMode.ICC;
            }
            case "7" : {
                return EntryMode.STORE_VALUE_PRE_REGISTERED;
            }
            case "8" : {
                return EntryMode.CONTACT_LESS_ICC;
            }
            case "9" : {
                return EntryMode.COF;
            }
            case "A" : {
                return EntryMode.COF_TOKEN;
            }
            case "B": {
                return EntryMode.MAG;
            }
            case "C" : {
                return EntryMode.CONTACT_LESS_MAG;
            }
            case "D" : {
                return EntryMode.FALLBACK;
            }
            case "E" : {
                return EntryMode.ICC_INVALID_CVV_I_CVV;
            }
            case "F": {
                return EntryMode.WALLET_CONTACT_LESS_ICC;
            }
            case "G" : {
                return EntryMode.WALLET_CONTACT_MST;
            }
            case "H" : {
                return EntryMode.WALLET_CONTACT_LESS_MAG_STRIPE;
            }
            case "I": {
                return EntryMode.CHEQUE;
            }
            default:{
                log.error("Invalid Entry Mode :: {}",entryMode);
                return EntryMode.UNKNOWN;
            }
        }
    }

    public void toData(DataOutput dataOutput) throws IOException {
        dataOutput.writeUTF(entryMode);
    }

    public static EntryMode fromData(DataInput dataInput) throws IOException, ClassNotFoundException {
        return identify(dataInput.readUTF());
    }
}
