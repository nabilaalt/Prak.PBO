public class Main2 {
    public static void main(String[] args) {
        Student student = new Student();

        // penggunaan setter
        student.setId(1L);
        student.setNim("1227050100");
        student.setName("Nabila Lailatanzila");
        student.setAge((byte) 20);
        student.setAddress("jl. ujungberung");
        student.setPhoneNo("089089767581");

        // Mendapatkan nilai atribut menggunakan getter
        System.out.println("ID: " + student.getId());
        System.out.println("NIM: " + student.getNim());
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Address: " + student.getAddress());
        System.out.println("Phone Number: " + student.getPhoneNo());
    }
}