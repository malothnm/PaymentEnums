package in.nmaloth.payments.constants.card;


import in.nmaloth.payments.constants.exception.InvalidEnumConversion;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;


public enum  CardHolderType {

    PRIMARY("P"),
    SECONDARY("S"),
    ADDITIONAL("A");

    private static final Logger log = LoggerFactory.getLogger(CardHolderType.class);

    private String cardHolderType;

    CardHolderType(String cardHolderType){
        this.cardHolderType = cardHolderType;
    }

    public String getCardHolderType(){
        return cardHolderType;
    }

    public static CardHolderType identify(String cardHolderType){
        switch (cardHolderType){
            case "P": return CardHolderType.PRIMARY;
            case "S": return CardHolderType.SECONDARY;
            case "A": return CardHolderType.ADDITIONAL;
        }
        log.error("Invalid CardHolder Type ...{}",cardHolderType);
        throw new InvalidEnumConversion("Invalid Card Holder Type");
    }

    public void toData(DataOutput dataOutput) throws IOException {
        dataOutput.writeUTF(cardHolderType);
    }

    public static CardHolderType fromData(DataInput dataInput) throws IOException, ClassNotFoundException {
        return identify(dataInput.readUTF());
    }

}
