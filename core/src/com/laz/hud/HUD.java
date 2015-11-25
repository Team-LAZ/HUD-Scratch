package com.laz.hud;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class HUD {

    BitmapFont font;
    SpriteBatch batch;

    Image imgBar[], imgHealth, imgMana;

    public HUD() {
        font = new BitmapFont();

        batch = new SpriteBatch();

        imgBar = new Image[2];

        //armor / hp
        imgBar[0] = new Image(new Texture("baroutline.png"));
        imgBar[0].setPosition(10, Gdx.graphics.getHeight() - 40);

        //magic / mana
        imgBar[1] = new Image(new Texture("baroutline.png"));
        imgBar[1].setPosition(Gdx.graphics.getWidth() / 2 - 300, Gdx.graphics.getHeight() - 40);

        imgHealth = new Image(new Texture("healthbar.png"));
        imgHealth.setPosition(imgBar[0].getX() + 3, imgBar[0].getY() + 3);

        imgMana = new Image(new Texture("manabar.png"));
        imgMana.setPosition(imgBar[1].getX() + 3, imgBar[1].getY() + 3);
    }

    public void init(Stage stage) {
        stage.addActor(imgBar[0]);
        stage.addActor(imgBar[1]);
        stage.addActor(imgHealth);
        stage.addActor(imgMana);
    }

    public void render() {
        batch.begin();

        //draw xp
        font.setColor(Color.YELLOW);
        font.draw(batch, "XP:", Gdx.graphics.getWidth() - 100, Gdx.graphics.getHeight() - 25);
        font.setColor(Color.WHITE);
        font.draw(batch, "100 / 300", Gdx.graphics.getWidth() - 120, Gdx.graphics.getHeight() - 50);

        //draw armor + hp bar
        font.draw(batch, "ARMOR: Level 1", 50, Gdx.graphics.getHeight() - 50);

        //draw magic + mana bar
        font.draw(batch, "MAGIC: Level 1", Gdx.graphics.getWidth() / 2 - 250, Gdx.graphics.getHeight() - 50);

        //draw attack
        font.draw(batch, "ATTACK: Level 1", Gdx.graphics.getWidth() / 2 + 150, Gdx.graphics.getHeight() - 50);

        batch.end();
    }

    public void adjustHP(int amount) {
        imgHealth.setWidth(imgHealth.getWidth() + amount);
    }

    public void adjustMP(int amount) {
        imgMana.setWidth(imgMana.getWidth() + amount);
    }
}
