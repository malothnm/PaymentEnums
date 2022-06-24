package in.nmaloth.payments.constants;

public enum TransportProtocol {

    TCP("TCP"),
    HTTP("HTTP"),
    GRPC("GRPC"),
    R_SOCKET("R_SOCKET"),
    WEBSPHERE_MQ("WEBSPHERE_MQ"),
    KAFKA("KAFKA"),
    NONE("NONE")

    ;

    private String transportProtocol;

    TransportProtocol(String transportProtocol){
        this.transportProtocol = transportProtocol;
    }

    public String getTransportProtocol() {
        return transportProtocol;
    }



}
