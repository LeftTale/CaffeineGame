package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.utils.ScreenUtils;

public class CaffeineGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture milkJugImage;
	private OrthographicCamera camera;
	Item milkJug;

	@Override
	public void create () {
		batch = new SpriteBatch();
		milkJugImage = new Texture("tempjug.png");
		milkJug = new Item(700, 100, 64, 64, milkJugImage,0);
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

		if(milkJug.contains(touchPos.x,touchPos.y))
		{
			milkJug.activeMove = Gdx.input.isButtonPressed(Input.Buttons.LEFT);

			if(milkJug.activeMove)
			{
				milkJug.x = touchPos.x - 32;
				milkJug.y = touchPos.y - 32;

				if (Gdx.input.isKeyPressed(Input.Keys.Q)) {
					milkJug.rotation += 100 * Gdx.graphics.getDeltaTime();
				} else if (Gdx.input.isKeyPressed(Input.Keys.E)) {
					milkJug.rotation -= 100 * Gdx.graphics.getDeltaTime();
				}
			}
		}
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
