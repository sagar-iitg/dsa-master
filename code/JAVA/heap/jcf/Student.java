package heap.jcf;

class Student implements Comparable<Student>{

    String name;
    int rank;

    public Student(String name,int rank)
    {
        this.name=name;
        this.rank=rank;

    }

    @Override
    public int compareTo(Student o) {
        

        return this.rank-o.rank;
    }
    
}
