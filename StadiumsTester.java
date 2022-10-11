class StadiumsTester{
	public static void main(String []args){
		Stadiums.addStadiumName("Narendra Modi Stadium");
		Stadiums.addStadiumName("Salt Lake Stadium");
		Stadiums.addStadiumName("Eden Gardens");
		Stadiums.addStadiumName("Jawaharlal Nehru Stadium");
		Stadiums.addStadiumName("Greenfield International Stadium");
		Stadiums.getStadiumNames();
		Stadiums.addStadiumName("Rajiv Gandhi International Stadium");
		Stadiums.findStadium("Salt Lake Stadium");
		Stadiums.getStadiumNames();
		Stadiums.updateStadium(2,"M. A. Chidambaram Stadium");
		Stadiums.getStadiumNames();
		Stadiums.updateStadium("Jawaharlal Nehru Stadium","M. A. Chidambaram Stadium");
		Stadiums.getStadiumNames();
		
	}
}