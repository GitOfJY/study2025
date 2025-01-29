package collection.iteratable;

import java.util.Iterator;

public class MyArrayIterator implements Iterator<Integer> {

    private int currentIdex = -1;
    private int[] targetArr;

    public MyArrayIterator(int[] targetArr) {
        this.targetArr = targetArr;
    }

    @Override
    public boolean hasNext() {
        return currentIdex < targetArr.length - 1;
    }

    @Override
    public Integer next() {
        // currentIdex++;
        // result = targetArr[currentIdex];
        // return result;
        return targetArr[++currentIdex];
    }
}
