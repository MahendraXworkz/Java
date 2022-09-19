class Hockey{
static void getMensTeamMembersName(String[] TeamMembersName){
	System.out.println("Inside getMensTeamMembersName");
	for(int i=0;i<TeamMembersName.length;i++){
		System.out.println(TeamMembersName[i]);
	}
	System.out.println("Outside getMensTeamMembersName\n");
}

static void getWomensTeamMembersName(String[] TeamMembersName){
	System.out.println("Inside getWomensTeamMembersName");
	for(int i=0;i<TeamMembersName.length;i++){
		System.out.println(TeamMembersName[i]);
	}
	System.out.println("Outside getWomensTeamMembersName");
}
}