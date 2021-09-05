package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;

public class Item extends Object
{
    boolean activeMove = false;

    Item(float posX, float posY, float width, float height, Texture texture, float rotation)
    {
        super(posX, posY, width, height,rotation,texture);

    }
}
