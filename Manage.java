package aylacar;

import java.util.ArrayList;

public class Manage {
    private ArrayList<Customer> customers;
    private ArrayList<Product> products;
    private ArrayList<Installer> installers;
    private ArrayList<Order> orders;

    public Manage() {
        customers = new ArrayList<>();
        products = new ArrayList<>();
        installers = new ArrayList<>();
        orders = new ArrayList<>();
    }

    // Methods to add and retrieve data

    public boolean customerExists(String username, String password) {
        for (Customer customer : customers) {
            if (customer.getName().equals(username) && customer.getPassword().equals(password)) {
                return true; 
            }
        }
        return false; 
    }
    
    
    
    public boolean customerExistsByEmail(String email) {
        for (Customer customer : customers) {
            if (customer.getEmail().equals(email)) {
                return true; // Customer with the given email exists
            }
        }
        return false; 
       
    }
    
    
    
    public boolean isCustomerPasswordCorrect(String email, String password) {
        for (Customer customer : customers) {
            if (customer.getEmail().equals(email) && customer.getPassword().equals(password)) {
                return true; // Provided password is correct for the customer with the given email
            }
        }
        return false; // Password is incorrect for the customer with the given email
    }
    
    
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void addInstaller(Installer installer) {
        installers.add(installer);
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public ArrayList<Installer> getInstallers() {
        return installers;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

	
	public void sendemail() {
		// TODO Auto-generated method stub
		
	}
}
