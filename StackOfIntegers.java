public class StackOfIntegers{
    private int[] elements;
    private int size;

    //Default constructor
    public StackOfIntegers(){
        this.elements = new int[16];
        this.size = -1;
    }

    public StackOfIntegers(int capacity){
        this.elements = new int[capacity];
        this.size = -1; 
    }
    
    public boolean empty(){
        return this.size == -1; //empty size
    }

    public int peek(){
        return this.elements[this.size];
    }

    public void push(int value){
        int i = ++this.size;
        this.elements[i] = value;
    }

    public int pop(){
        int i = this.size--;
        return this.elements[i];
    }

    public int getSize(){
        return this.size;
    }
}