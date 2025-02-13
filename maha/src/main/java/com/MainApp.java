package com.ecommerce;

import com.ecommerce.dao.ProductDAO;
import com.ecommerce.entity.Product;

public class MainApp {
    public static void main(String[] args) {
        ProductDAO productDAO = new ProductDAO();

        // Add a Product
        Product product = new Product();
        product.setName("Laptop");
        product.setPrice(750.00);
        product.setDescription("Gaming Laptop");
        productDAO.addProduct(product);

        // Retrieve Product
        Product retrievedProduct = productDAO.getProduct(1);
        System.out.println("Product: " + retrievedProduct.getName());

        // Update Product
        retrievedProduct.setPrice(700.00);
        productDAO.updateProduct(retrievedProduct);
        System.out.println("Product updated!");

        // Delete Product
        productDAO.deleteProduct(1);
        System.out.println("Product deleted!");
    }
}
