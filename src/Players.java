/*
 Players
 Defines the player object
 Gabrielle Otchet 
 June 3, 2023
 Last updated: June 20, 2023
 */

public class Players {

    private String playerName;//name of player
    public Integer[] scoreCard = new Integer[20];//integer array that simulates a score card

    /* player constructor
    no parameters - assigns a default name of "player". Note: not used in this program, 
    would be useful if the program had no error checking for no inputted name*/
    public Players() {
        playerName = "player";//assigns a default name "player" 
    }

    /* player constructor 
     parameters - String pName: player name 
     */
    public Players(String pName) {
        playerName = pName;
    }

    public String getplayerName() {
        return this.playerName;//gets player name
    }

    public void setplayerName(String inputtedName) {
        playerName = inputtedName;//sets player name. (not used in yahtzee program since the players object is public)
    }
}
