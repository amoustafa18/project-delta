package dev.ahmedmoustafa;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class Player extends Actor {
    private int score;

    public Player() {

    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        super.draw(batch, parentAlpha);
    }

    @Override
    public void act(float delta) {
        super.act(delta);
    }

    public void incrementScore(int incr) {
        score += incr;
    }

    public int getScore() {
        return score;
    }
}
