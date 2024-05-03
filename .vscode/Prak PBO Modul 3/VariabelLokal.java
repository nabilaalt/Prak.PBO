public class VariabelLokal {
    public void contohMethod() {
        String nama = "Asep";
        System.out.println("Nama: " + nama);
    }

    public static void main(String[] args) {
        VariabelLokal test = new VariabelLokal();
        test.contohMethod();
    }
}
