package in.nmaloth.payments.constants.account;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public enum  BalanceTypes  {

    CURRENT_BALANCE("0"),
    CASH_BALANCE("1"),
    INSTALLMENT_BALANCE("2"),
    INSTALLMENT_CASH("3"),
    INTERNATIONAL_CURRENT_BALANCE("4"),
    INTERNATIONAL_CASH_BALANCE("5"),
    INTERNATIONAL_INSTALLMENT_BALANCE("6"),
    INTERNATIONAL_INSTALLMENT_CASH("7");

    private static final Logger log = LoggerFactory.getLogger(BalanceTypes.class);
    private String balanceTypes;

    BalanceTypes (String balanceTypes){
        this.balanceTypes = balanceTypes;
    }

    public String getBalanceTypes() {
        return balanceTypes;
    }

    public static BalanceTypes identify(String balanceTypes){
        switch (balanceTypes){
            case "0": {
                return BalanceTypes.CURRENT_BALANCE;
            }
            case "1": {
                return BalanceTypes.CASH_BALANCE;
            }
            case "2" : {
                return BalanceTypes.INSTALLMENT_BALANCE;
            }
            case "3": {
                return BalanceTypes.INSTALLMENT_CASH;
            }
            case "4": {
                return BalanceTypes.INTERNATIONAL_CURRENT_BALANCE;
            }
            case "5": {
                return BalanceTypes.INTERNATIONAL_CASH_BALANCE;
            }
            case "6": {
                return BalanceTypes.INTERNATIONAL_INSTALLMENT_BALANCE;
            }
            case "7": {
                return BalanceTypes.INTERNATIONAL_INSTALLMENT_CASH;
            }
            default: {
                log.error(" Invalid Balance Type : {}",balanceTypes);
                return BalanceTypes.CURRENT_BALANCE;
            }
        }

    }

    public void toData(DataOutput dataOutput) throws IOException {
        dataOutput.writeUTF(balanceTypes);
    }

    public static BalanceTypes fromData(DataInput dataInput) throws IOException, ClassNotFoundException {
        return identify(dataInput.readUTF());
    }
}
