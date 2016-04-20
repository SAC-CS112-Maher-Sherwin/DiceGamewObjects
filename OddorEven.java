package dicegame;

public class OddorEven {
    
    String a;
   
    public String setOddorEven (int diceRoll){
    
        if (diceRoll == 1 || diceRoll == 3 || diceRoll == 5)
            a = "odd"; 
        else 
            a = "even";    
        
        return a;
        
    }

}