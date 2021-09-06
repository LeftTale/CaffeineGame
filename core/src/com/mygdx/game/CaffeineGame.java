package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.ScreenUtils;

public class CaffeineGame extends ApplicationAdapter {
    SpriteBatch batch;
    Texture milkJugImage;
    private OrthographicCamera camera;

    @Override
    public void create () {
        batch = new SpriteBatch();
        milkJugImage = new Texture("tempjug.png");

        camera = new OrthographicCamera();
        camera.setToOrtho(false,1000,500);
    }

    @Override
    public void render () {
        camera.update();
        ScreenUtils.clear(1, 0, 0, 1);

        GameLogic();

        batch.setProjectionMatrix(camera.combined);
        batch.begin();
        HandleGraphics();
        batch.end();
    }

    public void GameLogic()
    {

        Vector3 touchPos = new Vector3();
        touchPos.set(Gdx.input.getX(),Gdx.input.getY(),0);
        camera.unproject(touchPos);


    }


    public void HandleGraphics()
    {

    }


    @Override
    public void dispose () {
        batch.dispose();
        milkJugImage.dispose();
    }
}
