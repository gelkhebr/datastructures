//array implementation

import java.util.ArrayList;

import java.util.Iterator;
import java.util.Arrays;

public class Stack <T> {
    
    private int top=1;

    private T[] stackArray;

    private int stackSize;
    @SuppressWarnings("unchecked")
    public Stack(int size){

        

        this.stackArray= (T[]) new Object[size];
     


        top=-1;
        this.stackSize=size;

    }

    public T peek(){
        return this.stackArray[top];
    }

    public void push(T element) {
        if(!isFull()){
            
            
            this.stackArray[++top]=element;

        }
        else System.exit(-1);
    }

    public T pop(){
        if(!isEmpty()){
           
            T entry =stackArray[top--];
            this.stackArray[top+1]=null;
            this.stackSize--;

            return entry;
            
        }
        return null;
    }

  

    public boolean isFull(){
        return (top==this.stackSize-1); // 
    }


    public boolean isEmpty(){
        return top==-1;
    }

    public T get(int i){
        return this.stackArray[i];
    }

    public int size(){
        return this.stackSize;
    }


 




    public static void main(String []args){
        Stack<Integer> stack =new Stack<>(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.pop();
        stack.pop();
        stack.pop();
      
        System.out.println(stack.size());

        

       
        


       
           
     
           

    }

}
