package dev.ahmedmoustafa;

import com.badlogic.gdx.physics.box2d.Contact;

/** A class that acts as an interface between the player and the rest of the game. */
public class PlayerManager {
    private Player player;

    public PlayerManager(Player player) {
        this.player = player;
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
     * Called when the player collides with a fixture.
     * @param contact The contact between the player and another fixture.
     */
    public void handlePlayerCollision(Contact contact){

    }

    public void update(float delta) {

    }
}
