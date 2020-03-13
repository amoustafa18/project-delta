package dev.ahmedmoustafa;

import com.badlogic.ashley.core.Entity;

import java.util.Random;

/** A class that handles the generation of background scenes and world obstacles. */
public class WorldGenerator {
    private Random random;

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
     * will have an x position of at least {@code minimumX}. If {@code lastObstacle} is null,
     * it is ignored and only {@code minimumX} is used.
     * @param lastObstacle The last obstacle in the world. Must be the rightmost active obstacle
     *                     in the world.
     * @return Newly generated obstacle.
     */
    public Entity generateObstacle(Entity lastObstacle, float minimumX) {
        return null;
    }

}
