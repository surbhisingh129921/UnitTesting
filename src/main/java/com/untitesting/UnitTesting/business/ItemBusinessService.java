package com.untitesting.UnitTesting.business;

import com.untitesting.UnitTesting.model.Item;
import org.springframework.stereotype.Component;

@Component
public class ItemBusinessService {

    public Item retrieveItem() {
        return new Item(1,"books",10,100);
    }
}
