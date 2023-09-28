package queue.collection;

import java.util.LinkedList;
import java.util.Queue;

class QueueExample{


    public static void main(String[] args) {
        

        //linked list
        //arraydeque

        Queue<Integer> q=new LinkedList<>();
        

        // q.add(1);
        // q.add(2);
        // q.add(3);
          q.offer(1);
          q.offer(2);

          System.out.println(q.size());
          System.out.println(q);
          System.out.println(q.poll());
      //  q.offer(3);
        // while(!q.isEmpty())
        // {
        //     System.out.println(q.peek());
        //     q.remove();
        // }
        


    }

}