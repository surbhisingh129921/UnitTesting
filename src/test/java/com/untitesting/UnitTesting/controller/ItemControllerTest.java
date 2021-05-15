package com.untitesting.UnitTesting.controller;

import com.untitesting.UnitTesting.business.ItemBusinessService;
import com.untitesting.UnitTesting.model.Item;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ItemController.class)
public class ItemControllerTest {

    @Autowired
    private MockMvc mockMVC;

    @MockBean
    private ItemBusinessService service;

    @Test
    public void dummy_itemBasic() throws Exception{
        RequestBuilder request = MockMvcRequestBuilders.get("/dummy-item")
                .accept(MediaType.APPLICATION_JSON);

        MvcResult result = mockMVC.perform(request).andExpect(status().isOk())
                .andExpect(content()
                        .json("{\"quantity\":100,\"name\":\"pen\",\"price\":10,\"id\":1}"))
                .andReturn();

      //  assertEquals("Hello World",result.getResponse().getContentAsString());
    }

    @Test
    public void itemBusinessServiceTest() throws Exception{

        when(service.retrieveItem()).thenReturn(new Item(1,"books",10,100));
        RequestBuilder request = MockMvcRequestBuilders.get("/item-from-business-service")
                .accept(MediaType.APPLICATION_JSON);

        MvcResult result = mockMVC.perform(request).andExpect(status().isOk())
                .andExpect(content()
                        .json("{quantity:100,name:books,price:10,id:1}"))
                .andReturn();

        //  assertEquals("Hello World",result.getResponse().getContentAsString());
    }
}
