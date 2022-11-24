package com.kataAngular.api;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import com.kataAngular.api.model.Product;
import com.kataAngular.api.repository.ProductRepository;


import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.util.Arrays;
import org.hamcrest.Matchers;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;


@SpringBootTest
@AutoConfigureMockMvc
public class ProductControllerTest {
	
	@Autowired
	public MockMvc mockMvc;
		
	@Test
	public void testGetProducts() throws Exception {
		
		mockMvc.perform(get("/products")).andExpect(status().isOk()).andExpect(jsonPath("$[0].name", is("product1")));
	}
	
	@Test
	public void testGetAllProducts() throws Exception {
		mockMvc.perform(get("/products")).andExpect(status().isOk());
	}
}
