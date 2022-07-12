package module;

public class Course {
    private String course_id;
    private String course_name;
    private double cost;
    private String duration;
    private String subject_id;

    public Course() {
    }

    public Course(String course_id, String course_name, double cost, String duration, String subject_id) {
        this.course_id = course_id;
        this.course_name = course_name;
        this.cost = cost;
        this.duration = duration;
        this.subject_id = subject_id;
    }

    public String getCourse_id() {
        return course_id;
    }

    public void setCourse_id(String course_id) {
        this.course_id = course_id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(String subject_id) {
        this.subject_id = subject_id;
    }

    @Override
    public String toString() {
        return "Course{" +
                "course_id='" + course_id + '\'' +
                ", course_name='" + course_name + '\'' +
                ", cost=" + cost +
                ", duration='" + duration + '\'' +
                ", subject_id='" + subject_id + '\'' +
                '}';
    }
}
