package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.math.Rectangle;



public class Object extends Rectangle
{

    float rotation;
    Texture texture;
    Object(float posX, float posY, float width, float height,float rotation, Texture texture)
    {
        super(posX,posY,width,height);
        this.rotation = rotation;
        this.texture = texture;

    }

    void DrawObject(Batch batch)
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

    //Finds center of item
    float GetCenterX(){return width/2;}
    float GetCenterY(){return height/2;}
}
