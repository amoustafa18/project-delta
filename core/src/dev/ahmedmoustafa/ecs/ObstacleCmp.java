package dev.ahmedmoustafa.ecs;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;

import dev.ahmedmoustafa.Obstacle;

/** Entity component that holds obstacle data. */
public class ObstacleCmp {
    public Vector2 position;
    public Drawable obstacleDrawable;
    public Obstacle obstacle;
}
