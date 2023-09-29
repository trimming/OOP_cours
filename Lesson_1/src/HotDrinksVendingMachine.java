public class HotDrinksVendingMachine implements VendingMachine{


    @Override
    public Product getProduct(String name) throws IllegalStateException {
        for(Product product: productList){
            if(product.getName().equals(name)){
                return product;
            }
        }
        return null;
    }
}
