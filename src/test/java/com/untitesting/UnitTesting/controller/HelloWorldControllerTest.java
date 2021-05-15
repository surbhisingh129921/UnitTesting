package com.untitesting.UnitTesting.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.junit.jupiter.api.Assertions.assertEquals;

@WebMvcTest(HelloWorldController.class)
public class HelloWorldControllerTest {

    @Autowired
    private MockMvc mockMVC;

    @Test
    public void hello_worldBasic() throws Exception{
        RequestBuilder request = MockMvcRequestBuilders.get("/hello-world")
                .accept(MediaType.APPLICATION_JSON);

        MvcResult result = mockMVC.perform(request).andReturn();

        assertEquals("Hello World",result.getResponse().getContentAsString());
    }
}
