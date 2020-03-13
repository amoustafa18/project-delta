package dev.ahmedmoustafa;

import com.badlogic.ashley.core.Entity;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Contact;
import com.badlogic.gdx.physics.box2d.ContactImpulse;
import com.badlogic.gdx.physics.box2d.ContactListener;
import com.badlogic.gdx.physics.box2d.Manifold;
import com.badlogic.gdx.physics.box2d.World;
import com.badlogic.gdx.utils.Array;

/** A class that acts as an interface between the game world and the rest of the application. */
public class WorldManager {
    private World world;
    private Array<Entity> obstacles; //all live obstacles in the world, sorted by x-pos ascending
    private float timeSinceLastPhysicsStep; //in seconds

    private final static int VELOCITY_ITERATIONS = 6;
    private final static int POSITION_ITERATIONS = 2;
    private final static float GRAVITY = -5;
    private final static float WORLD_TIME_STEP = 1 / 100f;

    public WorldManager() {
        world = new World(new Vector2(0, GRAVITY), true);
        world.setContactListener(new WorldContactListener());
        obstacles = new Array<>();
    }

    public void update(float delta) {
        timeSinceLastPhysicsStep += delta;

        //set an upper bound on the number of world timesteps per second
        if(timeSinceLastPhysicsStep >= WORLD_TIME_STEP) {
            world.step(WORLD_TIME_STEP, VELOCITY_ITERATIONS, POSITION_ITERATIONS);
            timeSinceLastPhysicsStep -= WORLD_TIME_STEP;
        }
    }

    /** Class for handling all collisions in the Box2D World. */
    private class WorldContactListener implements ContactListener {
        @Override
        public void beginContact(Contact contact) {

        }

        @Override
        public void endContact(Contact contact) {

        }

        @Override
        public void preSolve(Contact contact, Manifold oldManifold) {

        }

        @Override
        public void postSolve(Contact contact, ContactImpulse impulse) {

        }
    }
}
