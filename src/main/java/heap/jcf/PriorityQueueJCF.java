package heap.jcf;

import java.util.Comparator;
import java.util.PriorityQueue;

class PriorityQueueJCF{

    public static void main(String[] args) {
        
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(7);

        while(!pq.isEmpty())
        {
            System.out.println(pq.peek()); //0(1)
            pq.remove();

        }

        PriorityQueue<Student> pq1=new PriorityQueue<>(Comparator.reverseOrder());
        pq1.add(new Student("A", 400));
        pq1.add(new Student("B", 8));
        pq1.add(new Student("C", 5));
        pq1.add(new Student("D", 40));
        pq1.add(new Student("E", 14));

        System.out.println("----------------------");
        while(!pq1.isEmpty())
        {
            System.out.println(pq1.peek().name +" "+ pq1.peek().rank+" \n"+pq1.peek()); //0(1)
            pq1.remove();

        }

    }
}