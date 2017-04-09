package queue;

public class MyQueue {
	private int m_iQLength;
	private int m_iQCapacity;
	private int m_iQHead;
	private int m_iQTail;
	private int[] m_iQueue;

	MyQueue(int m_iQCapacity) {
		this.m_iQCapacity = m_iQCapacity;
		m_iQueue = new int[m_iQCapacity];
		clearQ();
	}

	private void clearQ() {
		m_iQHead = 0;
		m_iQTail = 0;
		m_iQLength = 0;
	}

	private boolean isQEmpty() {
		return this.m_iQLength == 0 ? true : false;
	}

	private boolean isQFull() {
		return this.m_iQCapacity == m_iQLength ? true : false;
	}

	private boolean enQueue(int element) {
		if (isQFull())
			return false;
		else {
			this.m_iQueue[m_iQTail] = element;
			this.m_iQTail++;
			this.m_iQLength++;
			this.m_iQTail = m_iQTail % m_iQCapacity;
			return true;
		}
	}

	@SuppressWarnings("null")
	private int deQueue() {
		if (isQEmpty())
			return (Integer) null;
		else {
			int element = m_iQueue[m_iQHead];
			this.m_iQHead++;
			this.m_iQLength--;
			this.m_iQHead = m_iQHead % m_iQCapacity;
			return element;
		}
	}

	private void qTraverse() {
		if (isQEmpty()){
			System.out.println((Integer) null);
		}
		else {
			System.out.print("Q: ");
			for (int i = m_iQHead; i < m_iQLength + m_iQHead; i++) {
				System.out.print(this.m_iQueue[i % m_iQCapacity] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		MyQueue myQ = new MyQueue(4);
		myQ.enQueue(1);
		myQ.enQueue(2);
		myQ.enQueue(3);
		myQ.enQueue(4);
		myQ.qTraverse();
		System.out.println("first element: "+ myQ.deQueue());
		System.out.println("first element: "+ myQ.deQueue());
		System.out.println("first element: "+ myQ.deQueue());
		System.out.println("first element: "+ myQ.deQueue());
		myQ.qTraverse();
		myQ.clearQ();
		myQ.enQueue(5);
		myQ.enQueue(6);
		myQ.qTraverse();
	}

}
