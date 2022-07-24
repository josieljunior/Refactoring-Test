package com.gildedrose.items;

import com.gildedrose.Item;
import com.gildedrose.ItemType;
import com.gildedrose.ItemUtils;

public class BackstagePasses implements ItemType {

    public static void updateQuality(Item item) {
        if (ItemUtils.qualityIsValid(item)){
            if (item.sellIn <= 5){
                ItemUtils.sumQuality(item, 3);

            } else if (item.sellIn <= 10) {
                ItemUtils.sumQuality(item, 2);

            } else {
                ItemUtils.increaseQuality(item);
            }
        }

        if (item.sellIn < 0){
            item.quality = 0;
        }
        ItemUtils.reduceSellIn(item);
    }

}
