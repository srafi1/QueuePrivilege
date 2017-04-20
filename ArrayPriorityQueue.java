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

    public int getPriority(String s) {
	return (int)s.charAt(0);
    }
    
    public void add(String s) {
	int i = _data.size();
	while (i > 0 || getPriority(s) > getPriority(_data.get(i))) {
	    i--;
	}
	_data.add(i, s);
    }

    public boolean isEmpty(){
	return _size == 0;
    }

    public String peekMin(){
	_data.get(0);
    }

    public String removeMin(){
	_data.remove(0);
    }

    
}
