package com.laz.hud.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.laz.hud.HudScratch;

public class DesktopLauncher {

    public static void main(String[] arg) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.title = "HUD Scratch";
        config.width = 1280;
        config.height = 720;
        new LwjglApplication(new HudScratch(), config);
    }
}
