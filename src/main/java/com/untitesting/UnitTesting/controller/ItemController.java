package com.untitesting.UnitTesting.controller;

import com.untitesting.UnitTesting.model.Item;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {

    @GetMapping("/dummy-item")
    public Item dummyItem(){
        return new Item(1,"pen",10,100);
    }
}
