package in.nmaloth.payments.constants;

import lombok.extern.slf4j.Slf4j;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

@Slf4j
public enum AuthorizationType {

    AUTH("0"),
    REPEAT_AUTH("1"),
    INCREMENTAL_AUTH("2"),
    ADVICES("3"),
    FILE_UPDATE_RESP("4"),
    REVERSAL("5"),
    REVERSAL_ADVICE("6");

    private String authorizationType;

    AuthorizationType (String authorizationType){
        this.authorizationType = authorizationType;
    }

    public String getAuthorizationType() {
        return authorizationType;
    }

    public static AuthorizationType identify(String authorizationType){
        switch (authorizationType){
            case "0" : {
                return AuthorizationType.AUTH;
            }
            case "1" : {
                return AuthorizationType.REPEAT_AUTH;
            }
            case "2" : {
                return AuthorizationType.INCREMENTAL_AUTH;
            }
            case "3" : {
                return AuthorizationType.ADVICES;
            }
            case "4" : {
                return AuthorizationType.FILE_UPDATE_RESP;
            }
            case "5" : {
                return AuthorizationType.REVERSAL;
            }
            case "6" : {
                return AuthorizationType.REVERSAL_ADVICE;
            }
            default:{
                log.error("Invalid Authorization Type ,{}  " , authorizationType);
                return AuthorizationType.AUTH;
            }
        }
    }

    public void toData(DataOutput dataOutput) throws IOException {
        dataOutput.writeUTF(authorizationType);
    }

    public static AuthorizationType fromData(DataInput dataInput) throws IOException, ClassNotFoundException {
        return identify(dataInput.readUTF());
    }
}
