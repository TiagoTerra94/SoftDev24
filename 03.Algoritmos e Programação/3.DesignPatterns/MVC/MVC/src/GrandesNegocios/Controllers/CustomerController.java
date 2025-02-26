package GrandesNegocios.Controllers;

import GrandesNegocios.Domain.Sale;
import GrandesNegocios.Model.SalesRepository;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class CustomerController {

    private SalesRepository productAvailable;

    public CustomerController() throws FileNotFoundException {
        this.productAvailable = new SalesRepository();
    }

    public ArrayList<String> getProducts(){
        ArrayList<String> listProducts = new ArrayList<>();

        for(Sale currentProduct: this.productAvailable.getSalesList()){
            if(!listProducts.contains(currentProduct.getProduct())) {
                listProducts.add(currentProduct.getProduct());
            }
        }

        return listProducts;
    }

    public ArrayList<String> getCategory(String category){
        ArrayList<String> listProductsCategory = new ArrayList<>();

        for(Sale currentProduct: this.productAvailable.getSalesList()){
            if(currentProduct.getCategory().equals(category)) {
                listProductsCategory.add(currentProduct.getProduct());
            }
        }

        return listProductsCategory;
    }

    public Sale mostExpensiveProduct(){
        Sale mostExpensive = new Sale("","",0,0);


        for(Sale currentSale: this.productAvailable.getSalesList()){
            if(currentSale.getUnitPrice() > mostExpensive.getUnitPrice()){
                mostExpensive = currentSale;
            }
        }

        return mostExpensive;
    }

    public Sale mostCheapestProduct(){
        Sale mostCheap = this.productAvailable.getSalesList().get(0);


        for(Sale currentSale: this.productAvailable.getSalesList()){
            if(currentSale.getUnitPrice() < mostCheap.getUnitPrice()){
                mostCheap = currentSale;
            }
        }

        return mostCheap;
    }



}
