class BanksTester{
	public static void main(String []args){
		Banks.addBanksName("DENA");
		Banks.addBanksName("SBI");
		Banks.addBanksName("BOB");
		Banks.addBanksName("IPPB");
		Banks.addBanksName("HDFC");
		Banks.getBanksNames();
		Banks.addBanksName("UCO");
		Banks.findBankName("IPPB");
		Banks.findBankName("UCO");
		Banks.updateBankName("IPPB","UCO");
		Banks.getBanksNames();
		Banks.updateBankName(3,"UCO");
		Banks.getBanksNames();
	}
}