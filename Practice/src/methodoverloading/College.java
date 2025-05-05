package methodoverloading;

public class College {
    void getStudentDetails(int c_id){
        System.out.println("Getting Student Details by College id");
    }
    void getStudentDetails(String dob,long mob){
        System.out.println("Getting Student Details by dob and mobile no.");
    }

    public static void main(String[] args) {
        College c = new College();
        c.getStudentDetails(1234);
        c.getStudentDetails("12-sep-203",2538041243L);

    }
}
