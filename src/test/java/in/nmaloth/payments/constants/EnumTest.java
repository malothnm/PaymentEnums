package in.nmaloth.payments.constants;

import in.nmaloth.payments.keys.constants.CVCType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnumTest {

    @Test
    void authorizationType() {

        String[] authTypeStringArray = new String[]{"1","2","3","4","5","6"} ;
        AuthorizationType[] authorizationTypeArray = new AuthorizationType[authTypeStringArray.length];

        for (int i = 0; i < authorizationTypeArray.length ; i ++ ) {
            authorizationTypeArray[i] = AuthorizationType.identify(authTypeStringArray[i]);
        }

        String[] authTypeStringArrayResult = new String[authorizationTypeArray.length];

        for (int i = 0; i < authorizationTypeArray.length; i ++ ){
            authTypeStringArrayResult[i] = authorizationTypeArray[i].getAuthorizationType();
        }

        assertArrayEquals(authTypeStringArray,authTypeStringArrayResult);

    }

    @Test
    void avsType() {

        String[] avsTypeStringArray = new String[]{"0","1"} ;
        AVSType[] avsTypeArray = new AVSType[avsTypeStringArray.length];

        for (int i = 0; i < avsTypeStringArray.length ; i ++ ) {
            avsTypeArray[i] = AVSType.identify(avsTypeStringArray[i]);
        }

        String[] avsTypeStringArrayResult = new String[avsTypeArray.length];

        for (int i = 0; i < avsTypeStringArrayResult.length; i ++ ){
            avsTypeStringArrayResult[i] = avsTypeArray[i].getAvsType();
        }

        assertArrayEquals(avsTypeStringArray,avsTypeStringArrayResult);

    }

    @Test
    void cashBack() {

        String[] cashBackStringArray = new String[]{"0","1"} ;
        CashBack[] cashBackArray = new CashBack[cashBackStringArray.length];

        for (int i = 0; i < cashBackArray.length ; i ++ ) {
            cashBackArray[i] = CashBack.identify(cashBackStringArray[i]);
        }

        String[] cashBackStringArrayResult = new String[cashBackArray.length];

        for (int i = 0; i < cashBackArray.length; i ++ ){
            cashBackStringArrayResult[i] = cashBackArray[i].getCashBack();
        }

        assertArrayEquals(cashBackStringArray,cashBackStringArrayResult);
    }

    @Test
    void entryMode() {

        String[] entryModeStringArray = new String[]{"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F","G","H","I"} ;
        EntryMode[] entryModeArray = new EntryMode[entryModeStringArray.length];

        for (int i = 0; i < entryModeArray.length ; i ++ ) {
            entryModeArray[i] = EntryMode.identify(entryModeStringArray[i]);
        }

        String[] entryModeStringArrayResult = new String[entryModeArray.length];

        for (int i = 0; i < entryModeArray.length; i ++ ){
            entryModeStringArrayResult[i] = entryModeArray[i].getEntryMode();
        }

        assertArrayEquals(entryModeStringArray,entryModeStringArrayResult);
    }


    @Test
    void installmentType() {

        String[] installmentTypeStringArray = new String[]{"0","1"} ;
        InstallmentType[] installmentTypeArray = new InstallmentType[installmentTypeStringArray.length];

        for (int i = 0; i < installmentTypeArray.length ; i ++ ) {
            installmentTypeArray[i] = InstallmentType.identify(installmentTypeStringArray[i]);
        }

        String[] installmentTypeStringArrayResult = new String[installmentTypeArray.length];

        for (int i = 0; i < installmentTypeArray.length; i ++ ){
            installmentTypeStringArrayResult[i] = installmentTypeArray[i].getInstallmentType();
        }

        assertArrayEquals(installmentTypeStringArray,installmentTypeStringArrayResult);

    }

    @Test
    void pinEntryMode() {

        String[] pintEntryStringArray = new String[]{"0","1","2"} ;
        PinEntryMode[] pinEntryArray = new PinEntryMode[pintEntryStringArray.length];

        for (int i = 0; i < pintEntryStringArray.length ; i ++ ) {
            pinEntryArray[i] = PinEntryMode.identify(pintEntryStringArray[i]);
        }

        String[] pinEntryStringArrayResult = new String[pinEntryArray.length];

        for (int i = 0; i < pinEntryArray.length; i ++ ){
            pinEntryStringArrayResult[i] = pinEntryArray[i].getPinEntryMode();
        }

        assertArrayEquals(pintEntryStringArray,pinEntryStringArrayResult);

    }

    @Test
    void purchaseTypes() {

        String[] purchaseTypesStringArray = new String[]{"O","CC","AI","HC","LG","AR","RS", "GA","RA","RP","G"} ;
        PurchaseTypes[] purchaseTypeArray = new PurchaseTypes[purchaseTypesStringArray.length];

        for (int i = 0; i < purchaseTypeArray.length ; i ++ ) {
            purchaseTypeArray[i] =PurchaseTypes.identify(purchaseTypesStringArray[i]);
        }

        String[] purchaseTypesStringArrayResult = new String[purchaseTypeArray.length];

        for (int i = 0; i < purchaseTypeArray.length; i ++ ){
            purchaseTypesStringArrayResult[i] = purchaseTypeArray[i].getPurchaseTypes();
        }

        assertArrayEquals(purchaseTypesStringArray,purchaseTypesStringArrayResult);

    }

    @Test
    void recurringTrans() {

        String[] recurringTranStringArray = new String[]{"0","1"} ;
        RecurringTrans[] recurringTransArray = new RecurringTrans[recurringTranStringArray.length];

        for (int i = 0; i < recurringTransArray.length ; i ++ ) {
            recurringTransArray[i] = RecurringTrans.identify(recurringTranStringArray[i]);
        }

        String[] recurringTransStringArrayResult = new String[recurringTransArray.length];

        for (int i = 0; i < recurringTransArray.length; i ++ ){
            recurringTransStringArrayResult[i] = recurringTransArray[i].getRecurringTrans();
        }

        assertArrayEquals(recurringTranStringArray,recurringTransStringArrayResult);
    }

    @Test
    void terminalPinCapability() {

        String[] terminalPinStringArray = new String[]{"0","1","2","3","4"} ;
        TerminalPinCapability[] terminalPinCapabilities = new TerminalPinCapability[terminalPinStringArray.length];

        for (int i = 0; i < terminalPinCapabilities.length ; i ++ ) {
            terminalPinCapabilities[i] = TerminalPinCapability.identify(terminalPinStringArray[i]);
        }

        String[] terminalPinStringArrayResult = new String[terminalPinCapabilities.length];

        for (int i = 0; i < terminalPinCapabilities.length; i ++ ){
            terminalPinStringArrayResult[i] = terminalPinCapabilities[i].getTerminalPinCapability();
        }

        assertArrayEquals(terminalPinStringArray,terminalPinStringArrayResult);


    }

    @Test
    void terminalType() {

        String[] terminalTypeStringArray = new String[]{"U","NA","A","UCA","ECR","HT","MOTO","M"} ;
        TerminalType[] terminalTypes = new TerminalType[terminalTypeStringArray.length];

        for (int i = 0; i < terminalTypes.length ; i ++ ) {
            terminalTypes[i] = TerminalType.identify(terminalTypeStringArray[i]);
        }

        String[] terminalTypeStringArrayResult = new String[terminalTypes.length];

        for (int i = 0; i < terminalTypes.length; i ++ ){
            terminalTypeStringArrayResult[i] = terminalTypes[i].getTerminalType();
        }

        assertArrayEquals(terminalTypeStringArray,terminalTypeStringArrayResult);



    }

    @Test
    void transactionType() {

        String[] transactionTypeStringArray = new String[]{"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F","G","H","I","J"
                ,"K","L","M", "N"
        } ;
        TransactionType[] transactionTypes = new TransactionType[transactionTypeStringArray.length];

        for (int i = 0; i < transactionTypes.length ; i ++ ) {
            transactionTypes[i] = TransactionType.identify(transactionTypeStringArray[i]);
        }

        String[] transactionTypeStringArrayResult = new String[transactionTypes.length];

        for (int i = 0; i < transactionTypes.length; i ++ ){
            transactionTypeStringArrayResult[i] = transactionTypes[i].getTransactionType();
        }

        assertArrayEquals(transactionTypeStringArray,transactionTypeStringArrayResult);
    }

    @Test
    void hsmCommand() {

        String[] hsmCommandArray = new String[]{"0","1","2","3","4","5","6","7","8","9","10","11","30"
        } ;
        HSMCommand[] hsmCommands = new HSMCommand[hsmCommandArray.length];

        for (int i = 0; i < hsmCommandArray.length ; i ++ ) {
            hsmCommands[i] = HSMCommand.identify(hsmCommandArray[i]);
        }

        String[] hsmCommandStringArrayResult = new String[hsmCommands.length];

        for (int i = 0; i < hsmCommands.length; i ++ ){
            hsmCommandStringArrayResult[i] = hsmCommands[i].getHsmCommand();
        }

        assertArrayEquals(hsmCommandArray,hsmCommandStringArrayResult);
    }

    @Test
    void cvcType() {

        String[] cvcTypesArray = new String[]{"0","1","2","3","4"} ;
        CVCType[] cvcTypes = new CVCType[cvcTypesArray.length];

        for (int i = 0; i < cvcTypesArray.length ; i ++ ) {
            cvcTypes[i] = CVCType.identify(cvcTypesArray[i]);
        }

        String[] cvcTypeStringArrayResult = new String[cvcTypesArray.length];

        for (int i = 0; i < cvcTypesArray.length; i ++ ){
            cvcTypeStringArrayResult[i] = cvcTypes[i].getCvcType();
        }

        assertArrayEquals(cvcTypesArray,cvcTypeStringArrayResult);
    }

}