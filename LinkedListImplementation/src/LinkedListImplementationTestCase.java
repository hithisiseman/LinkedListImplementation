import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListImplementationTestCase {

	@Test
	public void testSize() {
		
		LinkedList list = new LinkedList();
		int s=list.size();
		assertEquals(s,list.numofElements);
		
	}
	
	@Test
	public void testAdd1()  {
		
		LinkedList list = new LinkedList();
		
		list.add(1);
		assertEquals(9,list.size());
		
		
	}
	
	@Test
	public void testAdd2()   {
		
		LinkedList list = new LinkedList();
		
		list.add(1);
		list.add(2);
		list.add(3);
		assertEquals(12,list.size());
		
		
		
		
	}
	
	@Test 
	public void testAdd3()  {
		
		LinkedList l = new LinkedList();
		
		for(int i=0;i<4;i++) {
			l.add(i);
		}
		
		assertEquals(16,l.size());

	}
	
	@Test 
	public void testAdd4()  {
		
		LinkedList l = new LinkedList();
		
		for(int i=0;i<40;i++) {
			l.add(i);
		}
		
		assertEquals(56,l.size());

	}
	
	
	@Test
	public void testpushFront1() {
		
		LinkedList list1 = new LinkedList();		
		assertEquals(1,list1.size());

	}
	
	@Test 
	public void testpushFront2() {
		
		LinkedList list = new LinkedList();
		
		
		list.pushFront(1);
		assertEquals(2,list.size());
		
		
	}
	
	@Test
	public void testpushFront3() {
		
		LinkedList list = new LinkedList();
		
		
		list.pushFront(2);
		list.pushFront(3);
	
		assertEquals(4,list.size());
		
	}
	
	@Test
	public void testpushFront4() {
		
		LinkedList list = new LinkedList();
		
		for(int i=0;i<4;i++) {
			list.pushFront(i);
		}
		
		assertEquals(8,list.size());
		
	}
	
	@Test
	public void testpushBack1() {
		
		LinkedList list = new LinkedList();
		assertEquals(0,list.size());
		
	}
	
	@Test
	public void testpushBack2() {
		
		LinkedList link = new LinkedList();
		link.pushBack(1);
		assertEquals(1,link.size());
	}
	
	
	@Test(expected = Exception.class)
	public void testpopfront1() throws Exception {
		
		LinkedList link = new LinkedList();
		link.popFront();
		assertEquals(55,link.size());
	}
	
	@Test(expected = Exception.class)
	public void testpopfront2() throws Exception {
		
		LinkedList link = new LinkedList();
		link.popFront();
		link.popFront();
		link.popFront();
		assertEquals(52,link.size());
	}
	
	@Test(expected = Exception.class)
	public void testpopfront3() throws Exception {
		
		LinkedList link = new LinkedList();
		for(int i=0;i<50;i++)
			link.popFront();
		
		assertEquals(2,link.size());
	}
	
	@Test(expected = Exception.class)
	public void testtopBack1() throws Exception {
		
		LinkedList link = new LinkedList();
		int d=link.topBack();
		assertEquals(d,LinkedList.tailPointer.data);
	}
	
	@Test(expected = Exception.class)
	public void testtopFront1() throws Exception {
		
		LinkedList link = new LinkedList();
		int d=link.topFront();
		assertEquals(d,LinkedList.tailPointer.data);
	}
	
}
