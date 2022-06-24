package in.nmaloth.payments.constants.customer;


import in.nmaloth.payments.constants.exception.InvalidEnumConversion;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;


public enum EmailType {

    PERSONAL("P"),
    WORK("W");

    private String emailType;

    private static final Logger log = LoggerFactory.getLogger(EmailType.class);

    EmailType(String emailType){
        this.emailType = emailType;
    }

    public String getEmailType() {
        return emailType;
    }

    public static EmailType identify(String emailType){
        switch (emailType){
            case "P":
                return EmailType.PERSONAL;
            case "W":
                return EmailType.WORK;
        }
        log.error("Invalid Email Type {}",emailType);
        throw new InvalidEnumConversion("Invalid Email Type");
    }

    public void toData(DataOutput dataOutput) throws IOException {
        dataOutput.writeUTF(emailType);
    }

    public static EmailType fromData(DataInput dataInput) throws IOException, ClassNotFoundException {
        return identify(dataInput.readUTF());
    }
}
