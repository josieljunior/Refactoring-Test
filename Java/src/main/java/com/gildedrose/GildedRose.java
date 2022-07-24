package com.gildedrose;

import com.gildedrose.items.AgedBrie;
import com.gildedrose.items.BackstagePasses;
import com.gildedrose.items.Conjured;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            switch (items[i].name){
                case "Aged Brie":
                    AgedBrie.updateQuality(items[i]);
                    break;

                case "Backstage passes to a TAFKAL80ETC concert":
                    BackstagePasses.updateQuality(items[i]);
                    break;

                case "Sulfuras, Hand of Ragnaros":
                    break;

                case "Conjured Mana Cake":
                    Conjured.updateQuality(items[i]);
                    break;

                default:
                    ItemUtils.reduceSellIn(items[i]);

                    if(items[i].sellIn < 0){
                        ItemUtils.subtractQuality(items[i], 2);
                    } else {
                        ItemUtils.reduceQuality(items[i]);

                    }
            }
        }
    }


}
