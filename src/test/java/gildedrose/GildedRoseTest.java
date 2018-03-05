package gildedrose;

import static org.junit.Assert.*;
import org.junit.Test;
import org.assertj.core.api.Assertions;
public class GildedRoseTest{

  @Test
  public void TestName(){
    Item[] items= new Item[] { new Item("Aged Brie", 6, 10) };
    GildedRose test = new GildedRose(items);
    test.updateQuality();
    test.toString();
    assertEquals("Aged Brie", test.items[0].name);
  }

  @Test
  public void Updatest(){
    Item[] cocoitems= new Item[] { new Item("coco", 3, 10),
     new Item("Backstage passes to a TAFKAL80ETC concert",9,25),
     new Item("Backstage passes to a TAFKAL80ETC concert",4,25),
     new Item("Aged Brie",1,80),
     new Item("Sulfuras, Hand of Ragnaros",4,25),};
    GildedRose testcoco = new GildedRose(cocoitems);
    testcoco.updateQuality();
    assertEquals(9, testcoco.items[0].quality);
    assertEquals(27, testcoco.items[1].quality);
    assertEquals(28, testcoco.items[2].quality);
    assertEquals(0, testcoco.items[3].sellIn);
    assertEquals(25, testcoco.items[4].quality);

  }
}
