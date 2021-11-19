
/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author David J. Barnes and Michael Kölling.
 * modified by Jyoti
 * @version 2021.11.18
 */
public class StockDemo
{
    // The stock manager.
    private StockList stock;

    /**
     * Create a StockManager and populate it with at least
     * 10 sample products.
     */
    public StockDemo()
    {
        this.stock = new StockList();
        
        // Add at least 10 products, they must be unique to you
        // Make sure the ids are sequential numbers
        
        stock.add(new Product(101, "Samsung Galaxy S20"));
        stock.add(new Product(102, "Samsung Galaxy A12"));
        stock.add(new Product(103, "Samsung Galaxy A03s"));
        stock.add(new Product(104, "Samsung Galaxy A52s"));
        stock.add(new Product(105, "Samsung Galaxy M32"));
        stock.add(new Product(106, "Samsung Galaxy A22"));
        stock.add(new Product(107, "Samsung Galaxy A72"));
        stock.add(new Product(108, "Samsung Galaxy M12"));
        stock.add(new Product(109, "Samsung Galaxy S21 Ultra"));
        stock.add(new Product(110, "Samsung Galaxy F41"));
        runDemo();
    }
    
    /**
     * Provide a demonstration of how the ProductList meets all
     * the user requirements by making a delivery of each product 
     * buying it in various amounts and then selling each
     * product by various amounts. Make sure all the requirements
     * have been demonstrated.
     */
    public void runDemo()
    {
        // Show details of all of the products before delivery.
        
        stock.print();

        buyProducts();
        stock.print();        

        sellProducts();
        stock.print();        
    }
    
    private void buyProducts()
    {
        stock.buyProduct(101,10);
        stock.buyProduct(102,15);
        stock.buyProduct(103,25);
        stock.buyProduct(104,50);
        stock.buyProduct(105,12);
        stock.buyProduct(106,38);
        stock.buyProduct(107,55);
        stock.buyProduct(108,86);
        stock.buyProduct(109,97);
        stock.buyProduct(110,9);
    }

    private void sellProducts()
    {
        stock.sellProduct(101,8);
        stock.sellProduct(102,10);
        stock.sellProduct(103,22);
        stock.sellProduct(104,30);
        stock.sellProduct(105,12);
        stock.sellProduct(106,35);
        stock.sellProduct(107,40);
        stock.sellProduct(108,80);
        stock.sellProduct(109,90);
        stock.sellProduct(110,16);
        stock.sellProduct(111,10);
        
    }    
}