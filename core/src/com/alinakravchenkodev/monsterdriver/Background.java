package com.alinakravchenkodev.monsterdriver;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

import jdk.internal.org.jline.utils.Display;

public class Background {

    class BGPictire {
        private Texture tx;
        private Vector2 pos;

        public BGPictire(Vector2 pos) {
            tx = new Texture("road_line.png");
            this.pos = pos;
        }
    }

    private BGPictire[] backs;

    private int speed;
    public Background() {
        speed = 8;

        backs = new BGPictire[2];
        backs[0] = new BGPictire(new Vector2(0,0));
        backs[1] = new BGPictire(new Vector2(0, Gdx.graphics.getHeight()));
    }

    public void render(SpriteBatch batch) {

        for (int i = 0; i < backs.length; i++) {
            batch.draw(backs[i].tx, backs[i].pos.x, backs[i].pos.y, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        }

    }

    public void update() {

        for (int i = 0; i < backs.length; i++){
           backs[i].pos.y -= speed;
        }
        

        if (backs[0].pos.y < -Gdx.graphics.getHeight()){
            backs[0].pos.y = 0;
            backs[1].pos.y = Gdx.graphics.getHeight();
        }

    }

}
