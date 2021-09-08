package in.nmaloth.payments.constants.exception;

public class InvalidEnumConversion extends RuntimeException {

    public InvalidEnumConversion(){
        super();
    }

    public InvalidEnumConversion(String message){
        super(message);
    }
}
