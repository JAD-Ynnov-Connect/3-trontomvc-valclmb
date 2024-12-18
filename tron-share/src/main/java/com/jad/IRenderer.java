package com.jad;

public interface IRenderer {
    void setMatrix(ICharMatrix matrix);

    void render();

    void close();

    void showInfo(String info);
}
