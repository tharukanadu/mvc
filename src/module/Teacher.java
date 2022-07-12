package module;

public class Teacher {
    private String teacher_id;
    private String teacher_name;
    private String nic;
    private String contact;
    private String address;

    public Teacher() {
    }

    public Teacher(String teacher_id, String teacher_name, String nic, String contact, String address) {
        this.teacher_id = teacher_id;
        this.teacher_name = teacher_name;
        this.nic = nic;
        this.contact = contact;
        this.address = address;
    }

    public String getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(String teacher_id) {
        this.teacher_id = teacher_id;
    }

    public String getTeacher_name() {
        return teacher_name;
    }

    public void setTeacher_name(String teacher_name) {
        this.teacher_name = teacher_name;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacher_id='" + teacher_id + '\'' +
                ", teacher_name='" + teacher_name + '\'' +
                ", nic='" + nic + '\'' +
                ", contact='" + contact + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
