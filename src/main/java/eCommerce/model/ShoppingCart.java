package eCommerce.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

class ShoppingCart {
    private String cartId;
    private User user;
    private List<Product> productList;

    public ShoppingCart(User user) {
        this.cartId = UUID.randomUUID().toString();

        this.user = user;
        productList = new ArrayList<Product>();
    }

    public String getCartId() {
        return cartId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
