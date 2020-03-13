package dev.ahmedmoustafa.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;

import dev.ahmedmoustafa.ScreenManager;
import dev.ahmedmoustafa.WorldManager;

public class GameScreen implements Screen {
    private ScreenManager screenManager;
    private WorldManager worldManager;

    public GameScreen(ScreenManager screenManager) {
        this.screenManager = screenManager;
        worldManager = new WorldManager();
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClear( GL20.GL_COLOR_BUFFER_BIT | GL20.GL_DEPTH_BUFFER_BIT);
        worldManager.update(delta);
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
