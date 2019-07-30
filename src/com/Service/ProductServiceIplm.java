package com.Service;

import com.Model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceIplm implements ProductService {
    private static Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "Iphone 4", 500, "dien thoai", "Apple inc"));
        products.put(2, new Product(2, "Samsung Galaxy S3", 200, "dien thoai", "SAMSUNG"));
        products.put(3, new Product(3, "Macbook Air", 2000, "Macbook", "Apple"));
        products.put(4, new Product(4, "Lamborghini Aventador", 999999, "Car", "Lamborghini"));

    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);

    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);

    }

    @Override
    public List<Product> findByName(String name) {
        List<Product> filterList = new ArrayList<>();
        if (name.trim().isEmpty()) {
            throw new RuntimeException("ko dc bo trong");
        }
        for (Product i : products.values()) {
            if(i.getName().toLowerCase().contains(name.trim().toLowerCase())){
                filterList.add(i);
            }
        }
        return filterList;
    }
}
