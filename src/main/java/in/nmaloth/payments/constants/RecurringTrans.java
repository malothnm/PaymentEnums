package in.nmaloth.payments.constants;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public enum RecurringTrans {

    NOT_RECURRING_TRANS("0"),
    RECURRING_TRANS("1");

    private String recurringTrans;

    private static final Logger log = LoggerFactory.getLogger(RecurringTrans.class);


    RecurringTrans(String recurringTrans){
        this.recurringTrans = recurringTrans;
    }

    public String getRecurringTrans() {
        return recurringTrans;
    }

    public static RecurringTrans identify(String recurringTrans){
        switch (recurringTrans){
            case "0": {
                return RecurringTrans.NOT_RECURRING_TRANS;
            }
            case "1": {
                return RecurringTrans. RECURRING_TRANS;
            }
            default:{
                log.error(" Invalid recurring Transaction :: {}", recurringTrans);
                return RecurringTrans.NOT_RECURRING_TRANS;

            }
        }
    }

    public void toData(DataOutput dataOutput) throws IOException {
        dataOutput.writeUTF(recurringTrans);
    }

    public static RecurringTrans fromData(DataInput dataInput) throws IOException, ClassNotFoundException {
        return identify(dataInput.readUTF());
    }
}
