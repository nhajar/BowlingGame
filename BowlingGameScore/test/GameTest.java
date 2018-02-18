import bowlinggamescore.Game;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {

     @Test
     public void scoreTestStrike() {
        Game partie = new Game("10,10,10,10,10,10,10,10,10,10,10,10");
        assertEquals(300, partie.score());
     }
     
     @Test
     public void scoreTestSimple() {
        Game partie = new Game("9,0,9,0,9,0,9,0,9,0,9,0,9,0,9,0,9,0,9,0");
        assertEquals(90, partie.score());
     }
     @Test
     public void scoreTestSpare() {
        Game partie = new Game("5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5");
        assertEquals(150, partie.score());
     }
     
}
