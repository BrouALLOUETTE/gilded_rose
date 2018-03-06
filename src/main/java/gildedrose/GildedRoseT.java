package gildedrose;


class GildedRoseT {
    Item[] items;

    public GildedRoseT(Item[] items) {
        this.items = items;
    }
        
    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {       	
        	if (items[i].name.equals("Aged Brie")){        		
        		items[i].sellIn = sellInUpdate(items[i].sellIn);
        		items[i].quality = qualityUpdateAgedBrie(items[i].quality);
        	}        	
        	if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")){
        		items[i].sellIn = sellInUpdate(items[i].sellIn);
        		items[i].quality= qualityUpdateConcert(items[i].quality, items[i].sellIn);        	      		
        	}        	
        	/*if (items[i].name.equals("Sulfuras, Hand of Ragnaros")){
        		
        	}*/         	
        	if (!items[i].name.equals("Aged Brie") && !items[i].name.equals("Backstage passes to a TAFKAL80ETC concert") && !items[i].name.equals("Sulfuras, Hand of Ragnaros")){
        		items[i].sellIn = sellInUpdate(items[i].sellIn);
        		items[i].quality= qualityUpdateElse(items[i].quality, items[i].sellIn);
        	}       	
        }
    }
    
    public static int sellInUpdate(int a) {
        a = a-1;
        return a;
    }

    public static int qualityUpdateAgedBrie(int b) {
    	if (b < 50) {
			b = b + 1;
		}
    	return b;
    }
    
    public static int qualityUpdateConcert(int c, int d) {
    	if (c < 50 && !(d<0) ) {
			c = c + 1;
		}
        if (d < 11 && !(d<0) && c < 50) {
           c = c + 1;            
        }
        if (d < 6 && !(d<0) && c < 50) {
           c = c + 1;         
        }       
        if(d<0){
        	c = 0;
        }        
        return c;
    }
    
    public static int qualityUpdateElse(int e, int f) {
    	if (f < 0 && e>0 ) {
			if(e>=2){
				e = e - 2;
			}
			else{
				e = e - 1;
			}
		}else{
			e = e - 1;
		}    	
    	return e;
    }
}
