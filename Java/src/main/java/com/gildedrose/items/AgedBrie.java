package com.gildedrose.items;

import com.gildedrose.Item;
import com.gildedrose.ItemType;
import com.gildedrose.ItemUtils;

public class AgedBrie implements ItemType {

    public static void updateQuality(Item item) {
        if (ItemUtils.qualityIsValid(item)){
            ItemUtils.increaseQuality(item);
        }
        ItemUtils.reduceSellIn(item);
    }
}
