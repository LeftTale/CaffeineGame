package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.math.Rectangle;

public class Item extends Rectangle
{
    Texture texture;
    float rotation;
    boolean activeMove = false;

    Item(float posX, float posY, float width, float height, Texture texture, float rotation)
    {
        super(posX, posY, width, height);
        this.texture = texture;
        this.rotation = rotation;
    }

    //Finds center of item
    float GetCenterX(){return width/2;}
    float GetCenterY(){return height/2;}

    void DrawItem(Batch batch)
    {
        batch.draw(texture,
                x,
                y,
                GetCenterX(),
                GetCenterY(),
                width,
                height,
                1f,
                1f,
                rotation,
                0,
                0,
                64,
                64,
                false,
                false);
    }
}
