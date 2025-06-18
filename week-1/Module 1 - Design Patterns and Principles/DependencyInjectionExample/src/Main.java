public class Main {
    public static void main(String[] args) {
        CustomerRepository cr = new CustomerRepositoryImpl();
        CustomerService cs = new CustomerService(cr);
        System.out.println(cs.getCustomerDetails(105));
    }
}
