package in.nmaloth.payments.constants;

public enum HSMCommand {

    CVC_VAL("0"),
    CVC_GEN("1"),
    PIN_GEN("2"),
    PIN_VAL("3"),
    ARQC_VAL("4"),
    ARPC_GEN("5"),
    CVC2_VAL("6"),
    CVC2_GEN("7"),
    CAVV_VAL("8"),
    DYNAMIC_CVC_VAL("9"),
    DYNAMIC_CVC_GEN("10"),
    CVC3_VAL("11"),
    ERROR("30")
        ;

    private String hsmCommand;

    HSMCommand(String hsmCommand){
        this.hsmCommand = hsmCommand;
    }

    public String getHsmCommand() {
        return hsmCommand;
    }

    public static HSMCommand identify(String hsmCommand){

        switch (hsmCommand){
            case "0": return HSMCommand.CVC_VAL;
            case "6": return HSMCommand.CVC2_VAL;
            case "3": return HSMCommand.PIN_VAL;
            case "4": return HSMCommand.ARQC_VAL;
            case "8": return HSMCommand.CAVV_VAL;
            case "9": return HSMCommand.DYNAMIC_CVC_VAL;
            case "11": return HSMCommand.CVC3_VAL;
            case "1": return HSMCommand.CVC_GEN;
            case "2": return HSMCommand.PIN_GEN;
            case "5": return HSMCommand.ARPC_GEN;
            case "7": return HSMCommand.CVC2_GEN;
            case "10": return HSMCommand.DYNAMIC_CVC_GEN;
            default: return HSMCommand.ERROR;
        }

    }


}
