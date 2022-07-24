package com.gildedrose.items;

import com.gildedrose.Item;

public class Conjured implements ItemType{

    public static void updateQuality(Item item) {
        if (ItemUtils.qualityIsValid(item)){
            ItemUtils.subtractQuality(item, 2);
        }
        ItemUtils.reduceSellIn(item);
    }
}
