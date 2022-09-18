package question1;

import java.util.Comparator;

public class ProductSortByPrice implements Comparator<Product>{
	
	 @Override
	    public int compare(Product o1, Product o2) {
	        if(o1.getProductPrice()>o2.getProductPrice()) {
	            return 1;

	        }else 	if(o1.getProductPrice()<o2.getProductPrice()) {
	            return -1;

	        }else {
	            return 0;
	        }
	    }

}
