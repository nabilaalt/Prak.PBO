public class AccountAfter {
    private AdvertiserAfter owner;

    public void setOwner(AdvertiserAfter newOwner) {
        if (owner != newOwner) {
            AdvertiserAfter oldOwner = owner;
            owner = newOwner;
            if (newOwner != null)
                newOwner.addAccount(this);
            if (oldOwner != null)
                oldOwner.removeAccount(this);
        }
    }
}
