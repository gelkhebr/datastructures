

    public class LinkedListStack {

        private Node top;
    
        private int size;
    
        LinkedListStack(){
            this.top=null;
        }
    
        private class Node {
    
            private Node next;
            private int data;
    
            public Node(int data){
                this.data=data;
                this.next=null;
            }
        }
    
    
            public void push(int data) {
    
                Node node=new Node(data);
             
    
                node.next=top;
    
                top=node;
                size++;
    
    
            }
    
    
            public int peek()
            {
                if(isEmpty()){
                    throw new NullPointerException("Parameter Type cannot be null");
                }
            
                return top.data;
    
            }
    
            public boolean isEmpty(){
                return top==null;
            }
    
    
            public int pop(){
                if(isEmpty()){
                    throw new NullPointerException("Parameter Type cannot be null");
                }
    
                System.out.println("Removing " +peek());
               
                
                int popped=top.data;
                top=top.next;

                return popped;
                
    
            }
    
    
            public void display() {
    
                if(top==null){
                    throw new NullPointerException("Parameter Type cannot be null");
                }
    
             
                Node temp=top;
    
                while(temp!=null){
                    System.out.println(temp.data);
                    temp=temp.next;
    
                }
            }
            
    
        
    
        
    
    
    
    
            public static void main(String [] args)
            {
    
                LinkedListStack stack = new LinkedListStack();
                stack.push(3);
               
                stack.push(5);
                
                stack.push(7);
                stack.push(9);
               

                stack.display();
    
    
    
            }
    
    
        }