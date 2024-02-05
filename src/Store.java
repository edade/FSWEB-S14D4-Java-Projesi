import com.workintech.Products.Bread;
import com.workintech.Products.Chocolate;
import com.workintech.Products.Coke;
import com.workintech.Products.ProductForSale;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] product = new ProductForSale[5];
        product[0] = new Chocolate("Chocolate", 23,"Milky Chocolate","ulker");
        product[1] = new Coke("Coke", 30,"fresh coke", true);
        product[2] = new Bread("Bread", 12,"white bread", "medium");
        product[3] = new Coke("Coke", 21,"fresh coke", false);
        product[4] = new Bread("Bread", 12,"dark bread", "medium");
    listProducts(product);
    }

    public static void listProducts(ProductForSale[] products) {
        for(ProductForSale product: products){
            if(product!=null){
                product.showDetails();
            }
        }
    }
}