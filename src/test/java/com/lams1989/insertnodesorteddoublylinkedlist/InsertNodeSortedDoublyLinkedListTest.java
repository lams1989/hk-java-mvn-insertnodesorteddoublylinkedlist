package com.lams1989.insertnodesorteddoublylinkedlist;

import com.lams1989.insertnodesorteddoublylinkedlist.InsertNodeSortedDoublyLinkedList.DoublyLinkedList;
import com.lams1989.insertnodesorteddoublylinkedlist.InsertNodeSortedDoublyLinkedList.DoublyLinkedListNode;

import junit.framework.TestCase;

public class InsertNodeSortedDoublyLinkedListTest extends TestCase {

	public void test1() {
		DoublyLinkedList llist = new DoublyLinkedList();
		int[] llistItem = { 530, 474, 302, 164, 141 };
		int data = 300;
		for (int i = 0; i < llistItem.length; i++) {
			DoublyLinkedListNode llist_head = InsertNodeSortedDoublyLinkedList.insertNodeAtHead(llist.head,
					llistItem[i]);
			llist.head = llist_head;
		}

		InsertNodeSortedDoublyLinkedList.sortedInsert(llist.head, data);

		int[] llistexpected = { 141, 164, 300, 302, 474, 530 };
		int[] llistactual = new int[llistexpected.length];
		for (int i = 0; i < llistexpected.length; i++) {
			llistactual[i] = llist.head.data;
			llist.head = llist.head.next;
		}

		for (int i = 0; i < llistactual.length; i++) {
			assertEquals(llistexpected[i], llistactual[i]);
		}
	}

}
