package dev.ahmedmoustafa.ecs;

import com.badlogic.ashley.core.ComponentMapper;

public abstract class CmpMap {
    public static final ComponentMapper<ObstacleCmp> OBSTACLE = ComponentMapper.getFor(ObstacleCmp.class);
}
