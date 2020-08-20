package com.lams1989.insertnodesorteddoublylinkedlist;

public class InsertNodeSortedDoublyLinkedList {

	static class DoublyLinkedListNode {
		public int data;
		public DoublyLinkedListNode next;
		public DoublyLinkedListNode prev;

		public DoublyLinkedListNode(int nodeData) {
			this.data = nodeData;
			this.next = null;
			this.prev = null;
		}
	}

	static class DoublyLinkedList {
		public DoublyLinkedListNode head;
		public DoublyLinkedListNode tail;

		public DoublyLinkedList() {
			this.head = null;
			this.tail = null;
		}

		public static void main(String args[]) {

			DoublyLinkedList llist = new DoublyLinkedList();
			int[] llistItem = { 141, 164, 302, 474, 530 };
			int data = 300;
			for (int i = 0; i < llistItem.length; i++) {
				DoublyLinkedListNode llist_head = insertNodeAtHead(llist.head, llistItem[i]);
				llist.head = llist_head;
			}

			printLinkedList(sortedInsert(llist.head, data));
		}

		static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {
			DoublyLinkedListNode n = new DoublyLinkedListNode(data);

			if (head == null) {
				return n;
				
			} else if (data >= head.data) {
				n.next = head;
				return n;
			} else {
				DoublyLinkedListNode aux = sortedInsert(head.next, data);
				head.next = aux;
				aux.prev = head;
				return head;
			}

		}

		static DoublyLinkedListNode insertNodeAtHead(DoublyLinkedListNode head, int data) {
			DoublyLinkedListNode nodeInsert = new DoublyLinkedListNode(data);
			if (head == null) {
				return nodeInsert;
			}
			nodeInsert.next = head;
			return nodeInsert;
		}

		static void printLinkedList(DoublyLinkedListNode head) {

			while (head != null) {
				System.out.println(head.data);
				head = head.next;
			}

		}
	}
}
