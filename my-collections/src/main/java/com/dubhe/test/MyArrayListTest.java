package com.dubhe.test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyArrayListTest {

    @Test
    public void test(){
        ArrayList<String> strings = new ArrayList<>();
        List<String> strings1 = Collections.synchronizedList(strings);

    }

    @Test
    public void test2(){

    }
}
