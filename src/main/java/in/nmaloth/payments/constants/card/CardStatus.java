package in.nmaloth.payments.constants.card;

import in.nmaloth.payments.constants.exception.InvalidEnumConversion;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public enum CardStatus {

    ACTIVE("A"),
    FRAUD("F"),
    PURGED("P"),
    TRANSFER("T"),
    INACTIVE("I");



    private static final Logger log = LoggerFactory.getLogger(CardStatus.class);

    private String cardStatus;

    CardStatus(String cardStatus){
        this.cardStatus = cardStatus;
    }

    public String getCardStatus(){
        return cardStatus;
    }

    public static CardStatus identify(String cardStatus){
        switch (cardStatus){
            case "A": return CardStatus.ACTIVE;
            case "F": return CardStatus.FRAUD;
            case "T": return CardStatus.TRANSFER;
            case "P": return CardStatus.PURGED;
            case "I": return CardStatus.INACTIVE;
        }
        log.error(" Invalid Card Status ...{}", cardStatus);
        throw new InvalidEnumConversion("Invalid Card Status");
    }

    public void toData(DataOutput dataOutput) throws IOException {
        dataOutput.writeUTF(cardStatus);
    }

    public static CardStatus fromData(DataInput dataInput) throws IOException, ClassNotFoundException {
        return identify(dataInput.readUTF());
    }

}
