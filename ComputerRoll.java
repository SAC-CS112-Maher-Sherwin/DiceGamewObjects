package dicegame;

public class ComputerRoll {
    
    int i = 1 + (int) (Math.random() * 6);
            
    public int getRoll() {
        
        return i;
        
    }
    
}