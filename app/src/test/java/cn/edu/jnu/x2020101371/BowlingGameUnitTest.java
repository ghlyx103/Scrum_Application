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

    @Test
    public void test200nes() {
        repeatedRoll(1,20);
        //测试语句，测试是否等于20
        assertEquals(20, game.score());
    }

    //测试补中
    @Test
    public void testASpare() {
        game.roll(5);
        game.roll(5);//补中
        game.roll(3);
        //后面17次均为0
        repeatedRoll(0,17);
        //测试语句，测试是否等于13+3
        assertEquals(16, game.score());
    }
/*
    //一次全中的情况
    @Test
    public void testAStrike() {
        game.roll(10);//全中
        game.roll(5);
        game.roll(3);
        //后面17次均为0
        repeatedRoll(0,16);
        //测试语句，测试是否等于18+8
        assertEquals(26, game.score());
    }

    //10轮全中
    @Test
    public void testFullStrike() {

        for(int i = 0; i < 12; i ++) {
            game.roll(10);//全中
        }
        //测试语句，测试是否等于300
        assertEquals(300, game.score());
    }*/

    private void repeatedRoll(int pin, int times) {
        for (int i = 0; i < times; i++) {
            game.roll(pin);
        }
    }
}