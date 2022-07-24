package com.gildedrose.items;

import com.gildedrose.Item;

public class AgedBrie implements ItemType{

    public static void updateQuality(Item item) {
        if (ItemUtils.qualityIsValid(item)){
            ItemUtils.increaseQuality(item);
        }
        ItemUtils.reduceSellIn(item);
    }
}
