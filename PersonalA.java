public class PersonalA {
    String name;
    int age;
    String gender;
    String address;
    String qualification;
    PersonalA ()
    {
        name = "Tran Quoc Ninh";
        age = 25;
        gender = "Boy";
        address = "599 CMT8 P13 Q10 TPHCM";
        qualification = "HDSE";
    }
    void PersonalDetails (PersonalA Personal){
        System.out.println("Name: " + Personal.name);
        System.out.println("Age: " + Personal.age);
        System.out.println("Gender: " + Personal.gender);
        System.out.println("Address: " + Personal.address);
        System.out.println("Qualification: " + Personal.qualification);
    }
    public static void main(String[] args) {
        PersonalA Personal = new PersonalA();
        Personal.PersonalDetails(Personal);
    }
}
