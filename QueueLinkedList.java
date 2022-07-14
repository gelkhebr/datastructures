public class QueueLinkedList<T> {


    private Node<T> front;
    private Node<T> rear;



    private int size;

    public QueueLinkedList ()
    {
        this.front = this.rear = null;
    }

    private class Node<T> {
        private Node<T> next;
            private T data;

        public Node(T data){

            this.data=data;
            this.next=null;

            

            
        }

    }


        public void queueEnqueue(T n){

            Node<T>  temp = new Node<T>(n);

            if(size==0){
                
                front=rear=temp;
            
            }
            
                else
                {
                    rear.next= temp;
                    rear=temp;
                }
                this.size++;

        }

        public T queueDeque()
        {

            if(size==0)
            {
                 throw new NullPointerException("Queue is Empty");
            }
           

            T item =front.data;
            front=front.next;
            this.size--;
            return item;

        }
    


public static void main(String [] args)
{




            QueueLinkedList<Integer> queue = new QueueLinkedList<Integer>();
            queue.queueEnqueue(5);
            queue.queueEnqueue(10);
            queue.queueEnqueue(15);
            queue.queueEnqueue(20);

            System.out.println(queue.queueDeque());
            System.out.println(queue.queueDeque());
            System.out.println(queue.queueDeque());
            




}





}