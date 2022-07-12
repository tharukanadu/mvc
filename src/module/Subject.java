package module;

public class Subject {
    private String subject_id;
    private String subject_name;
    private double credit;
    private String teacher_id;

    public Subject() {
    }

    public Subject(String subject_id, String subject_name, double credit, String teacher_id) {
        this.subject_id = subject_id;
        this.subject_name = subject_name;
        this.credit = credit;
        this.teacher_id = teacher_id;
    }

    public String getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(String subject_id) {
        this.subject_id = subject_id;
    }

    public String getSubject_name() {
        return subject_name;
    }

    public void setSubject_name(String subject_name) {
        this.subject_name = subject_name;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public String getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(String teacher_id) {
        this.teacher_id = teacher_id;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subject_id='" + subject_id + '\'' +
                ", subject_name='" + subject_name + '\'' +
                ", credit=" + credit +
                ", teacher_id='" + teacher_id + '\'' +
                '}';
    }
}
