public class QueueArray <T> {

    private int front,rear,capacity,size;

    private T [] queueArray;

    @SuppressWarnings("unchecked")
    public QueueArray(int n){

        this.capacity=n;
        this.queueArray=(T[]) new Object[this.capacity];
        this.size=1;

        front=rear=0;

    
    }

    public T front() {
        if(front==rear)
        {
            throw new NullPointerException("Queue is empty boy");
        }
         return this.queueArray[front];
    }




    public boolean isQueueFull()
    {
        return this.capacity==rear;
    }

    public void queueEnqueue(T data){
        if(this.capacity==rear){
            throw new NullPointerException("Queue is Full");

        }

        queueArray[rear++]=data;
       this.size++;



    }

    public boolean isEmpty()
    {
        return this.size==0;
    }

    public T dequeEnque()
    {
        if(isEmpty())
        {
            throw new NullPointerException("Queue is empty boy");

        }

        T item=queueArray[front++];
        this.size--;
        return item;


    }


    public void display(){
        
        for(int i=this.front;i<this.rear;i++){
            System.out.print(" <- " +queueArray[i]);
        
        }
        System.out.println();
    }


    public static void main(String [] args){
        QueueArray<Integer> queue = new QueueArray<>(4);
        queue.queueEnqueue(20);
        queue.queueEnqueue(30);
        queue.queueEnqueue(40);
        queue.queueEnqueue(50);
 
      queue.display();
      queue.dequeEnque();
      System.out.println("After one node deletion");
      queue.display();

      System.out.println("After two node deletions");
      queue.dequeEnque();
      queue.dequeEnque();

      


      queue.display();

     

      


        
      


      


        


      
    }







}