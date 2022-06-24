package in.nmaloth.payments.constants;


import in.nmaloth.payments.constants.account.AccountType;
import in.nmaloth.payments.constants.account.BalanceTypes;
import in.nmaloth.payments.constants.card.*;
import in.nmaloth.payments.constants.customer.*;
import in.nmaloth.payments.constants.instrument.InstrumentType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Enum1Test {


    @Test
    void getBlockType() {


        String[] testValues = {"0","1","2","3","4","5","6"};
        BlockType[] blockTypes = new BlockType[7];
        for (int i = 0; i < testValues.length ; i ++ ) {
            blockTypes[i ] = BlockType.identify(testValues[i]);
        }

        String[] testValueReconverted = new String[7];
        for (int i = 0; i < blockTypes.length; i++ ){
            testValueReconverted[i] = blockTypes[i].getBlockType();
        }

        assertArrayEquals(testValues,testValueReconverted);

    }


    @Test
    void getPeriodicType() {

        String[] testValues = {"S","D","M","Y"};
        PeriodicType[] periodicTypes = new PeriodicType[testValues.length];
        for (int i = 0; i < testValues.length ; i ++ ) {
            periodicTypes[i ] = PeriodicType.identify(testValues[i]);
        }

        String[] testValueReconverted = new String[periodicTypes.length];
        for (int i = 0; i < periodicTypes.length; i++ ){
            testValueReconverted[i] =periodicTypes[i].getPeriodicType();
        }

        assertArrayEquals(testValues,testValueReconverted);
    }




    @Test
    void getLimitType() {

        String[] testValues = {"N","C","R","O","Q","A"};
        LimitType[] limitTypes = new LimitType[testValues.length];
        for (int i = 0; i < testValues.length ; i ++ ) {
            limitTypes[i ] = LimitType.identify(testValues[i]);
        }

        String[] testValueReconverted = new String[limitTypes.length];
        for (int i = 0; i < limitTypes.length; i++ ){
            testValueReconverted[i] = limitTypes[i].getLimitType();
        }

        assertArrayEquals(testValues,testValueReconverted);
    }



    @Test
    void getCardStatus() {

        String[] testValues = {"A","I","F","P","T"};
        CardStatus[] cardStatuses = new CardStatus[testValues.length];
        for (int i = 0; i < testValues.length ; i ++ ) {
            cardStatuses[i ] = CardStatus.identify(testValues[i]);
        }

        String[] testValueReconverted = new String[cardStatuses.length];
        for (int i = 0; i < cardStatuses.length; i++ ){
            testValueReconverted[i] = cardStatuses[i].getCardStatus();
        }

        assertArrayEquals(testValues,testValueReconverted);

    }


    @Test
    void getCardHolderType() {

        String[] testValues = {"P","S","A"};
        CardHolderType[] cardHolderTypes = new CardHolderType[testValues.length];
        for (int i = 0; i < testValues.length ; i ++ ) {
            cardHolderTypes[i ] = CardHolderType.identify(testValues[i]);
        }

        String[] testValueReconverted = new String[cardHolderTypes.length];
        for (int i = 0; i < cardHolderTypes.length; i++ ){
            testValueReconverted[i] = cardHolderTypes[i].getCardHolderType();
        }

        assertArrayEquals(testValues,testValueReconverted);

    }



    @Test
    void getCardAction() {

        String[] testValues = {"0","1","2","3","4","5"};
        CardAction[] cardActions = new CardAction[testValues.length];
        for (int i = 0; i < testValues.length ; i ++ ) {
            cardActions[i] = CardAction.identify(testValues[i]);
        }

        String[] testValueReconverted = new String[cardActions.length];
        for (int i = 0; i < cardActions.length; i++ ){
            testValueReconverted[i] = cardActions[i].getCardAction();
        }

        assertArrayEquals(testValues,testValueReconverted);

    }


    @Test
    void getBalanceTypes() {

        String[] testValues = {"0","1","2","3"};
        BalanceTypes[] balanceTypes = new BalanceTypes[testValues.length];
        for (int i = 0; i < testValues.length ; i ++ ) {
            balanceTypes[i] = BalanceTypes.identify(testValues[i]);
        }

        String[] testValueReconverted = new String[balanceTypes.length];
        for (int i = 0; i < balanceTypes.length; i++ ){
            testValueReconverted[i] = balanceTypes[i].getBalanceTypes();
        }

        assertArrayEquals(testValues,testValueReconverted);

    }


    @Test
    void getInstrumentTypes() {

        String[] testValues = {"0","1","2","3","4","5","6","7"};
        InstrumentType[] instrumentTypes = new InstrumentType[testValues.length];
        for (int i = 0; i < testValues.length ; i ++ ) {
            instrumentTypes[i] = InstrumentType.identify(testValues[i]);
        }

        String[] testValueReconverted = new String[instrumentTypes.length];
        for (int i = 0; i < instrumentTypes.length; i++ ){
            testValueReconverted[i] = instrumentTypes[i].getInstrumentType();
        }

        assertArrayEquals(testValues,testValueReconverted);

    }


    @Test
    void getAccountType() {

        String[] testValues = {"S","CR","L","CU","U","P"};

        AccountType[] accountTypes = new AccountType[testValues.length];
        for (int i = 0; i < testValues.length ; i ++ ) {
            accountTypes[i] = AccountType.identify(testValues[i]);
        }

        String[] testValueReconverted = new String[accountTypes.length];
        for (int i = 0; i < accountTypes.length; i++ ){
            testValueReconverted[i] = accountTypes[i].getAccountType();
        }

        assertArrayEquals(testValues,testValueReconverted);

    }


    @Test
    void getAddressType() {

        String[] testValues = {"H","O","P","C","1","2","3","4","S"};

        AddressType[] addressTypes = new AddressType[testValues.length];
        for (int i = 0; i < testValues.length ; i ++ ) {
            addressTypes[i] = AddressType.identify(testValues[i]);
        }

        String[] testValueReconverted = new String[addressTypes.length];
        for (int i = 0; i < addressTypes.length; i++ ){
            testValueReconverted[i] = addressTypes[i].getAddressType();
        }

        assertArrayEquals(testValues,testValueReconverted);

    }


    @Test
    void getCustomerIDType() {

        String[] testValues = {"0","1","2","3","4","5","6","7"};

        CustomerIDType[] customerIDTypes = new CustomerIDType[testValues.length];
        for (int i = 0; i < testValues.length ; i ++ ) {
            customerIDTypes[i] = CustomerIDType.identify(testValues[i]);
        }

        String[] testValueReconverted = new String[customerIDTypes.length];
        for (int i = 0; i < customerIDTypes.length; i++ ){
            testValueReconverted[i] = customerIDTypes[i].getCustomerIDType();
        }

        assertArrayEquals(testValues,testValueReconverted);

    }


    @Test
    void getCustomerType() {

        String[] testValues = {"O","C"};

        CustomerType[] customerTypes = new CustomerType[testValues.length];
        for (int i = 0; i < testValues.length ; i ++ ) {
            customerTypes[i] = CustomerType.identify(testValues[i]);
        }

        String[] testValueReconverted = new String[customerTypes.length];
        for (int i = 0; i < customerTypes.length; i++ ){
            testValueReconverted[i] = customerTypes[i].getCustomerType();
        }

        assertArrayEquals(testValues,testValueReconverted);

    }

    @Test
    void getEmailType() {

        String[] testValues = {"P","W"};

        EmailType[] emailTypes = new EmailType[testValues.length];
        for (int i = 0; i < testValues.length ; i ++ ) {
            emailTypes[i] =EmailType.identify(testValues[i]);
        }

        String[] testValueReconverted = new String[emailTypes.length];
        for (int i = 0; i < emailTypes.length; i++ ){
            testValueReconverted[i] = emailTypes[i].getEmailType();
        }

        assertArrayEquals(testValues,testValueReconverted);

    }

    @Test
    void getPhoneType() {

        String[] testValues = {"PL","PM","WL","WM","AP"};

        PhoneType[] phoneTypes = new PhoneType[testValues.length];
        for (int i = 0; i < testValues.length ; i ++ ) {
            phoneTypes[i] = PhoneType.identify(testValues[i]);
        }

        String[] testValueReconverted = new String[phoneTypes.length];
        for (int i = 0; i < phoneTypes.length; i++ ){
            testValueReconverted[i] = phoneTypes[i].getPhoneType();
        }

        assertArrayEquals(testValues,testValueReconverted);

    }


}