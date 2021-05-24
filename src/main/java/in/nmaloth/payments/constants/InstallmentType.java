package in.nmaloth.payments.constants;

import lombok.extern.slf4j.Slf4j;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

@Slf4j
public enum InstallmentType {

    NO_INSTALLMENT_TYPE("0"),
    INSTALLMENT_TYPE("1"),
    ;

    private String installmentType;

    InstallmentType(String installmentType){
        this.installmentType = installmentType;
    }


    public String getInstallmentType() {
        return installmentType;
    }

    public static InstallmentType identify(String installmentType){

        switch (installmentType){
            case "0" : {
                return InstallmentType.NO_INSTALLMENT_TYPE;
            }
            case "1": {
                return InstallmentType.INSTALLMENT_TYPE;
            }
            default:{
                log.error(" Invalid Installment Type : {} ", installmentType);
                return InstallmentType.NO_INSTALLMENT_TYPE;
            }
        }
    }

    public void toData(DataOutput dataOutput) throws IOException {
        dataOutput.writeUTF(installmentType);
    }

    public static InstallmentType fromData(DataInput dataInput) throws IOException, ClassNotFoundException {
        return identify(dataInput.readUTF());
    }
}
