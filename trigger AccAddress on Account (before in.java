trigger AccAddress on Account (before insert) {
    
    for (Account actNew :Trigger.New){
		
		actNew.ShippingStreet = actNew.BillingStreet;
        actNew.ShippingCity = actNew.BillingCity;
        actNew.ShippingCountry = actNew.BillingCountry;
		
  
	}

}