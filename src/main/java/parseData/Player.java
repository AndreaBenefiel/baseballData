package parseData;

/**
 * This class implements a player with attributes year, team, ID, league, salary
 * @author Andrea Benefiel
 *
 */

public class Player {
	String year;
	String team;
	String playerID;
	String league;
	String salary;
	
	/**
	 * This constructor creates an individual baseball player with the following parameters
	 * @param newYear
	 * @param newTeam player's team
	 * @param newLeague player's team's league
	 * @param newID player's ID
	 * @param newSalary player's salary
	 */
	Player(String newYear, String newTeam, String newLeague, String newID, String newSalary){
		year = newYear;
		team = newTeam;
		playerID = newID;
		league = newLeague;
		salary = newSalary;
	}
	
	/**
	 * This returns the player's team
	 * @return this player's team
	 */
	public String getTeam() {
		return team;
	}
	
	/**
	 * This returns the player's year
	 * @return this player's year
	 */
	public String getYear() {
		return year;
	}
	
	/**
	 * This returns the player's ID
	 * @return this player's ID
	 */
	public String getID() {
		return playerID;
	}
	
	/**
	 * 
	 * @return this player's team's league
	 */
	public String getLeague() {
		return league;
	}
	
	/**
	 * 
	 * @return this player's salary
	 */
	public String getSalary() {
		return salary;
	}
	
	/**
	 * This prints out all known information about this player
	 */
	public void getAllStats() {
		System.out.println(playerID + "played for " + team + " in " + year + " in the " + league + " , earning " + salary +  " per year.");
	}
	
}
