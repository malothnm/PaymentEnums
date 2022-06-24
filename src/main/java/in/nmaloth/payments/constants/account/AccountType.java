package in.nmaloth.payments.constants.account;

import in.nmaloth.payments.constants.exception.InvalidEnumConversion;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public enum AccountType {

    SAVINGS("S"),
    CURRENT("CU"),
    LOANS("L"),
    CREDIT("CR"),
    UNIVERSAL("U"),
    PREPAID("P")
    ;

    private final static Logger log = LoggerFactory.getLogger(AccountType.class);

    private String accountType;

    AccountType(String accountType){
        this.accountType = accountType;
    }

    public String getAccountType() {
        return accountType;
    }

    public static AccountType identify(String accountType){

        switch (accountType){
            case "L":
                return AccountType.LOANS;
            case "CR":
                return AccountType.CREDIT;
            case "CU":
                return AccountType.CURRENT;
            case "P":
                return AccountType.PREPAID;
            case "S":
                return AccountType.SAVINGS;
            case "U":
                return AccountType.UNIVERSAL;
        }
        log.error(" Invalid Account Type {} " , accountType);
        throw new InvalidEnumConversion("Invalid Account Type");


    }

    public void toData(DataOutput dataOutput) throws IOException {
        dataOutput.writeUTF(accountType);
    }

    public static AccountType fromData(DataInput dataInput) throws IOException, ClassNotFoundException {
        return identify(dataInput.readUTF());
    }
}
