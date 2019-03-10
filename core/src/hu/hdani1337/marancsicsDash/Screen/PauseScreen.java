package hu.hdani1337.marancsicsDash.Screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.utils.viewport.ExtendViewport;
import com.badlogic.gdx.utils.viewport.FitViewport;

import hu.hdani1337.marancsicsDash.MyBaseClasses.Scene2D.MyScreen;
import hu.hdani1337.marancsicsDash.Stage.PauseStage;
import hu.hdani1337.marancsicsDash.marancsicsGame;

public class PauseScreen extends MyScreen {
    PauseStage pauseStage;

    public PauseScreen(marancsicsGame game, float tankX, float tankY, float zsoltiR, float zsoltiY) {
        super(game);
        pauseStage = new PauseStage(new ExtendViewport(Gdx.graphics.getWidth(),Gdx.graphics.getHeight()),spriteBatch,game,tankX,tankY,zsoltiR,zsoltiY);
        Gdx.input.setInputProcessor(pauseStage);
    }

    @Override
    public void init() {

    }

    @Override
    public void render(float delta) {
        super.render(delta);
        pauseStage.act(delta);
        pauseStage.draw();
    }
}
