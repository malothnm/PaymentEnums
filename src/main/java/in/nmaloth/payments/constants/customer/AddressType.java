package in.nmaloth.payments.constants.customer;



import in.nmaloth.payments.constants.exception.InvalidEnumConversion;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public enum AddressType {
    PRIMARY("P"),
    HOME("H"),
    OFFICE("O"),
    CORPORATE("C"),
    SECONDARY_ADDRESS("S"),
    ADDRESS_TYPE_1("1"),
    ADDRESS_TYPE_2("2"),
    ADDRESS_TYPE_3("3"),
    ADDRESS_TYPE_4("4");

    private String addressType;

    private static final Logger log = LoggerFactory.getLogger(AddressType.class);

    AddressType(String addressType){
        this.addressType = addressType;
    }

    public String getAddressType() {
        return addressType;
    }

    public void toData(DataOutput dataOutput) throws IOException {
        dataOutput.writeUTF(addressType);
    }

    public static AddressType fromData(DataInput dataInput) throws IOException, ClassNotFoundException {
        return identify(dataInput.readUTF());
    }

    public static AddressType identify(String addressType){
            switch (addressType){
                case "H":
                    return AddressType.HOME;
                case "O":
                    return AddressType.OFFICE;
                case "P":
                    return AddressType.PRIMARY;
                case "C":
                    return AddressType.CORPORATE;
                case "1":
                    return AddressType.ADDRESS_TYPE_1;
                case "2":
                    return AddressType.ADDRESS_TYPE_2;
                case "3":
                    return AddressType.ADDRESS_TYPE_3;
                case "4":
                    return AddressType.ADDRESS_TYPE_4;
                case "S":
                    return AddressType.SECONDARY_ADDRESS;
            }

            log.error("Invalid Address Type {}", addressType);
            throw new InvalidEnumConversion("Invalid Address Type");
    }
}
