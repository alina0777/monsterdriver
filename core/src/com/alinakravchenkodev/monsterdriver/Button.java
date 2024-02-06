package com.alinakravchenkodev.monsterdriver;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class Button {
    private Texture tx;
    private Vector2 pos;

    public Button() {
        tx = new Texture("gas.png");
        pos = new Vector2(100, 100);
    }

    public void render(SpriteBatch batch) {
        batch.draw(tx, pos.x, pos.y,200,200);

    }
}
