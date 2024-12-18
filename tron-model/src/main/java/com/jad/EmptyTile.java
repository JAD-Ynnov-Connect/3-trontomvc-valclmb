package com.jad;

import lombok.Getter;

class EmptyTile extends AbstractTile {
    @Getter
    private static final EmptyTile INSTANCE = new EmptyTile();

    private EmptyTile() {
        super(' ', true);
    }

}
