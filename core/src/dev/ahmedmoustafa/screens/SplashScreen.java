package dev.ahmedmoustafa.screens;

import com.badlogic.gdx.Screen;

import dev.ahmedmoustafa.ScreenManager;

public class SplashScreen implements Screen {
    private ScreenManager screenManager;

    public SplashScreen(ScreenManager screenManager) {
        this.screenManager = screenManager;
    }

    @Override
    public void show() {
        //initialize assets then switch to game screen

        screenManager.pop(true);
        screenManager.push(new GameScreen(screenManager));
    }

    @Override
    public void render(float delta) {
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
