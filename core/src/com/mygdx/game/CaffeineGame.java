package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.ScreenUtils;

public class CaffeineGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture milkJugImage;
	private OrthographicCamera camera;
	Texture img;
	MilkJug milkJug;

	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("milkJug.png");
		milkJug = new MilkJug(img,700, 100, 64, 64);
		camera = new OrthographicCamera();
		camera.setToOrtho(false,1000,500);
	}

	@Override
	public void render () {
		ScreenUtils.clear(1, 0, 0, 1);
		batch.setProjectionMatrix(camera.combined);
		ScreenUtils.clear(.5f, 0.2f, 0.9f, 1);
		camera.update();

		batch.setProjectionMatrix(camera.combined);
		batch.begin();
		batch.draw(milkJug.jugImg,
		milkJug.posX,
		milkJug.posY,
		milkJug.width/2,
		milkJug.height/2,
		milkJug.width,
		milkJug.height,
		1f,
		1f,
		100f,
		0,
		0,
		1000,
		1000,
		false,
		false);
		batch.end();

	}
	
	@Override
	public void dispose () {
		batch.dispose();
		milkJugImage.dispose();
	}
}
