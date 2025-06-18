public class CustomerService {
    private CustomerRepository cr;
    public CustomerService(CustomerRepository cr) {
        this.cr = cr;
    }
    public String getCustomerDetails(int id) {
        return cr.findCustomerById(id);
    }
}
