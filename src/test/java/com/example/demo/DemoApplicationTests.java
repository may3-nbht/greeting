package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import com.example.greeting.DemoApplication;
import com.example.greeting.restservice.GreetingController;

@SpringBootTest
@AutoConfigureMockMvc
@ContextConfiguration(classes = DemoApplication.class)
class DemoApplicationTests {

	@Autowired
	private GreetingController controller;

	@Autowired
  	private MockMvc mockMvc;

	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}

	@Test
	void greetingTest() throws Exception {
		mockMvc.perform(get("/")).andExpect(status().isOk());
	}


}
