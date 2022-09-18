package question1;

import java.util.Comparator;

public class ProductSortByName implements Comparator<Product>{

	 @Override
	    public int compare(Product o1, Product o2) {

	        return o1.getProductName().compareTo(o2.getProductName());
	    }

}
