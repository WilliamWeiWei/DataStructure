package stack;

public class MyStack <T> {
	private int m_iTop;
	private int m_iBottom;
	private int m_iStackSize;
	private int m_iStackLen;
	private Object[] m_iStackO;
	public MyStack (int stackSize){
		this.m_iStackSize = stackSize;
		this.m_iStackO = new Object[m_iStackSize];
		m_iTop = 0;
		m_iBottom = 0;
		m_iStackLen = 0;
	}
	
	private boolean isStackFull(){
		return m_iStackLen == m_iStackSize;
	}
	private boolean isStackEmpty(){
		return m_iStackLen == 0;
	}
	private void stackClear(){
		
	}
	private void stackPush(){
		
	}
	private void stackPop(){
	}
}
