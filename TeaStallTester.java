class TeaStallTester{
	public static void main(String teastall[]){
		
		//Intialization Through Setter Method
		TeaStall.setTeastallId (2366);
		TeaStall.setName ("Beereshwara Tea stall");
		TeaStall.setAddress ("Malleshwaram");
		TeaStall.setContactNo (6363674722l);
		
		
		//get the data Through Get Method
			System.out.println(TeaStall.getTeastallId());
			System.out.println(TeaStall.getName());
			System.out.println(TeaStall.getAddress());
			System.out.println(TeaStall.getContactNo());
		//	System.out.println(TeaStall.getTeastallId() +" "+TeaStall.getName() +" "+TeaStall.getAddress() +" "+TeaStall.getContactNo());
	}
}