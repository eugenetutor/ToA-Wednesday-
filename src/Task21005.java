public class Task21005 {
    public static void main(String[] args) {
        Product[] products = {
                new Product("Product A", 12.99f, 5),
                new Product("Product B", 9.99f, 10),
                new Product("Product C", 12.99f, 8),
                new Product("Product D", 7.99f, 15)
        };

        Product[] sortedProducts = countingSort(products);

        for (int i = 0; i < sortedProducts.length; i++) {
            Product p = sortedProducts[i];
            if(p != null){
                System.out.println(p.name + " "+ p.price + " " + p.quantity);
            }
        }
    }

    private static Product[] countingSort(Product[] products) {
        float maxPrice  = 0.0f;
        for (Product product : products){
            if(product.getPrice() > maxPrice){
                maxPrice = product.getPrice();
            }
        }

        int[] priceCounts = new int[(int)maxPrice + 1];
        for(Product product : products){
            int priceIndex = (int)product.getPrice();
            if(priceIndex>=0){
                priceCounts[priceIndex]++;
            }
        }

        for (int i = 1; i < priceCounts.length; i++) {
            priceCounts[i] += priceCounts[i-1];
        }

        Product[] sortedProducts = new Product[products.length];

        for (int i = products.length-1; i >=0 ; i--) {
            Product product = products[i];
            int priceIndex = (int)product.getPrice();
            if(priceIndex >= 0) {
                int lesserQuantityCount = 0;
                for (int j = 0; j < i; j++) {
                    Product otherProduct = products[j];
                    if (otherProduct.getPrice() == product.getPrice() && otherProduct.getQuantyty() < product.getQuantyty()) {
                        lesserQuantityCount++;
                    }
                }
                int sortedIndex = priceCounts[priceIndex - 1] + lesserQuantityCount;
                sortedProducts[sortedIndex] = product;

                priceCounts[priceIndex]--;
            }
        }
        return sortedProducts;

    }
}


class Product{
    public String name;
    public float price;
    public  int quantity;

    public Product(String name, float price, int quantyty) {
        this.name = name;
        this.price = price;
        this.quantity = quantyty;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public int getQuantyty() {
        return quantity;
    }
}
