@isTest(seealldata=false)
public class TestforAccAddress {
    
    static testMethod void testMethod1(){
        account ac1 = new account ();
        ac1.name = 'test1';
        ac1.BillingCity = 'XYZ city';
        ac1.BillingStreet = 'XYZ Street';
        ac1.BillingCountry = 'XYZ Country';
        insert ac1;
        
        account ac2 = new account ();
        ac2.name = 'test1';
        
        insert ac2;
        }

}
