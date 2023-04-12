package cn.edu.jnu.x2020101371;
public class BowlingGame {

    int score = 0;
    //int pins[] = new int[21];
    //int currentPinIndex = 0;

    public void roll(int pin) {
        //pins[currentPinIndex ++] = pin;
        score += pin;
    }

    public int score() {
/*
        int totalScore = 0;
        int currentFrameScoreIndex = 0;//轮的分数

        //引入轮的概念currentFrame
        for(int currentFrame = 0; currentFrame < 10; currentFrame ++)
        {
            totalScore += pins[currentFrameScoreIndex];

            //全中情况
            if (10 == pins[currentFrameScoreIndex]) {
                totalScore += pins[currentFrameScoreIndex + 1] + pins[currentFrameScoreIndex + 2];
            }
            //若为补中，则把下下个球的分数也计入当前轮
            else if (10 == pins[currentFrameScoreIndex] + pins[currentFrameScoreIndex + 1]) {
                totalScore += pins[currentFrameScoreIndex + 1];
                totalScore += pins[currentFrameScoreIndex + 2];
                currentFrameScoreIndex ++;
            }
            else{
                totalScore += pins[currentFrameScoreIndex + 1];
                currentFrameScoreIndex ++;
            }
            currentFrameScoreIndex ++;
        }
        return totalScore;

*/
        return score;
    }
}

