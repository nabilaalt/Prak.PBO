public class PrimitifConversionAssignment2 {
    public static void main(String[] args) {
        double d;
        short s;
        d = 1.2345;
        s = (short) d; //Konversi secara eksplisit 
        //karena konversi dilakukan dari tipe data yang lebih besar ke yang lebih kecil

        // Menampilkan nilai
        System.out.println("Nilai s: " + s);
    }
}