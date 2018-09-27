import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class goosegame_test {
    GooseGame game = new GooseGame();
    @Test
    public void addplayerPippoTest() {
        game.userWrites("add player Pippo");

        String res = game.userRead();
        //assertThat(res, "players:Pippo" );
        assertEquals("players:Pippo", res);
    }

        @Test
        public void addplayerPlutoTest() {

        game.userWrites("add player Pippo");
        game.userWrites("add player Pluto");

        String res = game.userRead();
        assertEquals("players:Pippo, Pluto", res);
    }

    @Test
    public void duplicateplayerTest() {

        game.userWrites("add player Pippo");

        game.userWrites("add player Pippo");

        String res = game.userRead();
        assertEquals("Pippo: already existing player", res);
    }

    @Test
    public void startPippoTest() {
        addplayerPippoTest();
        addplayerPlutoTest();
        game.userWrites("move Pippo 4, 2");
        String res = game.userRead();
        assertEquals("Pippo rolls 4, 2. Pippo moves from Start to 6", res);
    }
    @Test
    public void startPlutoTest() {
        addplayerPippoTest();
        addplayerPlutoTest();
        game.userWrites("move Pluto 2, 2");
        String res = game.userRead();
        assertEquals("Pluto rolls 2, 2. Pippo moves from Start to 4", res);
    }
    @Test
    public void startPippo2Test() {
        addplayerPippoTest();
        addplayerPlutoTest();
        game.userWrites("move Pippo 2, 3");
        String res = game.userRead();
        assertEquals("Pippo rolls 2, 3. Pippo moves from 6 to 11", res);
    }

    @Test
    public void winTest() {
        addplayerPippoTest();
        addplayerPlutoTest();
        game.userWrites("move Pippo 1, 2");
        String res = game.userRead();
        assertEquals("Pippo rolls 1, 2. Pippo moves from 60 to 63. Pippo wins!!", res);
    }

}
