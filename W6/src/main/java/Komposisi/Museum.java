package Komposisi;

import java.util.*;

class Museum{
    private final List<tank> tanks;
    Museum (List<tank> tanks){
        this.tanks = tanks;
    }
    public List<tank> getTankInMuseum(){
        return tanks;
    }
}