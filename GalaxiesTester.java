class GalaxiesTester{
	public static void main(String[] shivu){
		Galaxy.setTypesOfGalaxies("Spiral,Elliptical,Peculiar,Irregular");
		Galaxy.setTemperature("4 million degrees Fahrenheit");
		Galaxy.setSpaceEverEnd(false);
			System.out.println(Galaxy.getTypesOfGalaxies() +" "+Galaxy.getTemperature() +" "+Galaxy.getSpaceEverEnd());
	}
}