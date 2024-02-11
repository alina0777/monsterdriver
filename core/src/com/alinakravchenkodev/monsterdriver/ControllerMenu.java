package com.alinakravchenkodev.monsterdriver;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

public class ControllerMenu {

    Player player;
    private Stage stage;

    ButtonController button_left;
    ButtonController button_right;


    class ButtonController {
        private Texture tx;
        private TextureRegion txRegion;
        private TextureRegionDrawable txRegionDrawable;
        private ImageButton button;

       public ButtonController(String filesPath, int wight, int height, float posX, float posY, float rotation) {
           tx = new Texture(Gdx.files.internal(filesPath));
           txRegion = new TextureRegion(tx);
           txRegionDrawable = new TextureRegionDrawable(txRegion);

           button = new ImageButton(txRegionDrawable);
           button.setTransform(true);
           button.setPosition(posX, posY);
           button.setRotation(rotation);
           button.setWidth(wight);
           button.setHeight(height);
       }

        public ImageButton getButton() {
            return button;
        }
    }


    public ControllerMenu (Player player) {
        this.player = player;

        stage = new Stage(new ScreenViewport());
        button_left = new ButtonController("arrow.png", 250, 250, 250,250, 180);

        button_left.button.addListener(new InputListener() {
            public boolean touchDown (InputEvent event, float x, float y, int pointer, int button) {
                System.out.println("down");

                player.setMove_left(true);

                return true;
            }

            public void touchUp (InputEvent event, float x, float y, int pointer, int button) {
                System.out.println("up");
                player.setMove_left(false);

            }
        });


        button_right = new ButtonController("arrow.png", 250, 250, Gdx.graphics.getWidth()-250,0, 0);

        button_right.button.addListener(new InputListener() {
            public boolean touchDown (InputEvent event, float x, float y, int pointer, int button) {
                player.setMove_right(true);

                return true;
            }

            public void touchUp (InputEvent event, float x, float y, int pointer, int button) {
                player.setMove_right(false);

            }
        });


        stage.addActor(button_right.getButton());
        stage.addActor(button_left.getButton());
        stage.addActor(player.getImage());

        Gdx.input.setInputProcessor(stage);
    }


    public void render() {
        stage.act(Gdx.graphics.getDeltaTime());
		stage.draw();
    }

    public void update() {

    }

}
