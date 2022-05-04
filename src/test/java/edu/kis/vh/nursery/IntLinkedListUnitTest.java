package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;
import org.junit.Assert;
import org.junit.Test;

public class IntLinkedListUnitTest {
    @Test
    public void testIsEmpty(){
        IntLinkedList inl = new IntLinkedList();
        boolean isEmpty = inl.isEmpty();
        Assert.assertEquals(true, isEmpty);

        inl.push(1);
        isEmpty = inl.isEmpty();
        Assert.assertEquals(false, isEmpty);
        inl.pop();
        isEmpty = inl.isEmpty();
        Assert.assertEquals(true, isEmpty);
    }

    @Test
    public void testPush(){
        IntLinkedList inl = new IntLinkedList();

        int value = 1;
        inl.push(value);
        Assert.assertEquals(inl.top(), value);
    }

    @Test
    public void testPop(){
        IntLinkedList inl = new IntLinkedList();
        int value = 1;
        inl.push(value);
        int last = inl.pop();
        Assert.assertEquals(last, value);
    }
}