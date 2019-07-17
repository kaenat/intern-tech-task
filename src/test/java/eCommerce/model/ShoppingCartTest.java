package eCommerce.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {
    User user;

    Product product;
    List<Product> products;
    ShoppingCart shoppingCart;

    @BeforeEach
    void init() {
        user = new User("Kaenat", "Asif");
        shoppingCart = new ShoppingCart(user);
        products = new ArrayList<Product>();

        product = new Product("Apple iPhone XS", "The Greatest iPhone ever",
                "", new BigDecimal(1300));
        products.add(product);

        product = new Product("Google Pixel 3XL", "Make every day more extraordinary",
                "", new BigDecimal(1100));
        products.add(product);

        product = new Product("Galaxy S10", "The Right Galaxy for You",
                "", new BigDecimal(1000));
        products.add(product);

        product = new Product("LG G7", "think LG",
                "", new BigDecimal(950));
        products.add(product);

        product = new Product("Xiaomi Mi 9", "Details matter",
                "", new BigDecimal(800));
        products.add(product);
    }

    @DisplayName("should add multiple products successfully")
    @Test
    public void shouldAddMultipleProductSuccessfully() {
        shoppingCart.setProductList(products);
        assertEquals(products, shoppingCart.getProductList());
    }

    @DisplayName("should add product successfully")
    @Test
    public void shouldAddProductSuccessfully() {
        List<Product> subList = products.subList(0, 3);
        for (Product p : subList) {
            shoppingCart.addProduct(p);
        }

        List<Product> pList = shoppingCart.getProductList();

        assertEquals(subList.size(), pList.size());
        assertEquals(products.get(2), pList.get(2));
    }

    @DisplayName("should not add an already existing product")
    @Test
    public void shouldNotAddAnAlreadyExistingProduct() {
        shoppingCart.addProduct(products.get(0));

        assertEquals(1, shoppingCart.getProductList().size());
        assertEquals(products.get(0), shoppingCart.getProductList().get(0));

        assertFalse(shoppingCart.addProduct(products.get(0)));
    }

    @DisplayName("should remove product successfully")
    @Test
    public void shouldRemoveProductSuccessfully() {
        List<Product> subList = products.subList(0, 2);
        for (Product p : subList) {
            shoppingCart.addProduct(p);
        }

        List<Product> pList = shoppingCart.getProductList();

        assertEquals(subList.size(), pList.size());

        shoppingCart.removeProduct(products.get(1));

        pList = shoppingCart.getProductList();

        assertNotEquals(subList.size(), pList.size());
        assertFalse(pList.contains(products.get(1)));
    }

    @DisplayName("should not remove a non existing product")
    @Test
    public void shouldNotRemoveANonExistingProduct() {
        List<Product> subList = products.subList(0, 2);
        for (Product p : subList) {
            shoppingCart.addProduct(p);
        }

        List<Product> pList = shoppingCart.getProductList();

        assertEquals(subList.size(), pList.size());

        shoppingCart.removeProduct(products.get(1));
        assertFalse(shoppingCart.removeProduct(products.get(1)));
    }
}