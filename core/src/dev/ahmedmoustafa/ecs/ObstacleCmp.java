package dev.ahmedmoustafa.ecs;

import com.badlogic.ashley.core.Component;
import com.badlogic.ashley.core.Entity;
import com.badlogic.ashley.signals.Signal;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;

import dev.ahmedmoustafa.Obstacle;

/** Entity component that holds obstacle data. */
public class ObstacleCmp implements Component {
    public int id;
    public Vector2 position;
    public Drawable obstacleDrawable;
    public Obstacle obstacle;
    public Signal<Entity> onRemove; //dispatches an event when obstacle is removed from world
}
