package src;

public class Group {
    private int length;
    private String reference;
    private Teacher teacher;
    private Student students[] = new Student[length];
    private Topic topic;
    private Classroom classroom;

    public Group(){}

    public Group(String reference, Teacher teacher, Topic topic, Classroom classroom, int length) {
        this.reference = reference;
        this.teacher = teacher;
        this.topic = topic;
        this.classroom = classroom;
        this.length = length;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
