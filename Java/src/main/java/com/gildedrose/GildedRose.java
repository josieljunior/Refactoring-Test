package com.gildedrose;

import com.gildedrose.items.AgedBrie;
import com.gildedrose.items.BackstagePasses;
import com.gildedrose.items.ItemUtils;

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

                default:
                    ItemUtils.reduceSellIn(items[i]);
                    ItemUtils.reduceQuality(items[i]);
            }
//            if (!items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
//                if (items[i].quality > 0) {
//                    if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
//                        items[i].quality = items[i].quality - 1;
//                    }
//                }
//            } else {
//                if (ItemUtils.qualityIsValid(items[i])) {
//                    items[i].quality = items[i].quality + 1;
//
//                    if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
//                        if (items[i].sellIn < 11) {
//                            if (items[i].quality < 50) {
//                                items[i].quality = items[i].quality + 1;
//                            }
//                        }
//
//                        if (items[i].sellIn < 6) {
//                            if (items[i].quality < 50) {
//                                items[i].quality = items[i].quality + 1;
//                            }
//                        }
//                    }
//                }
//            }
//
//            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
//                items[i].sellIn = items[i].sellIn - 1;
//            }
//
//            if (items[i].sellIn < 0) {
//                if (!items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
//                    if (items[i].quality > 0) {
//                        if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
//                            items[i].quality = items[i].quality - 1;
//                        }
//                    }
//                } else {
//                    items[i].quality = items[i].quality - items[i].quality;
//                }
//            }
        }
    }


}
