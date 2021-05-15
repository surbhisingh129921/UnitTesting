package com.untitesting.UnitTesting;

import com.untitesting.UnitTesting.business.Add;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;


public class AddTest {

    @Test
    public void test(){
        Add a = new Add();
        int e= a.addNo(2,3);
        int acR=5;
        assertEquals(acR,e);

    }


}
