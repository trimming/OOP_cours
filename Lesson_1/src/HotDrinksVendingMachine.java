public class HotDrinksVendingMachine implements VendingMachine{
    
    List<HotDrink> drinksList;
    
    public List<HotDrink> getDrinksList() {
        return drinksList;
    }

    public void setDrinksList(List<HotDrink> drinksList) {
        this.drinksList = new ArrayList<>(drinksList);
    }

    public HotDrinksVendingMachine(List<HotDrink> drinksList){
        this.drinksList = drinksList;
    }

    public HotDrink getProduct(String name, int volume, int temperature){
        for(HotDrink hotDrink: drinksList){
            if(hotDrink.getName().equals(name) && hotDrink.getVolume() == volume && hotDrink.getTemperature() == temperature){
                return hotDrink;
            }
        }
        return null;
    }

    @Override
    public String toString(){
        return "HotDrinksVendingMachine{" +
                "drinksList=" + drinksList +
                '}';
    }

    @Override
    public Product getProduct(String name) throws IllegalStateException {
        for(Product drink: drinksList){
            if(drink.getName().equals(name)){
                return drink;
            }
        }
        return null;
    }
}
