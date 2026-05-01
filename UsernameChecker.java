import java.util.HashSet;

public class UsernameChecker {
public static void main(String[] args) {
HashSet<String> usernames = new HashSet<>();

usernames.add("john");
usernames.add("aydan"); 
usernames.add("leyla");
usernames.add("john");
usernames.add("ali");

System.out.println("Unique usernames:");
// ===== TODO 2 =====
// Print all usernames using forEach lambda.
usernames.forEach(username -> System.out.println(username));

System.out.println("\nChecking username:");
String newUsername = "emil";
// ===== TODO 3 =====
// If username exists print:
// Username already taken
// Otherwise add it and print:
// Username added
if(usernames.contains(newUsername)) {
    System.out.println("Username already taken"); }
    else{usernames.add(newUsername);
    System.out.println("Username added");}

}
}