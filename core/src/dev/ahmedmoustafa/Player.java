package dev.ahmedmoustafa;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.physics.box2d.Contact;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class Player extends Actor {
    private int score;

    public Player() {

    }

    /**
     * Detonates the player's skateboard.
     */
    public void detonate() {
    }

    /**
     * Simulates a player jump in the world.
     */
    public void jump() {

    }

    /**
     * Simulates a player kickflip in the world.
     */
    public void kickflip() {

    }

    /**
     * Called when the player collides with a fixture.
     * @param contact The contact between the player and another fixture.
     */
    public void handlePlayerCollision(Contact contact){

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