package com.gildedrose;

import com.gildedrose.items.AgedBrie;
import com.gildedrose.items.BackstagePasses;
import com.gildedrose.items.Conjured;

class GildedRose {
    Item[] items;
    AgedBrie agedBrie = new AgedBrie();
    BackstagePasses backstagePasses = new BackstagePasses();
    Conjured conjured = new Conjured();

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            switch (item.name) {
                case "Aged Brie":
                    agedBrie.updateQuality(item);
                    break;

                case "Backstage passes to a TAFKAL80ETC concert":
                    backstagePasses.updateQuality(item);
                    break;

                case "Sulfuras, Hand of Ragnaros":
                    break;

                case "Conjured Mana Cake":
                    conjured.updateQuality(item);
                    break;

                default:
                    ItemUtils.reduceSellIn(item);

                    if (item.sellIn < 0) {
                        ItemUtils.subtractQuality(item, 2);
                    } else {
                        ItemUtils.reduceQuality(item);

                    }
            }
        }
    }

}
