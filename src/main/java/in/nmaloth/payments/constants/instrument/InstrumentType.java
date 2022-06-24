package in.nmaloth.payments.constants.instrument;



import in.nmaloth.payments.constants.exception.InvalidEnumConversion;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;


public enum InstrumentType {

        PLASTIC_CREDIT("0"),
        PLASTIC_DEBIT("1"),
        PLASTIC_LOYALTY("2"),
        TOKEN("3"),
        TEMP_CARD("4"),
        CARD_LESS("5"),
        ONE_TIME_USE_CARD("6"),
        ACCOUNT_NUMBER("7");

        private String instrumentType;

        InstrumentType(String instrumentType){

                this.instrumentType = instrumentType;
        }

        private static final Logger log = LoggerFactory.getLogger(InstrumentType.class);


        public String getInstrumentType() {
                return instrumentType;
        }

        public static InstrumentType identify(String instrumentType){

                switch (instrumentType){
                        case "0": return InstrumentType.PLASTIC_CREDIT;
                        case "1": return InstrumentType.PLASTIC_DEBIT;
                        case "2": return InstrumentType.PLASTIC_LOYALTY;
                        case "3": return InstrumentType.TOKEN;
                        case "4": return InstrumentType.TEMP_CARD;
                        case "5": return InstrumentType.CARD_LESS;
                        case "6": return InstrumentType.ONE_TIME_USE_CARD;
                        case "7": return InstrumentType.ACCOUNT_NUMBER;
                }
                log.error(" Invalid Instrument Type .. {}", instrumentType);
                throw new InvalidEnumConversion("Invalid Instrument Type");

        }

        public void toData(DataOutput dataOutput) throws IOException {
                dataOutput.writeUTF(instrumentType);
        }

        public static InstrumentType fromData(DataInput dataInput) throws IOException, ClassNotFoundException {
                return identify(dataInput.readUTF());
        }
}
