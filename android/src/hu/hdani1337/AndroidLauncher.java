package hu.hdani1337;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;

import hu.hdani1337.marancsicsDash.marancsicsGame;

public class AndroidLauncher extends AndroidApplication {
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
		initialize(new marancsicsGame(), config);
		hideVirtualButtons();
	}

	@Override
	protected void onResume() {
		super.onResume();
		hideVirtualButtons();
	}

	@Override
	public void onBackPressed() {
		//ne lépjen ki a back gombbal
	}

	@Override
	protected void onRestart() {
		super.onRestart();
		AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
		initialize(new marancsicsGame(), config);
		hideVirtualButtons();
	}

	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	private void hideVirtualButtons() {
		getWindow().getDecorView().setSystemUiVisibility(
				View.SYSTEM_UI_FLAG_LAYOUT_STABLE
						| View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
						| View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
						| View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
						| View.SYSTEM_UI_FLAG_FULLSCREEN
						| View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
	}
}
