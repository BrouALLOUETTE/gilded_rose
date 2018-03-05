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
    assertEquals("Aged Brie", test.items[0].name);
  }

  @Test
  public void Updatest(){
    Item[] cocoitems= new Item[] { new Item("coco", -1, 10) };
    GildedRose testcoco = new GildedRose(cocoitems);
    testcoco.updateQuality();
    testcoco.toString();
  }
}
