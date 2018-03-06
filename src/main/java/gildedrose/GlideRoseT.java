package gildedrose;


class GildedRoseT {
    Item[] items;

    public GildedRoseT(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
        	if (items[i].name.equals("Aged Brie")){
        		items[i].sellIn = items[i].sellIn - 1;
        		if (items[i].quality < 50) {
        			items[i].quality = items[i].quality + 1;
        		}
        	}
        	
        	if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")){
        		items[i].sellIn = items[i].sellIn - 1;
        		if (items[i].quality < 50 && !(items[i].sellIn<0) ) {
        			items[i].quality = items[i].quality + 1;
        		}

                if (items[i].sellIn < 11 && !(items[i].sellIn<0) && items[i].quality < 50) {
	               items[i].quality = items[i].quality + 1;
	                
                }

                if (items[i].sellIn < 6 && !(items[i].sellIn<0) && items[i].quality < 50) {
	               items[i].quality = items[i].quality + 1;
	               
                }
                
                if(items[i].sellIn<0){
                	items[i].quality = 0;
                }

        		
        	}
        	
        	if (items[i].name.equals("Sulfuras, Hand of Ragnaros")){
        		
        	}
        	
        	if (!items[i].name.equals("Aged Brie")
             && !items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")
             && !items[i].name.equals("Sulfuras, Hand of Ragnaros")){
        		items[i].sellIn = items[i].sellIn - 1;
        		if (items[i].sellIn < 0 && items[i].quality>0 ) {
        			if(items[i].quality>=2){
        				items[i].quality = items[i].quality - 2;
        			}
        			else{
        				items[i].quality = items[i].quality - 1;
        			}
        		}
        	}
        	
        	
        }
    }
}