package com.laz.hud;

import com.badlogic.gdx.Game;

public class HudScratch extends Game {

    GameScreen gameScreen;

    @Override
    public void create() {
        gameScreen = new GameScreen(this);

        this.setScreen(gameScreen);
    }

    @Override
    public void render() {
        super.render();
    }
}
