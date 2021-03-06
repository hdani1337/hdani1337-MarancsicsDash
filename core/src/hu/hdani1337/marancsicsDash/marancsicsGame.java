package hu.hdani1337.marancsicsDash;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;

import hu.hdani1337.marancsicsDash.Global.Assets;
import hu.hdani1337.marancsicsDash.ParentClasses.Game.MyGame;
import hu.hdani1337.marancsicsDash.Screen.LoadingScreen;

public class marancsicsGame extends MyGame {

	public static boolean desktop = false;
	public static boolean notch = false;

	public Label.LabelStyle getLabelStyle() {
		Label.LabelStyle style;
		style = new com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle();
		style.font = Assets.manager.get(Assets.FONT);
		style.fontColor = Color.WHITE;
		return style;
	}

	public TextButton.TextButtonStyle getButtonStyle(){
		TextButton.TextButtonStyle buttonStyle = new TextButton.TextButtonStyle();
		buttonStyle.font = Assets.manager.get(Assets.FONT);
		buttonStyle.fontColor = new Color(1, 1, 1, 1);
		buttonStyle.overFontColor = new Color(0, 1, 0, 1);
		buttonStyle.downFontColor = new Color(1, 0, 0, 1);

		return buttonStyle;
	}

	public static int keparany()
	{
		float keparany = Gdx.graphics.getWidth() / (Gdx.graphics.getHeight()/1.0f);
		int egyArany = 80;//egy arányra eső szélesség 720-as magasságnál ((720/9)*x)
		int x = 1;//szélességi arány
		if(desktop) egyArany = 100;
		while (keparany > (x/9.0f)) x++;

		if((int)keparany*(x*egyArany) != Gdx.graphics.getWidth() && egyArany != 100) return (int)(720.0/Gdx.graphics.getHeight() * Gdx.graphics.getWidth());
		else if((int)keparany*(x*egyArany) != Gdx.graphics.getWidth() && egyArany == 100) return (int)(900.0/Gdx.graphics.getHeight() * Gdx.graphics.getWidth());
		//Ha nem pontos a képarány számítása, akkor a világ szélessége legyen a telefon kijelzőjének szélessége 720 pixelhez viszonyítva

		return x * egyArany;
	}

	@Override
	public void create () {
		Assets.prepare();
		setScreen(new LoadingScreen(this));
	}
}
