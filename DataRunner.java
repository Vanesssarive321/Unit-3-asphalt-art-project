import java.util.Scanner;
/**
 * DataRunner.java initializes a UserStory object and prompts the user for the most grossing movie of 2024.
 */
public class DataRunner {
  public static void main(String[] args) {

    // Create a UserStory object with file names for movie names and both revenues
    UserStory userStory = new UserStory("ReleaseGroup.txt", "WorldwideRevenue.txt", "DomesticRevenue.txt");
    
    //The question that the film critic wants to answer
    System.out.println("What is the most grossing movie of 2024?"  + "\n");
    
    //Prints the answers to the film critics question
    System.out.println(userStory);


    
    
    
  }
}