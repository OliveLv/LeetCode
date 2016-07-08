// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
class PeekingIterator implements Iterator<Integer> {
    private int current=-1;
    private Iterator<Integer>iterator;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	     if(iterator.hasNext())current=iterator.next();
	     this.iterator=iterator;
	}

    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return current;
	}

	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    int res=current;
	    if(iterator.hasNext())current=iterator.next();
	    else
	        current=-1;
	    return res;
	}

	@Override
	public boolean hasNext() {
	    return current!=-1;
	}
}