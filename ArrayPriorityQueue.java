//Team QueuePrivilege
//Shakil Rafi, Gian Tricarico, James Zhang
//APCS2 pd4
//HW32 - Getting past the velvet rope
//2017-04-19

import java.util.ArrayList;


public class ArrayPriorityQueue {


    private ArrayList<String> _data;
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
	_size++;
    }

    public boolean isEmpty(){
	return _size == 0;
    }

    public String peekMin(){
	return _data.get(0);
    }

    public String removeMin(){
	_size--;
	return _data.remove(0);
    }

    public String toString(){
	String retStr = "";
	for (int i = 0 ; i < _size -1 ; i++){
	    retStr += _data.get(i);
	}
	return retStr;
    }

    public static void main(String[] args){

	ArrayPriorityQueue APQ = new ArrayPriorityQueue();

	APQ.add("2 popsicle");
	
	System.out.println(APQ);

	APQ.add("1 ice cream");
	
	System.out.println(APQ);

	APQ.add("3 sundae");
	
	System.out.println(APQ);

	APQ.add("3 milkshake");
	
	System.out.println(APQ);
	
	System.out.println(APQ.removeMin());

	System.out.println(APQ);
    }
    
}
