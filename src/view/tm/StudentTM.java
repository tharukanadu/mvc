package view.tm;

public class StudentTM {
    private String student_id;
    private String student_name;
    private String email;
    private String contact;
    private String address;
    private String nic_no;

    public StudentTM() {
    }

    public StudentTM(String student_id, String student_name, String email, String contact, String address, String nic_no) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.email = email;
        this.contact = contact;
        this.address = address;
        this.nic_no = nic_no;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getNic_no() {
        return nic_no;
    }

    public void setNic_no(String nic_no) {
        this.nic_no = nic_no;
    }

    @Override
    public String toString() {
        return "StudentTM{" +
                "student_id='" + student_id + '\'' +
                ", student_name='" + student_name + '\'' +
                ", email='" + email + '\'' +
                ", contact='" + contact + '\'' +
                ", address='" + address + '\'' +
                ", nic_no='" + nic_no + '\'' +
                '}';
    }
}
