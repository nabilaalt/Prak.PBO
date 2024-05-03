public class Advertiser {
    private Account account;

    public Advertiser() {
        account = new Account(this);
    }

    public Account getAccount() {
        return account;
    }

    public static void main(String[] args) {
        // membuat objek 
        Advertiser advertiser = new Advertiser();

        // mendapatkan akun dari advertiser
        Account account = advertiser.getAccount();

        // menampilkan informasi pemilik akun
        Advertiser owner = account.getOwner();
        System.out.println("Owner of the account: " + owner);
    }
}