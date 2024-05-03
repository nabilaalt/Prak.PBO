public class Dosen {
    private String nip;
    private String nama;

    public Dosen(String nip, String nama) {
        setNip(nip);
        setNama(nama);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }
}
