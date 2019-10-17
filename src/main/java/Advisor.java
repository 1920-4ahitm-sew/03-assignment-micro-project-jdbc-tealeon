public class Advisor extends Person {
    private int adId;

    public Advisor(int id, String name, int adId) {
        super(id, name);
        this.adId = adId;
    }

    public int getAdId() {
        return adId;
    }

    public void setAdId(int adId) {
        this.adId = adId;
    }
}
