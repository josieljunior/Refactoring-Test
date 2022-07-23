package com.gildedrose.items;

import com.gildedrose.Item;

public class ItemUtils {

    public void decreaseQuality(Item item){
        item.quality -= 1;
    }

    public void increaseQuality(Item item){
        item.quality += 1;
    }

    public void decreaseSellIn(Item item){
        item.sellIn -= 1;
    }

    public boolean qualityIsValid(Item item){
        if (item.quality < 50){
            return true;
        }
        return false;
    }
}
