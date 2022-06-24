package in.nmaloth.payments.constants;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public enum  PurchaseTypes {

    OTHERS("O"),
    CRYPTO_CURRENCY("CC"),
    AIRLINE("AI"),
    HEALTH_CARE("HC"),
    LODGING("LG"),
    AUTO_RENTAL("AR"),
    RESTAURANT("RS"),
    GAMBLING("GA"),
    RESTRICTED_ADULTS("RA"),
    RISKY_PURCHASE("RP"),
    GROCERIES("G")
    ;


    private String purchaseTypes;

    private static final Logger log = LoggerFactory.getLogger(PurchaseTypes.class);


    PurchaseTypes(String purchaseTypes) {
        this.purchaseTypes = purchaseTypes;
    }

    public String getPurchaseTypes() {
        return purchaseTypes;
    }

    public static  PurchaseTypes identify(String purchaseTypes){
        switch (purchaseTypes){
            case "O" : {
                return PurchaseTypes.OTHERS;
            }
            case "CC": {
                return PurchaseTypes.CRYPTO_CURRENCY;
            }
            case "AI" : {
                return PurchaseTypes.AIRLINE;
            }
            case "HC": {
                return PurchaseTypes.HEALTH_CARE;
            }
            case "LG": {
                return PurchaseTypes.LODGING;
            }
            case "AR" : {
                return PurchaseTypes.AUTO_RENTAL;
            }
            case "RS" : {
                return PurchaseTypes.RESTAURANT;

            }
            case "GA" : {
                return PurchaseTypes.GAMBLING;
            }
            case "RA" : {
                return PurchaseTypes.RESTRICTED_ADULTS;
            }
            case "RP": {
                return PurchaseTypes.RISKY_PURCHASE;
            }
            case "G": {
                return PurchaseTypes.GROCERIES;
            }
            default: {
                log.error(" Invalid Purchase Types :: {}", purchaseTypes);
                return PurchaseTypes.OTHERS;

            }
        }
    }

    public void toData(DataOutput dataOutput) throws IOException {
        dataOutput.writeUTF(purchaseTypes);
    }

    public static PurchaseTypes fromData(DataInput dataInput) throws IOException, ClassNotFoundException {
        return identify(dataInput.readUTF());
    }
}
