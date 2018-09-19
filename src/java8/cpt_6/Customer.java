package java8.cpt_6;

public class Customer extends Person {

    private String address;
    private String phone;

    public String toString(){
        return super.toString() + "\n"+
                getAddress() +" "+ getPhone();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public static void main(String [] args){
        Customer customer = new Customer();
        customer.setName("Name");
        customer.setSurname("Surname");
        customer.setAddress("Address");
        customer.setPhone("Phone");
        System.out.println("Customer = " + customer.toString());

    }
}
