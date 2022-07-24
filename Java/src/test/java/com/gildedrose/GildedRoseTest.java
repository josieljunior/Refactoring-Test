package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void reduceQualityAgedBrie() {
        Item[] items = new Item[] { new Item("Aged Brie", 10, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(1, app.items[0].quality);
        assertEquals(9, app.items[0].sellIn);
    }

    @Test
    void qualityAgedBrieAbove50() {
        Item[] items = new Item[] { new Item("Aged Brie", 10, 100) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(100, app.items[0].quality);
        assertEquals(9, app.items[0].sellIn);
    }


    @Test
    void backstagePassesWithSellInLessOrEqual10() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert",
            10, 10),
            new Item("Backstage passes to a TAFKAL80ETC concert",
                7, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(12, app.items[0].quality);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(12, app.items[1].quality);
        assertEquals(6, app.items[1].sellIn);
    }

    @Test
    void backstagePassesWithSellInLessOrEqual5() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert",
            5, 10),
            new Item("Backstage passes to a TAFKAL80ETC concert",
                4, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(13, app.items[0].quality);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(13, app.items[1].quality);
        assertEquals(3, app.items[1].sellIn);
    }

    @Test
    void backstagePassesWithSellInLessThan0() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert",
            -1, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(0, app.items[0].quality);
        assertEquals(-2, app.items[0].sellIn);
    }

    @Test
    void sulfuras() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros",
            0, 80) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(80, app.items[0].quality);
        assertEquals(0, app.items[0].sellIn);
    }
}
