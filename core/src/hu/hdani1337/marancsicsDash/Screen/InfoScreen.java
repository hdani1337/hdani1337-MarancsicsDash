package hu.hdani1337.marancsicsDash.Screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.utils.viewport.ExtendViewport;
import com.badlogic.gdx.utils.viewport.FitViewport;

import hu.hdani1337.marancsicsDash.MyBaseClasses.Scene2D.MyScreen;
import hu.hdani1337.marancsicsDash.Stage.CrashStage;
import hu.hdani1337.marancsicsDash.Stage.HomeStage;
import hu.hdani1337.marancsicsDash.Stage.InfoStage;
import hu.hdani1337.marancsicsDash.marancsicsGame;

public class InfoScreen extends MyScreen {
    InfoStage infoStage;

    public InfoScreen(marancsicsGame game) {
        super(game);
        float keparany = Gdx.graphics.getWidth() / (Gdx.graphics.getHeight()/1.0f);
        if (keparany >= (21/9f)) infoStage = new InfoStage(new FitViewport(1680,720),spriteBatch,game);
        else if (keparany >= (19/9f)) infoStage = new InfoStage(new FitViewport(1520,720),spriteBatch,game);
        else if (keparany >= (18.67/9.0f)) infoStage = new InfoStage(new FitViewport(1493,720),spriteBatch,game);
        else if (keparany >= (18.5f/9.0f)) infoStage = new InfoStage(new FitViewport(1480,720),spriteBatch,game);
        else if (keparany >= (18/9f)) infoStage = new InfoStage(new FitViewport(1440,720),spriteBatch,game);
        else infoStage = new InfoStage(new FitViewport(1280,720),spriteBatch,game);
        Gdx.input.setInputProcessor(infoStage);
    }

    @Override
    public void init() {

    }

    @Override
    public void render(float delta) {
        super.render(delta);
        infoStage.act(delta);
        if(delta >= 0){
            infoStage.draw();
        }
    }
}
