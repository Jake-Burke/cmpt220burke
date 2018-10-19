import java.util.Date;
import java.util.Random;

class Player{											//player class
	private String name;
	private int goals;
	private String team;

	Player(){											//no arg constructor
	
		}

	Player(String name, int goal, String team){			//player method
		this.name = name;
		this.goals = goal;
		this.team = team;
		}

	void setName(String name){							//all getters and setters for player class
		this.name = name;
		}

	void setTeam(String team){
		this.team = team;
		}

	void setGoals(int goals){
		this.goals = goals;
		}
	
	String getName(){
		return name;
		}

	String getTeam(){
		return team;
		}

	int getGoals(){
		return goals;
		}

	public String toString(){							//displays name team and goals
		return "\n Name: " + name + " Team: " + team + " Goals: " + goals;
}
}
	class Goal{											//goal class
		private int minute;
		private Player player;

	Goal(){												//no arg constructor
		minute = 0;
		player = null;
		}
	
	Goal(int min, Player p){							//goal method
		minute = min;
		player = p;
		}

	void setMinute(int minute){							//getters and setter for goal class
		this.minute = minute;
		}

	void setPlayer(Player player){
		this.player = player;
		}

	int getMinute(){
		return minute;
		}

	Player getPlayer(){
		return player;
		}

	public String toString(){							//displays name and when goal scored
		return "\n " +player.getName()+" = scored the goal at : " + minute+" minutes";
		}
		}

	public class SoccerMatch{							//all data fields for soccerMatch Class
		Date startTime;
		Date endTime;
		String location;
		String home;
		String visitor;
		Player homePlayers[];
		Player visitorPlayers[];
		Goal homeGoals[];
		Goal visitorGoals[];
		int homePlayerCount;
		int visitorPlayerCount;
		int homeGoalCount;
		int visitGoalCount;

	SoccerMatch(){					
		startTime =null;
		endTime = null;
		location =null;
		home =null;
		visitor = null;
		homePlayers = new Player[11];
		visitorPlayers = new Player[11];
		homeGoals = new Goal[10];
		visitorGoals = new Goal[10];
		homePlayerCount =0;
		visitorPlayerCount =0;
		homeGoalCount =0;
		visitGoalCount = 0;

		for(int i = 0; i < 11; i++){					//loop to get the players
			homePlayers[i] = new Player();
			visitorPlayers[i] = new Player();
		}

		for(int i = 0; i < 10; i++){					//loop to get the goals
			homeGoals[i] = new Goal();
			visitorGoals[i] = new Goal();
		}
		}

	SoccerMatch(Date newStartTime, Date newEndTime, String newLocation, String newHome, String newVisitor){		//SoccerMatch Method
		this();
		startTime = newStartTime;
		endTime = newEndTime;
		location = newLocation;
		home = newHome;
		visitor = newVisitor;
		}

	void addHomePlayer(Player p){						//adds a player
		homePlayers[homePlayerCount++] = p;
		}

	void addVisitorPlayer(Player p){					//adds a visitor
		visitorPlayers[visitorPlayerCount++] = p;
		}

	void addHomeGoal(Goal g){							//adds a goal
		homeGoals[homeGoalCount++] = g;
		}

	void addVisitorGoal(Goal g){						//adds visitor goal
		visitorGoals[visitGoalCount++] = g;
		}

	int [] getHomeGoals(){								//gets home goal
	int goals[] = new int[10];
	
		for(int i = 0; i < 10; i++)						//loops through to see who got the goal
			goals[i] = homeGoals[i].getPlayer().getGoals();
			return goals;

		}

	int [] getVisitorGoals(){							//gets visitor goal
	int goals[] = new int[10];
	
		for(int i = 0; i < 10; i++)						//loops through to see who got what goal
			goals[i] = visitorGoals[i].getPlayer().getGoals();
			return goals;
		}

	String getWinner(){									//gets winner method
		String winStatus = "";
		int homeGoals[] = getHomeGoals();
		int visitorGoals[] = getVisitorGoals();	
		int totalHome = 0, totalVisit = 0;

		for(int i = 0; i < 10; i++){				//loops through to add up goals
			totalHome += homeGoals[i];
			totalVisit += visitorGoals[i];
		}
		
		winStatus = "\n Red Foxes: " + totalHome + "\n Patriots: " + totalVisit;		//disppls who won

		if(totalHome > totalVisit)
			winStatus += "\n Winner: Red Foxes";
		else if(totalVisit > totalHome)
			winStatus += "\n Winner: Patriots";
		else
			winStatus += "\n Tie";						//could be a tie
		return winStatus;
}

	public static void main(String[] args){
		Random rand = new Random();
	
		Date dateStart = new Date(2018, 10, 14, 9, 18, 32);					//start and end time
		Date dateEnd = new Date(2018, 10, 13, 12, 43, 35);

		SoccerMatch Soccer = new SoccerMatch(dateStart, dateEnd, "Red Foxes", "Patriots", "Other");		//team names

		String homePlayerName [] = {"Jake", "Steve", "Patrick", "Bill", "Joe", "Mike", "John", "Kevin", "James", "Thomas", "Anthony"};	//players
		String visitorPlayerName [] = {"Justin", "Zach", "Dillon", "Kyle", "Henry", "Andy", "Dave", "Frank", "Tim", "Tony", "Roger"};

	for(int i = 0; i < 11; i++){		//loops through players
	Soccer.addHomePlayer(new Player(homePlayerName[i], rand.nextInt(10), "Red Foxes"));
	Soccer.addVisitorPlayer(new Player(visitorPlayerName[i], rand.nextInt(10), "Patriots"));
		}

	for(int i = 0; i < 10; i++){		//loops through players
		Soccer.addHomeGoal(new Goal(rand.nextInt(59), Soccer.homePlayers[i]));
		Soccer.addVisitorGoal(new Goal(rand.nextInt(59), Soccer.visitorPlayers[i]));
		}

	System.out.print("Team Red Foxes");						//displays players
		for(int i = 0; i < 11; i++)
			System.out.println(Soccer.homePlayers[i]);

	System.out.print("Team Patriots");						//displays visitor players
		for(int i = 0; i < 11; i++)
			System.out.println(Soccer.visitorPlayers[i]);

	System.out.print("Red Foxes Goals");					//displays goals
		for(int i = 0; i < 10; i++)
			System.out.println(Soccer.homeGoals[i]);
		
	System.out.print("Patriots Goals");						//displays visitor goals
	for(int i = 0; i < 10; i++)
			System.out.println(Soccer.visitorGoals[i]);
	
	System.out.println("----------------------------------------");			//final score 
	System.out.print("Final information");
	System.out.println(Soccer.getWinner());
	}
	}