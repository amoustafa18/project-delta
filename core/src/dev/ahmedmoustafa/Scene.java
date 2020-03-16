package dev.ahmedmoustafa;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.physics.box2d.Body;

/** An environment scene. Contains data for background layers, foreground, and the terrain body. */
public class Scene {
    private String name; //unique scene name
    private Texture[] bgLayers; //index 0 drawn first
    private Texture foreground;
    private Body terrain;

    public Scene(String name, Texture[] bgLayers, Texture foreground, Body terrain) {
        this.name = name;
        this.bgLayers = bgLayers;
        this.foreground = foreground;
        this.terrain = terrain;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Texture[] getBgLayers() {
        return bgLayers;
    }

    public void setBgLayers(Texture[] bgLayers) {
        this.bgLayers = bgLayers;
    }

    public Texture getForeground() {
        return foreground;
    }

    public void setForeground(Texture foreground) {
        this.foreground = foreground;
    }

    public Body getTerrain() {
        return terrain;
    }

    public void setTerrain(Body terrain) {
        this.terrain = terrain;
    }
}
