package com.maicol.productrest.Controller;

import com.maicol.productrest.Entity.Product;
import com.maicol.productrest.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/findAll")
    public List<Product> findAll(){
        return productRepository.findAll();
    }


    @GetMapping("/findOne/{id}")
    public Optional<Product>findOne(@PathVariable("id") Long id){
        return productRepository.findById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Product product){
        productRepository.save(product);
    }


}
