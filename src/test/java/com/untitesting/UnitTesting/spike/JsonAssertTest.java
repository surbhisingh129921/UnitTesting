package com.untitesting.UnitTesting.spike;

import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;

public class JsonAssertTest {

    String actualResponse = "{\"quantity\":100,\"name\":\"pen\",\"price\":10,\"id\":1}";

    @Test
    public void jsonAssertStrict() throws Exception{
        String expectedResponse = "{\"quantity\":100,\"name\":\"pen\",\"price\":10,\"id\":1}";
        JSONAssert.assertEquals(actualResponse,expectedResponse,true);
    }

    @Test
    public void jsonAssertFalse() throws Exception{
        String expectedResponse = "{\"quantity\":100,\"name\":\"pen\",\"price\":10,\"id\":1}";
        JSONAssert.assertEquals(actualResponse,expectedResponse,false);
    }

    @Test
    public void jsonAssertSpecialCharacter() throws Exception{
        String expectedResponse = "{\"quantity\":100,\"name\":\"pen\",\"price\":10,\"id\":1}";
        JSONAssert.assertEquals(actualResponse,expectedResponse,false);
    }
}
