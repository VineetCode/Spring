package com.rollingstone.spring.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rollingstone.spring.model.Product;
import com.rollingstone.spring.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productService;

	@PostMapping("/create")
	public ResponseEntity<?> createProduct(@RequestBody Product product) {
		Product savedProduct = productService.save(product);
		return ResponseEntity.ok("New Product has been saved with ID:" + savedProduct.getId());
	}

	@GetMapping("/get/{id}")
	public ResponseEntity<Product> get(@PathVariable("id") Long id) {
		Optional<Product> productRetreived = productService.get(id);
		Product product = productRetreived.get();
		return ResponseEntity.ok().body(product);
	}

	@GetMapping("/get/bypage")
	public @ResponseBody Page<Product> getProductsByPage(
			@RequestParam(value = "pagenumber", required = true, defaultValue = "0") Integer pageNumber,
			@RequestParam(value = "pagesize", required = true, defaultValue = "20") Integer pageSize) {
		return productService.getProductsByPage(pageNumber, pageSize);
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<?> updateProduct(@RequestBody Product product) {
		productService.save(product);
		return ResponseEntity.ok().body("Product has been Updated successfully.");
	}

	/*---Delete a Product by id---*/
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> delete(@PathVariable("id") long id) {
		productService.delete(id);
		return ResponseEntity.ok().body("Product has been deleted successfully.");
	}
}
