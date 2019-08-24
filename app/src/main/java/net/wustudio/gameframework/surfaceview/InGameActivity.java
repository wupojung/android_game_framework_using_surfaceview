package net.wustudio.gameframework.surfaceview;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class InGameActivity extends Activity {

    private GameSurfaceView gameSurfaceView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // fullscreen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //自定義 SurfaceView 取代 View
        gameSurfaceView = new GameSurfaceView(this);
        setContentView(gameSurfaceView);
    }
}
