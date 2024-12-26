import java.util.ArrayList;
import java.util.List;

public class CheckedExceptionClasss {
    public static void main(String[] args) {
        List<Student> listOfStudents = new ArrayList<>();

        listOfStudents.add(new Student("Raj", 2, "Third",
                7, new StudentAddress("Ranchi", "abc",
                "def", "ert", 8340L)));

        listOfStudents.add(new Student("Raj", 2, "Third",
                7, new StudentAddress("Ranchi", "abc",
                "def", "ert", 8340L)));



        for(Student student :listOfStudents){
            System.out.println(student);
        }
    }
}

class Student {
    private String name;
    private int rollNumber;
    private String batch;
    private int marks;
    private StudentAddress studentAddress;

    // Updated constructor
    public Student(String name, int rollNumber, String batch, int marks, StudentAddress studentAddress) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.batch = batch;
        this.marks = marks;
        this.studentAddress = studentAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public StudentAddress getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(StudentAddress studentAddress) {
        this.studentAddress = studentAddress;
    }


}

class Address {
    private String village;
    private String postoffice;
    private String policestation;
    private String district;

    public Address(String village, String postoffice, String policestation, String district) {
        this.village = village;
        this.postoffice = postoffice;
        this.policestation = policestation;
        this.district = district;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getPostoffice() {
        return postoffice;
    }

    public void setPostoffice(String postoffice) {
        this.postoffice = postoffice;
    }

    public String getPolicestation() {
        return policestation;
    }

    public void setPolicestation(String policestation) {
        this.policestation = policestation;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }
}

class StudentAddress extends Address {
    private long pinCode;

    public StudentAddress(String village, String postoffice, String policestation, String district, long pinCode) {
        super(village, postoffice, policestation, district);
        this.pinCode = pinCode;
    }

    public long getPinCode() {
        return pinCode;
    }

    public void setPinCode(long pinCode) {
        this.pinCode = pinCode;
    }
}

class EmployeeAddress extends Address {
    private long pinCode;
    private String landMark;

    public EmployeeAddress(String village, String postoffice, String policestation, String district, long pinCode, String landMark) {
        super(village, postoffice, policestation, district);
        this.pinCode = pinCode;
        this.landMark = landMark;
    }

    public long getPinCode() {
        return pinCode;
    }

    public void setPinCode(long pinCode) {
        this.pinCode = pinCode;
    }

    public String getLandMark() {
        return landMark;
    }

    public void setLandMark(String landMark) {
        this.landMark = landMark;
    }
}
