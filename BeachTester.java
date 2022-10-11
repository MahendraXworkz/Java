class BeachTester{
	public static void main(String []args){
		Beaches.addBeachName("Marina");
		Beaches.addBeachName("Malpe");
		Beaches.addBeachName("Baga");
		Beaches.addBeachName("Gokarna");
		Beaches.addBeachName("Murudeshwara");
		Beaches.getBeachNames();
		Beaches.addBeachName("Another beach");
		Beaches.getBeachNames();
		Beaches.findBeachName("Gokarna");
		Beaches.updateBeachName("Marina","Paradise");
		Beaches.getBeachNames();
		Beaches.updateBeachName("Paradise",-1);
		Beaches.updateBeachName("Paradise",6);
		Beaches.updateBeachName("Paradise",3);
		Beaches.getBeachNames();
		/*
		System.out.println("\nPerforming delete operation");
		Beaches.deleteBeachName("Malpe");
		Beaches.getBeachNames();
		Beaches.deleteBeachName(3);
		Beaches.getBeachNames();
		*/
	}
}