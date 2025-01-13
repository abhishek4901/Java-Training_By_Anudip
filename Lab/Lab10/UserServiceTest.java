// Define the UserService interface
interface UserService {
    boolean registerUser(String username, String password);
}

// Mock implementation of UserService
class MockUserService implements UserService {
    @Override
    public boolean registerUser(String username, String password) {
        // Simulate successful registration if username and password are not empty
        return username != null && !username.isEmpty() && password != null && !password.isEmpty();
    }
}

// Main class to simulate the test case
public class UserServiceTest {
    public static void main(String[] args) {
        // Create a mock UserService object
        UserService mockUserService = new MockUserService();

        // Test case: Simulating a successful user registration
        String testUsername = "testUser";
        String testPassword = "password123";

        // Call the registerUser method
        boolean result = mockUserService.registerUser(testUsername, testPassword);

        // Print the result
        if (result) {
            System.out.println("Test Passed: User registration was successful.");
        } else {
            System.out.println("Test Failed: User registration was not successful.");
        }

        // Additional test cases can be added here
        testAdditionalCases(mockUserService);
    }

    // Helper method for additional tests
    private static void testAdditionalCases(UserService userService) {
        System.out.println("\nRunning additional test cases:");

        // Test case 1: Empty username
        boolean result1 = userService.registerUser("", "password123");
        System.out.println("Test Case 1: Empty username -> " + (result1 ? "Failed" : "Passed"));

        // Test case 2: Null password
        boolean result2 = userService.registerUser("testUser", null);
        System.out.println("Test Case 2: Null password -> " + (result2 ? "Failed" : "Passed"));

        // Test case 3: Both username and password are valid
        boolean result3 = userService.registerUser("validUser", "validPassword");
        System.out.println("Test Case 3: Valid username and password -> " + (result3 ? "Passed" : "Failed"));
    }
}
