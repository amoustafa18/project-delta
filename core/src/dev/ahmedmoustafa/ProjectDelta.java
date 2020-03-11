package dev.ahmedmoustafa;

import com.badlogic.gdx.Game;

import dev.ahmedmoustafa.screens.SplashScreen;

public class ProjectDelta extends Game {
	private ScreenManager screenManager;
	
	@Override
	public void create () {
		screenManager = new ScreenManager(this);
		screenManager.push(new SplashScreen(screenManager));
	}

	@Override
	public void render () {
		super.render();
	}
	
	@Override
	public void dispose () {
		super.dispose();
	}
}
