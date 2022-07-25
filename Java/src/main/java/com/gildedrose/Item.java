package com.gildedrose;

import com.gildedrose.items.*;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public ItemType type;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
        setType();
    }

    private void setType(){
        if (this.name.contains("Aged Brie")){
            this.type = new AgedBrie();

        } else if (this.name.contains("Backstage passes")){
            this.type = new BackstagePasses();

        } else if (this.name.contains("Conjured")) {
            this.type = new Conjured();

        } else if (this.name.contains("Sulfuras")) {
            this.type = new Legendary();

        } else {
            this.type = new Default();
        }
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

}
