package hu.hdani1337.marancsicsDash.Screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.utils.viewport.FitViewport;

import hu.hdani1337.marancsicsDash.MyBaseClasses.Scene2D.MyScreen;
import hu.hdani1337.marancsicsDash.Stage.VictoryStage;
import hu.hdani1337.marancsicsDash.marancsicsGame;

public class VictoryScreen extends MyScreen {

    VictoryStage victoryStage;

    public VictoryScreen(marancsicsGame game) {
        super(game);
        victoryStage = new VictoryStage(new FitViewport(Gdx.graphics.getWidth(),Gdx.graphics.getHeight()),spriteBatch,game);
        Gdx.input.setInputProcessor(victoryStage);
    }

    @Override
    public void init() {

    }

    @Override
    public void render(float delta) {
        super.render(delta);
        if(delta >= 0)
        {
            victoryStage.act(delta);
            victoryStage.draw();
        }
    }
}