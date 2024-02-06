public class App {
    public static void main(String[] args) {
        User user1 = new User.UserBuilder("John", "Doe", "john.doe@example.com")
                .address("123 Main St")
                .phone("555-1234")
                .age(25)
                .build();

        User user2 = new User.UserBuilder("Alice", "Smith", "alice.smith@example.com")
                .phone("555-5678")
                .build();

        System.out.println("User 1:");
        System.out.println("First Name: " + user1.getFirstName());
        System.out.println("Last Name: " + user1.getLastName());
        System.out.println("Email: " + user1.getEmail());
        System.out.println("Address: " + user1.getAddress());
        System.out.println("Phone: " + user1.getPhone());
        System.out.println("Age: " + user1.getAge());
        System.out.println();

        System.out.println("User 2:");
        System.out.println("First Name: " + user2.getFirstName());
        System.out.println("Last Name: " + user2.getLastName());
        System.out.println("Email: " + user2.getEmail());
        System.out.println("Address: " + user2.getAddress());
        System.out.println("Phone: " + user2.getPhone());
        System.out.println("Age: " + user2.getAge());
    }
}
