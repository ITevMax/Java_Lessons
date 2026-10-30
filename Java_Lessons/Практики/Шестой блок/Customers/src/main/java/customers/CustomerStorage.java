package customers;

import java.util.ArrayList;
import java.util.List;

public class CustomerStorage {
    private final List<Customer> customers = new ArrayList<>();

    public void addCustomer(String info) {
        if (info == null || info.isBlank())
            throw new IllegalArgumentException();

        var customerInfo = info.trim().split("\\s+");

        if (customerInfo.length != 4) {
            throw new IllegalArgumentException();
        }

        var customer = new Customer(
                customerInfo[0],
                customerInfo[1],
                customerInfo[2],
                customerInfo[3]
        );

        customers.add(customer);
    }

    public void listCustomers() {
        if (customers.isEmpty()) {
            return;
        }

        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

    public void removeCustomer(String data) {
        var customer = getCustomer(data);

        if (customer == null) {
            throw new IllegalArgumentException();
        }

        customers.remove(customer);
    }

    public Customer getCustomer(String data) {
        if (data == null || data.isBlank()) {
            throw new IllegalArgumentException();
        }

        var parts = data.trim().split("\\s+");

        if (parts.length != 2) {
            throw new IllegalArgumentException();
        }

        var name = parts[0];
        var surname = parts[1];

        for (var customer : customers) {
            if (customer.getName().equals(name)
                    && customer.getSurname().equals(surname)) {
                return customer;
            }
        }

        return null;
    }

    public int getCount() {
        return customers.size();
    }
}