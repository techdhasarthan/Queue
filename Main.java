public class Main {

    public static void main(String[] args) {

        CircularQueue queue = new CircularQueue();


        //Enqueue Function Call
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(9);


//
//        queue.dequeue();
//        queue.dequeue();
//        queue.dequeue();
//        queue.dequeue();

       queue.display();


    }
}
