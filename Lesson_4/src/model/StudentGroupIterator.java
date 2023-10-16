package model;

import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {
    private int index;
    private final List<Student> students;

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.index = 0;
        this.students = studentGroup.getStudents();
    }

    @Override
    public boolean hasNext() {
        return index < students.size() - 1;
    }

    @Override
    public Student next() {
        if(!hasNext()){
            return null;
        }
        return students.get(index++);
    }
}
