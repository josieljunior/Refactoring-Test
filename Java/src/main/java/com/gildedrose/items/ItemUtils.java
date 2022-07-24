package com.gildedrose.items;

import com.gildedrose.Item;

public class ItemUtils {

    public static void reduceQuality(Item item){
        if (item.quality > 0){
            item.quality -= 1;
        }
    }

    public static void increaseQuality(Item item){
        item.quality += 1;
    }

    public static void sumQuality(Item item, int value){
        item.quality += value;
    }

    public static void subtractQuality(Item item, int value){
        if (item.quality > 0){
            item.quality -= value;
        }
    }

    public static void reduceSellIn(Item item){
        item.sellIn -= 1;
    }

    public static boolean qualityIsValid(Item item){
        if (item.quality < 50){
            return true;
        }
        return false;
    }
}
