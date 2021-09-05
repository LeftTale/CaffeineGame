package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.math.Rectangle;

public class MilkJug extends Item
{

    MilkJug(Texture jugImg,float posX, float posY, float width, float height, float rotation)
    {
        super(posX,posY,width,height,jugImg,rotation);
    }


}
