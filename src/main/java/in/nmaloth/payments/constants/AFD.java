package in.nmaloth.payments.constants;

public enum AFD {

    AFD_NO_PRESENT(false),
    AFD(true);

    private boolean afd ;

    AFD(boolean afd){
        this.afd = afd;
    }

    public boolean isAfd() {
        return afd;
    }

    public  static AFD identify(boolean afd){
        if(afd){
            return AFD;
        }
        return AFD_NO_PRESENT;
    }
}
