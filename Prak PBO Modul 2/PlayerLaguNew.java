import java.util.Scanner;

class PlayerLaguNew {
    private String judulLagu;
    private String penyanyi;
    private boolean sedangDiputar;

    // Konstruktor untuk inisialisasi objek PlayerLagu
    public PlayerLaguNew(String judulLagu, String penyanyi) {
        this.judulLagu = judulLagu;
        this.penyanyi = penyanyi;
        this.sedangDiputar = false;
    }

    // Method untuk memutar lagu
    public void putar() {
        if (!sedangDiputar) {
            System.out.println("Memutar lagu: " + judulLagu + " - " +
                    penyanyi);
            sedangDiputar = true;
        } else {
            System.out.println("Lagu sedang diputar.");
        }

    }

    public String getJudul() {
        return judulLagu;
    }

    public void setJudul(String judul) {
        this.judulLagu = judul;
    }

    public String getPenyanyi() {
        return penyanyi;
    }

    public void setPenyanyi(String penyanyi) {
        this.penyanyi = penyanyi;
    }

    public static void main(String[] args) {
        // Membuat objek PlayerLagu
        PlayerLaguNew lagu1 = new PlayerLaguNew("Lagu Somebody's Pleasure", "Aziz Rendra");
        PlayerLaguNew lagu2 = new PlayerLaguNew("Lantas", "Juicy Luicy");

        lagu1.getJudul();
        lagu1.setJudul("hahaha");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nomor lagu yang ingin diputar (1 atau 2) :");

        int nomorLagu = scanner.nextInt();
        scanner.nextLine();
        if (nomorLagu == 1) {
            lagu1.putar();
        } else if (nomorLagu == 2) {
            lagu2.putar();
        } else {
            System.out.println("Nomor lagu tidak valid.");
        }
        scanner.close();
    }
}