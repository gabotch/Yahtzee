/*
 Dice
 Defines the Dice object (set of 5 dice)
 Gabrielle Otchet 
 June 2, 2023
 Last updated: June 20, 2023
 */


public class Dice {
    private int dice1;//value of dice 1
    private boolean dice1change;//indicates if the dice 1 value will be changed upon rolling (true - yes, false - no)
    private int dice2;//value of dice 2
    private boolean dice2change;//indicates if the dice 2 value will be changed upon rolling (true - yes, false - no)
    private int dice3;//value of dice 3
    private boolean dice3change;//indicates if the dice 3 value will be changed upon rolling (true - yes, false - no)
    private int dice4;//value of dice 4
    private boolean dice4change;//indicates if the dice 4 value will be changed upon rolling (true - yes, false - no)
    private int dice5;//value of dice 5
    private boolean dice5change;//indicates if the dice 5 value will be changed upon rolling (true - yes, false - no)

    public Dice() {
        //Dice constructor
        dice1 = 0;//dice 1 value
        dice2 = 0;//dice 2 value
        dice3 = 0;//dice 3 value
        dice4 = 0;//dice 4 value
        dice5 = 0;//dice 5 value
    }

    /***********************************
     * roll 
     * Sets dice to their new values, calling the setDice method
     * parameters - dice1change, dice2change, dice3change, dice4change, dice5change -
       booleans that indicate whether the dice will or will not experience change in value
     * No return
     ************************************/
    public void roll(boolean dice1change, boolean dice2change, boolean dice3change, boolean dice4change, boolean dice5change) {
        
        //if the diceChange variable is true for an individual dice, the setDice method is called to set a new value
        if (dice1change == true) {
         setdice1();
        } 
        
        if (dice2change == true) {
            setdice2();
        }
       
        if (dice3change == true) {
            setdice3();
        }
        
        if (dice4change == true) {
            setdice4();
        }
        
        if (dice5change == true) {
            setdice5();
        }
    }

    public int getdice1() {
        return this.dice1;//gets the value of dice 1;
    }

    public int getdice2() {
        return this.dice2;//gets the value of dice 2;
    }
    public int getdice3() {
        return this.dice3;//gets the value of dice 3;
    }
    public int getdice4() {
        return this.dice4;//gets the value of dice 4;
    }
    public int getdice5() {
        return this.dice5;//gets the value of dice 5;
    }

    public void setdice1() {
        dice1 = (int) (Math.random() * 6) + 1;//sets the value of dice 1 to a random integer between 1-6
    }

    public void setdice2() {
        dice2 = (int) (Math.random() * 6) + 1;//sets the value of dice 2 to a random integer between 1-6
    }   
    public void setdice3() {
        dice3 = (int) (Math.random() * 6) + 1;//sets the value of dice 3 to a random integer between 1-6
    }
    public void setdice4() {
        dice4 = (int) (Math.random() * 6) + 1;//sets the value of dice 4 to a random integer between 1-6
    }
    public void setdice5() {
        dice5 = (int) (Math.random() * 6) + 1;//sets the value of dice 5 to a random integer between 1-6
    }
}
