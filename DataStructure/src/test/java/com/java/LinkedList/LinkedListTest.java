package com.java.LinkedList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LinkedListTest {
	
	private LinkedList linkedList;
	
	@Before
	public void setUp() throws Exception
	{
		linkedList = new LinkedList();
	}

	@Test
	public void AddFront()
	{
		linkedList.addFront(1);
		linkedList.addFront(2);
		linkedList.addFront(3);
		Assert.assertEquals(3,linkedList.getFirst());
	}
	
	@Test
	public void GetFirst()
	{
		linkedList.addFront(3);
		Assert.assertEquals(3,linkedList.getFirst());
	}
	
	@Test
	public void GetLast()
	{
		linkedList.addFront(1);
		linkedList.addFront(2);
		linkedList.addFront(3);
		Assert.assertEquals(1,linkedList.getLast());

	}
	
	@Test
	public void AddBack()
	{
		linkedList.addback(1);
		linkedList.addback(2);
		linkedList.addback(3);
		Assert.assertEquals(1,linkedList.getFirst());
		Assert.assertEquals(3,linkedList.getLast());
	}
	@Test
	public void Size() {
		Assert.assertEquals(0, linkedList.size());
		linkedList.addback(1);
		Assert.assertEquals(1, linkedList.size());
		linkedList.addback(2);
		Assert.assertEquals(2, linkedList.size());
	}
	@Test
	public void clear(){
		linkedList.addback(1);
		linkedList.addback(2);
		linkedList.addback(3);
		linkedList.clear();
		Assert.assertEquals(0,linkedList.size());
	}
	@Test
	public void DeleteValue(){
		linkedList.addback(1);
		linkedList.addback(2);
		linkedList.addback(3);
		linkedList.deletvalue(2);
		Assert.assertEquals(2,linkedList.size());
		Assert.assertEquals(1,linkedList.getFirst());
		Assert.assertEquals(3,linkedList.getLast());
	}
}
