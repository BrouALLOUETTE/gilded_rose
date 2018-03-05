package gildedrose;

import static org.junit.Assert.*;
import org.junit.Test;

public class GildedRoseTest{

  @Test
  public void TestName(){
    Item[] items= new Item[] { new Item("Aged Brie", 6, 10) };
    GildedRose test = new GildedRose(items);
    test.updateQuality();
    assertEquals("Aged Brie", test.items[0].name);
  }
}
