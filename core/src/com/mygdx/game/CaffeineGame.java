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
	private Rectangle milkJug;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		milkJugImage = new Texture("tempjug.png");
		camera = new OrthographicCamera();
		camera.setToOrtho(false, 1000,500);

		milkJug = new Rectangle();
		milkJug.x = 600;
		milkJug.y = 90;
		milkJug.width = 64;
		milkJug.height = 64;

	}

	@Override
	public void render () {
		ScreenUtils.clear(.5f, 0.2f, 0.9f, 1);
		camera.update();

		batch.setProjectionMatrix(camera.combined);
		batch.begin();
		batch.draw(milkJugImage,
				milkJug.x,
				milkJug.y,
				milkJug.x,
				milkJug.y,
				milkJug.width,
				milkJug.height,
				1f,
				1f,
				0f,
				0,
				0,
				64,
				64,
				false,
				false
				);
		batch.end();

	}
	
	@Override
	public void dispose () {
		batch.dispose();
		milkJugImage.dispose();
	}
}
