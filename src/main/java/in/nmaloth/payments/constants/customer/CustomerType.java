package in.nmaloth.payments.constants.customer;


import in.nmaloth.payments.constants.exception.InvalidEnumConversion;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;


public enum CustomerType {
    OWNER("O"),
    CO_OWNER("C");

    private String customerType;

    private static final Logger log = LoggerFactory.getLogger(CustomerType.class);


    CustomerType(String customerType){
        this.customerType = customerType;
    }

    public String getCustomerType() {
        return customerType;
    }


    public static CustomerType identify(String customerType){
        switch (customerType){
            case "O":
                return CustomerType.OWNER;
            case "C":
                return CustomerType.CO_OWNER;
        }
        log.error("Invalid Customer Type {}", customerType);
        throw new InvalidEnumConversion("Invalid Customer Type");
    }

    public void toData(DataOutput dataOutput) throws IOException {
        dataOutput.writeUTF(customerType);
    }

    public static CustomerType fromData(DataInput dataInput) throws IOException, ClassNotFoundException {
        return identify(dataInput.readUTF());
    }
}
