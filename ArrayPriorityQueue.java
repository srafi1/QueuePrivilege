//Team QueuePrivilege
//Shakil Rafi, Gian Tricarico, James Zhang
//APCS2 pd4
//HW32 - Getting past the velvet rope
//2017-04-19

public class ArrayPriorityQueue {

    private ArrayList _data;
    private int _size;

    public ArrayPriorityQueue() {
	_data = new ArrayList<String>();
	_size = 0;
    }

    public void add(String s) {
	
    }

    public boolean isEmpty(){
	return _size == 0;
    }

    public String peekMin(){
	_data.get(_size-1);
    }

    public String removeMin(){
	_data.remove(_size-1);
    }

    
}
