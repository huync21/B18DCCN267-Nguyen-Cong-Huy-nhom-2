
package bai2;


public class StackOfChars {
    private char element[];
    private int size;
    int max;
    
    public StackOfChars(){
        size=0;
        max=16;
        element=new char[max];
    }
    
    public StackOfChars(int capacity){
        size=0;
        max=capacity;
        element=new char[max];
    }
    
    public boolean isEmpty(){
        return size==0;
    }
    
    public boolean isFull(){
        return size==max;
    }
    
    public char peak(){
        return element[--size];
    }
    
    public void push(char ch){
        element[size]=ch;
        size++;
    }
    
    public char pop(){
        return element[size--];
    }
    
    public int getSize(){
        return size;
    }
}
