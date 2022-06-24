package in.nmaloth.payments.constants;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public enum  CashBack {

    NO_CASH_BACK("0"),
    CASH_BACK_PRESENT("1");

    private String cashBack;

    private static final Logger log = LoggerFactory.getLogger(CashBack.class);


    CashBack(String cashBack){
        this.cashBack = cashBack;
    }

    public String getCashBack(){
        return this.cashBack;
    }

    public static CashBack identify(String cashBack){

        switch (cashBack) {
            case "0" : {
                return CashBack.NO_CASH_BACK;
            }
            case "1": {
                return CashBack.CASH_BACK_PRESENT;
            }
            default: {
                log.error("Invalid Cash Back type : {}",cashBack);
                return CashBack.NO_CASH_BACK;
            }
        }
    }

    public void toData(DataOutput dataOutput) throws IOException {
        dataOutput.writeUTF(cashBack);
    }

    public static CashBack fromData(DataInput dataInput) throws IOException, ClassNotFoundException {
        return identify(dataInput.readUTF());
    }


}
