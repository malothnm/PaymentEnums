package in.nmaloth.payments.constants.network;

public enum MessageType {


    INITIAL_REQUEST("I"),
    REPLAY_MESSAGE("R")
    ;

    private String messageType;

    MessageType(String messageType){
        this.messageType = messageType;
    }

    public String getMessageType() {
        return messageType;
    }

    public static MessageType identify(String messageType){

        if(messageType.equals("I")){
            return MessageType.INITIAL_REQUEST;
        }
        return MessageType.REPLAY_MESSAGE;
    }
}
