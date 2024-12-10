import org.code.theater.*;
import org.code.media.*;


import java.io.*;
import java.util.ArrayList; 

public class Main {
  public static void main(String[] args) {
  /*
  *List to hold State objects 
  */
    ArrayList<State> states = new ArrayList<>(); 
    try {
    /* 
    *Read state names from "states.txt" 
    */
      BufferedReader stateReader = new BufferedReader(new FileReader("states.txt")); 
      BufferedReader yearReader = new BufferedReader(new FileReader("years.txt")); 
      
      String stateName; 
      String year; 
      
      /*
      *Read both files line by line and link states with years 
      */
      while ((stateName = stateReader.readLine()) != null && (year = yearReader.readLine()) != null) { 
        int admissionYear = Integer.parseInt(year); // Convert year to integer 
        states.add(new State(stateName, admissionYear)); 
      } 
      /*
      *Close the file readers 
      */
      stateReader.close(); 
      yearReader.close(); 
      
      /*
      *Print the states and their admission years
      */
      for (State state : states) {
        System.out.println(state.name + " was admitted in " + state.admissionYear + ".");
      } 
    } catch (IOException e) {
      System.out.println("Error reading files: " + e.getMessage()); 
    } 
  } 
}
