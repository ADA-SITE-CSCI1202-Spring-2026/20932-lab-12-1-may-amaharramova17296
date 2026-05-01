public class ThreadLambdaTask {
public static void main(String[] args) {
// ===== TODO 1 =====
// Create a thread using lambda.
// It should print numbers from 1 to 5.
Thread thread1 = new Thread(()-> {for(int i = 0; i < 5; i++){System.out.println(i + 1);}});
// ===== TODO 2 =====
// Start the thread.
thread1.start();
System.out.println("Main method finished.");
}
}