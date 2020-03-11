package dev.ahmedmoustafa;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;

import java.util.Stack;

/** A class for storing and managing the game's screens. */
public class ScreenManager {
    private Stack<Screen> screenStack;
    private Game game;

    public ScreenManager(Game game) {
        screenStack = new Stack<>();
        this.game = game;
    }

    /**
     * Push a screen to the screen stack. Sets the screen to be the game's current screen.
     * @param screen The screen to push to the screen stack.
     * @return The same screen supplied.
     */
    public Screen push(Screen screen) {
        screenStack.push(screen);
        game.setScreen(screen);
        return screen;
    }

    /**
     * Gets the game's current screen.
     * @throws java.util.EmptyStackException if there is no current screen set.
     */
    public Screen peek() {
        return screenStack.peek();
    }

    /**
     * Removes the current screen from the screen stack. If another Screen is in the stack after removal,
     * that screen will be set as the current game screen.
     * @param dispose Whether or not to call the current Screen's dispose() method after removal.
     * @return The removed screen.
     */
    public Screen pop(boolean dispose) {
        Screen currScreen = screenStack.pop();

        if(dispose) {
            currScreen.dispose();
        }

        if(screenStack.size() > 0) {
            game.setScreen(screenStack.peek());
        }

        return currScreen;
    }

    /**
     * Get the number of Screens in the screen stack.
     */
    public int size() {
        return screenStack.size();
    }
}
