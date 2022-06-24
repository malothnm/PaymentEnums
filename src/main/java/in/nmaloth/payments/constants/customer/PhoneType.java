package in.nmaloth.payments.constants.customer;

import in.nmaloth.payments.constants.exception.InvalidEnumConversion;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public enum  PhoneType {

    PERSONAL_LAND_LINE("PL"),
    PERSONAL_MOBILE("PM"),
    WORK_PHONE_LAND_LINE("WL"),
    WORK_PHONE_MOBILE("WM"),
    ADDITIONAL_PHONE("AP");


    private String phoneType;

    PhoneType(String phoneType){
        this.phoneType = phoneType;
    }

    private static final Logger log = LoggerFactory.getLogger(PhoneType.class);


    public String getPhoneType() {
        return phoneType;
    }

    public static PhoneType identify(String phoneType){
        switch (phoneType){
            case "PL" :
                return PhoneType.PERSONAL_LAND_LINE;
            case "PM":
                return PhoneType.PERSONAL_MOBILE;
            case "WM":
                return PhoneType.WORK_PHONE_MOBILE;
            case "WL":
                return PhoneType.WORK_PHONE_LAND_LINE;
            case "AP":
                return PhoneType.ADDITIONAL_PHONE;
        }

        log.error("Invalid Phone Type {} ", phoneType);
        throw new InvalidEnumConversion("Invalid Phone Type");
    }

    public void toData(DataOutput dataOutput) throws IOException {
        dataOutput.writeUTF(phoneType);
    }

    public static PhoneType fromData(DataInput dataInput) throws IOException, ClassNotFoundException {
        return identify(dataInput.readUTF());
    }
}
