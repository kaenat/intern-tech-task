package eCommerce.model;

import javax.management.InstanceAlreadyExistsException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

class ShoppingCart {
    private String cartId;
    private String userId;
    private List<Product> productList;

    public ShoppingCart(String userId) {
        this.cartId = UUID.randomUUID().toString();

        this.userId = userId;
        productList = new ArrayList<Product>();
    }

    public String getCartId() {
        return cartId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public boolean addProduct(Product p) {
        if (!productExists(p)) {
            return productList.add(p);
        } else
            return false;
    }

    public boolean removeProduct(Product p) {
        return productList.remove(p);
    }

    private boolean productExists(Product p) {
        return productList.contains(p);
    }
}