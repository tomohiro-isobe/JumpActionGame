package jp.techacademy.tomohiro.isobe.jumpactiongame;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class Enemy extends Sprite {

    // 横幅、高さ
    public static final float ENEMY_WIDTH = 1.5f;
    public static final float ENEMY_HEIGHT = 1.5f;

    // 状態
    public static final int ENEMY_EXIST = 0;

    int mState;

    public Enemy(Texture texture, int srcX, int srcY, int srcWidht, int srcHeight) {
        super(texture, srcX, srcY, srcWidht, srcHeight);
        setSize(ENEMY_WIDTH, ENEMY_HEIGHT);
        mState = ENEMY_EXIST;
    }



}
