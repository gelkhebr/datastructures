class PriorityQueue
{


    private int [] heap;
    
    private int capacity;

    private int size;


    public PriorityQueue(int n){

        this.capacity=n;
        this.size=-1;
        this.heap=new int[this.capacity];
        
    }


    public int peek()
    {
        return heap[0];
    }


    

    public int getParent(int childIndex)
    {
        return ((childIndex-1)/2);
    }


    public int getLeftChild(int i)
    {
        return ((2*i)+1);
    }

    public int getRightChild(int i)
    {
        return ((2*i)+2);
    }

    //extract max
    public int dequeue()

    {
       
        int result =heap[0];

        heap[0]=heap[this.size];

        this.size--;
        siftDown(0);
        

        return result;
        
        
    }

    public boolean isValid(int index)
    {
   
        
            return index>=0&&index<this.size;


    }

    public void insert(int n)
    {
       
       if(!isFull() &&this.size<this.capacity){
           this.size++;
        this.heap[this.size]=n;
        
        siftUp(this.size);

        
        
       }

       else {
        throw new IllegalArgumentException("Index out of bounds");
        
       }
    }

    public boolean isFull(){
        return size>=capacity;
    }

    public void siftUp(int i)

    {

       
        int parentIndex= getParent(i);

        while(isValid(parentIndex)&&heap[i]>heap[parentIndex])
        {
            swap(i,parentIndex);

          i=parentIndex;

            parentIndex=getParent(i);


           
        }

    }

    public void siftDown(int i)

    {


    //

    int left=getLeftChild(i);

    int right =getRightChild(i);

    int maxChild;

    int parent=i;


    while(isValid(i)) {

        maxChild=left;
        
    
        if(isValid(maxChild)&&this.heap[right]>this.heap[left]){
            maxChild=right;
        }

        if(this.heap[maxChild]>this.heap[parent]) {
            swap(parent,maxChild);
            parent=maxChild;
            left=getLeftChild(parent);


        }

        else 
        break;



    }


    }




    

    public void swap(int i, int j)
    {

    int temp=heap[i];

    heap[i]=heap[j];

    heap[j]=temp;

    }




public static void main(String [] args)
{


      int size =9;
        PriorityQueue priorityQueue = new PriorityQueue(size);

        priorityQueue.insert(45);
        priorityQueue.insert(20);
        priorityQueue.insert(14);
        priorityQueue.insert(12);
        priorityQueue.insert(31);
        priorityQueue.insert(7);
        priorityQueue.insert(11);
        priorityQueue.insert(13);
        priorityQueue.insert(7);


     
      
        
       


        int i = 0;
 
  // Priority queue before extracting max
  System.out.print("Priority Queue : ");
  while (i < size)
  {
    System.out.print(priorityQueue.heap[i] + " ");
    i++;
  }

  System.out.print("Node with maximum priority : " +
                    priorityQueue.dequeue() + "\n");




                    System.out.print("Priority queue after " +
                    "extracting maximum : ");
   int j = 0;
   while (j < size)
   {
     System.out.print(priorityQueue.heap[j] + " ");
     j++;
   }



}

}