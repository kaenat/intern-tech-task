package eCommerce.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class ShoppingCart {
    private String cartId;
    private String userId;
    private List<Product> productList;

    public ShoppingCart(String cartId, String userId) {
        this.cartId = cartId;
        this.userId = userId;
        productList = new ArrayList<Product>();
    }

    public String getCartId() {
        return cartId;
    }

    public void setCartId(String cartId) {
        this.cartId = cartId;
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
}