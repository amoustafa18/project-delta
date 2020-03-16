package dev.ahmedmoustafa;

import com.badlogic.ashley.core.Entity;
import com.badlogic.ashley.signals.Listener;
import com.badlogic.ashley.signals.Signal;
import com.badlogic.gdx.utils.Array;

import java.util.Random;

import dev.ahmedmoustafa.ecs.CmpMap;
import dev.ahmedmoustafa.ecs.ObstacleCmp;

/** A class that handles the generation of terrain, background scenes and world obstacles. */
public class WorldGenerator {
    private Random random;
    private Entity lastObstacle; //the last generated obstacle
    private Scene lastScene; //the last generated scene
    private int obstacleCounter;

    public WorldGenerator(){
        random = new Random();
    }

    public WorldGenerator(long seed) {
        this();
        random.setSeed(seed);
    }

    //TODO note to self: ensure that all obstacles spawn at a minimum x position of player.x +VIEWPORT_WIDTH
    //TODO note to self: use PooledEngine when setting up ecs to ensure Entities are pooled.
    /**
     * Generates an obstacle Entity with enough spacing between the last generated obstacle. This
     * prevents obstacles from being generated too close together in the world. Any obstacle generated
     * will have an x position of at least {@code minimumX}.
     * @return Newly generated obstacle.
     */
    public Entity generateObstacle(float minimumX) {
        //TODO set id of each Entity in ObstacleCmp to be obstacleCounter
        //TODO if lastObstacle is null, ignore it and only use minimumX
        obstacleCounter++;
        return null;
    }

    public Array<Entity> generateObstacleChain(float minimumX) {
        //TODO increase obstacleCounter by the amount of obstacles in the chain
        //TODO set id of each Entity in ObstacleCmp to be obstacleCounter
        //TODO if lastObstacle is null, ignore it and only use minimumX
        return null;
    }

    /**
     * Generates an environment Scene from the Scene pool. The generated scene will not be identical to
     * the one generated from the last time this method was called.
     * @return Newly generated Scene.
     */
    public Scene generateScene() {
        return null;
    }

    /** A Listener that receives a Signal containing an Entity when that Entity is removed from the world. */
    private class ObstacleRemovedListener implements Listener<Entity> {
        /** @throws java.lang.IllegalArgumentException if {@code object} does not have an ObstacleCmp. */
        @Override
        public void receive(Signal<Entity> signal, Entity object) throws IllegalArgumentException {
            ObstacleCmp obsCmp = CmpMap.OBSTACLE.get(object);
            if(obsCmp == null) {
                throw new IllegalArgumentException("Entity must have an ObstacleCmp.");
            }

            ObstacleCmp obsCmpLastObs = CmpMap.OBSTACLE.get(lastObstacle);
            if(obsCmpLastObs.id == obsCmp.id) {
                //the last generated obstacle has been removed from the world
                lastObstacle = null;
            }
        }
    }
}
