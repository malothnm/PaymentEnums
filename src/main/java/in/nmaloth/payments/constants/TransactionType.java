package in.nmaloth.payments.constants;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public enum  TransactionType {

    PURCHASE("0"),
    QUASI_CASH("1"),
    BALANCE_INQUIRIES("2"),
    PREPAID_LOAD("3"),
    PREPAID_ACTIVATION("4"),
    CARD_ACTIVATION("5"),
    READY_LINK_LOAD("6"),
    BILL_PAYMENT("7"),
    PIN_CHANGE("8"),
    PIN_UNBLOCK("9"),
    PRIVATE_LABEL_PREPAID("A"),
    ELIGIBILITY_ENQUIRY("B"),
    PAYMENT("C"),
    CREDIT_VOUCHER("D"),
    MERCHANDISE_RETURN("E"),
    OCT("F"),
    CASH("G"),
    ACCOUNT_FUND_TRANSACTION("H"),
    ACCOUNT_VERIFICATION("I"),
    TOKEN_COMPLETION_NOTIFICATION("J"),
    TOKEN_ACTIVATION_REQUEST("K"),
    ACTIVATION_CODE_NOTIFICATION("L"),
    TOKEN_EVENT_NOTIFICATION("M"),
    TOKEN_ELIGIBILITY("N"),
    UNKNOWN("U")
    ;


    private String transactionType ;

    private static final Logger log = LoggerFactory.getLogger(TransactionType.class);


    TransactionType(String transactionType ){
        this.transactionType = transactionType;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public static TransactionType identify(String transactionType) {

        switch (transactionType) {
            case "0": {
                return TransactionType.PURCHASE;
            }
            case "1": {
                return TransactionType.QUASI_CASH;
            }
            case "2": {
                return TransactionType.BALANCE_INQUIRIES;
            }
            case "3": {
                return TransactionType.PREPAID_LOAD;
            }
            case "4": {
                return TransactionType.PREPAID_ACTIVATION;

            }
            case "5": {
                return TransactionType.CARD_ACTIVATION;
            }
            case "6": {
                return TransactionType.READY_LINK_LOAD;
            }
            case "7": {
                return TransactionType.BILL_PAYMENT;
            }
            case "8": {
                return TransactionType.PIN_CHANGE;
            }
            case "9": {
                return TransactionType.PIN_UNBLOCK;
            }
            case "A": {
                return TransactionType.PRIVATE_LABEL_PREPAID;
            }
            case "B": {
                return TransactionType.ELIGIBILITY_ENQUIRY;
            }
            case "C": {
                return TransactionType.PAYMENT;
            }
            case "D": {
                return TransactionType.CREDIT_VOUCHER;
            }
            case "E": {
                return TransactionType.MERCHANDISE_RETURN;
            }
            case "F": {
                return TransactionType.OCT;
            }
            case "G": {
                return TransactionType.CASH;
            }
            case "H": {
                return TransactionType.ACCOUNT_FUND_TRANSACTION;
            }
            case "I": {
                return TransactionType.ACCOUNT_VERIFICATION;
            }
            case "J": {
                return TransactionType.TOKEN_COMPLETION_NOTIFICATION;
            }
            case "K": {
                return TransactionType.TOKEN_ACTIVATION_REQUEST;

            }
            case "L": {
                return TransactionType.ACTIVATION_CODE_NOTIFICATION;
            }
            case "M": {
                return TransactionType.TOKEN_EVENT_NOTIFICATION;
            }
            case "N": {
                return TransactionType.TOKEN_ELIGIBILITY;
            }
            default: {
                return TransactionType.UNKNOWN;
            }
        }

    }

    public void toData(DataOutput dataOutput) throws IOException {
        dataOutput.writeUTF(transactionType);
    }

    public static TransactionType fromData(DataInput dataInput) throws IOException, ClassNotFoundException {
        return identify(dataInput.readUTF());
    }

}
