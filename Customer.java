package aylacar;

public class Customer {
    private int customerId;
    private String name;
    private String email;
    private String phoneNumber;
    private String address;
    private String password;

    public Customer() {
        this.customerId = customerId;
        this.name=name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.password=password;
    }

    // Getters and Setters for the properties

    public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
