package cn.edu.jnu.x2020101371;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class BowlingGameUnitTest {

    private BowlingGame game;

    @Before
    public void setUp() throws Exception {
        game = new BowlingGame();
    }

    @Test

    public void testZeros() {
        repeatedRoll(0, 20);
        //测试语句，测试是否等于0
        assertEquals(0, game.score());
    }
/*
    @Test
    public void test200nes() {
        repeatedRoll(1,20);
        //测试语句，测试是否等于0
        assertEquals(20, game.score());
    }*/

    private void repeatedRoll(int pin, int times) {
        for (int i = 0; i < times; i++) {
            game.roll(pin);
        }
    }
}