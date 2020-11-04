
package bai2;


public class StackOfIntegers {
    private int [] elements;
    private int size;
    int max;

    public StackOfIntegers() {
        size=0;
        elements=new int[16];
        max=16;
    }
    
    public StackOfIntegers(int capacity){
        size=0;
        elements=new int[capacity];
        max=capacity;
    }
    
    public boolean isEmpty(){
        return(size==0);
    }
    
    public boolean isFull(){
        return(size==max);
    }
    
    public int peak(){
        return elements[size-1];
    }
    
    public void push(int x){
        elements[size]=x;
        size++;
    }
    
    public int pop(){
        return(elements[--size]);
    }
    
    public int getSize(){
        return size;
    }
    
    public void displayThuaSoNguyenToNguoc(int n,StackOfIntegers st){
        for(int i=2;i<=n;i++){
            while(n%i==0){
                n/=i;
                st.push(i);
            }
        }
        
        while(st.getSize()>0){
            System.out.print(st.pop()+" ");
        }
    }
    
    
}

