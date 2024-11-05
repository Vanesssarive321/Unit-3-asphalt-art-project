
import java.util.Scanner;
/**
 * The UserStory class handles the movie data, including names and revenue amount.
 * Provides methods to find the maximum worldwide and domestic revenue to answer the film critics question.
 */

public class UserStory {

  //Arrays that store the movie names, worldwide revenue amounts, and domestic revenue amounts
  public String[ ] movieName;
  public int[ ] worldwideRevenue;
  public int[ ] domesticRevenue;

public UserStory() {

  //constructor that initializes empty arrays
  this.movieName = new String[0];
  this.worldwideRevenue = new int[0];
  this.domesticRevenue = new int[0];
}
  
  
  public UserStory(String movieNameFile, String worldwideRevenueFile, String domesticRevenueFile) {

    //Constructor initializes the arrays based on the file input
    movieName = FileReader.toStringArray(movieNameFile);
    worldwideRevenue = FileReader.toIntArray(worldwideRevenueFile);
    domesticRevenue = FileReader.toIntArray(domesticRevenueFile);
}  

  //Method that finds the Maximum Worldwide Revenue of all the movies
  public int findMaxWorldwideRevenue() {
    int max = 0;
    for (int revenue : worldwideRevenue) {
      if (revenue > max) {
        max = revenue;
      }
    }
    return max;
  }


  //Method that finds the Maximum Domestic Revenue of all the movies
  public int findMaxDomesticRevenue() {
    int max = 0;
    for (int revenue : domesticRevenue) {
      if (revenue > max) {
        max = revenue;
      }
    }
    return max;
  }


  // toString method that returns a string representation of the UserStory object
  public String toString() {
    return "Movie Name: " + movieName[0] + "\n" + 
      "Max Worldwide Revenue: $" + findMaxWorldwideRevenue() +  "\n" + 
      "Max Domestic Revenue: $" + findMaxDomesticRevenue();
  }

  
}
