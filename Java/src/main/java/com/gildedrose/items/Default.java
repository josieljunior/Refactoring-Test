package com.gildedrose.items;

import com.gildedrose.Item;
import com.gildedrose.ItemType;
import com.gildedrose.ItemUtils;

public class Default implements ItemType {

    @Override
    public void updateQuality(Item item) {
        ItemUtils.reduceSellIn(item);

        if (item.sellIn < 0) {
            ItemUtils.subtractQuality(item, 2);
        } else {
            ItemUtils.reduceQuality(item);
        }
    }
}
