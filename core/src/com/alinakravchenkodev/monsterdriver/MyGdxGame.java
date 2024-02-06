package com.alinakravchenkodev.monsterdriver;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Background bg;

	//Button button;

	@Override
	public void create () {
		batch = new SpriteBatch();
		bg = new Background();
		//button = new Button();

	}

	@Override
	public void render () {
		update();

		ScreenUtils.clear(1, 1, 1, 1);



		batch.begin();
		bg.render(batch);
		batch.end();

	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}

	public void update() {
		bg.update();
	}
}
