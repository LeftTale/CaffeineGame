package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;

public class MilkJug
{
    Texture jugImg;
    float posX;
    float posY;
    float width;
    float height;
    float rotation;

    MilkJug(Texture jugImg,float posX, float posY, float width, float height)
    {
        this.jugImg = jugImg;
        this.posX = posX;
        this.posY = posY;
        this.width = width;
        this.height = height;
    }
}
