package com.alinakravchenkodev.monsterdriver;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Player {
    Texture tx;
    Image image;

    int speed = 10;

    public boolean move_left;
    public boolean move_right;

    public Player() {
        this.tx = new Texture("car.png");

        image = new Image(tx);
        image.setHeight(300);
        image.setWidth(300);
        image.setPosition(500,500);
    }

    public void render() {
        update();
    }

    public void update() {

        if (move_left){
            image.setPosition(image.getX()-speed, image.getY());
        }

        if (move_right){
            image.setPosition(image.getX()+speed, image.getY());
        }
    }

    public Image getImage() {
        return image;
    }


    public void setMove_left(boolean move_left) {
        this.move_left = move_left;
    }
    public void setMove_right(boolean move_left) {
        this.move_right = move_left;
    }


    public boolean getMoveLeft() {
        return move_left;
    }

    public boolean getMoveRight() {
        return move_right;
    }

}
