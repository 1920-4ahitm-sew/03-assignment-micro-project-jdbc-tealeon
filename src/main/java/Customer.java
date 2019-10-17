public class Customer extends Person {
    private int cusId;
    public Customer(int id, String name, int cusId) {
        super(id, name);
        this.cusId = cusId;
    }
}
