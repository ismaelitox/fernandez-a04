
/*
 * UCF COP3330 Fall 2021 Assignment 4 Solutions
 * Copyright 2021 Jonah Fernandez
 */


package baseline;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution41 {

    private static BufferedWriter writeFile;
    static BufferedReader readFile;

    public static void main(String[] args) {


        // Data from text file will be stored in a String Array with variable 'Text Lines'
        ArrayList<String> textLines = fileReader(readFile);
        // This is the actual method used to sort the textLines
        Collections.sort(textLines);
        // String data from fileWriter method will be written to ex41_output.txt
        writeFile = fileWriter(writeFile, textLines);

        // Program will read form list of names from a text file named 'exercise41_input.txt'
        // Program will have a method or methods to sort alphabetically
        // Program will print list of names alphabetically to a text file named 'exercise41_output.txt'
        // Output text will display number of names along with a marker then a column of names sorted.
    }
    // Will most likely use Reader object to read in file
    private static ArrayList<String> fileReader(BufferedReader inFile){
        // Using array list to do this.
        ArrayList<String> inputText = new ArrayList<>();

        // try block for error handling
        try{
            // Buffered reader object creating a new file reader object
            inFile = new BufferedReader(new FileReader("data/exercise41_input.txt"));
            // helper that iterates along line
            var textReader = inFile.readLine();
            // while end hasn't been reached
            while (textReader != null){
                // add to
                inputText.add(textReader);
                textReader = inFile.readLine();
            }
            // error handling
        }catch (IOException exception){
            exception.printStackTrace();
        }finally {

            try{
                // error handle for null
                if(inFile != null){
                    inFile.close();
                }

            }catch(IOException exception){
                exception.printStackTrace();
            }
        }
        return inputText ;
    }
    // Will create a listArray object to hold lines of the input text
    // will sort the input lines using  separate method from within java
    // will use a Writer object to write into the new file
    // going to have to figure out to add to the file as well

    // Method that will use BW to write sorted + formatted text to output file
    private static BufferedWriter fileWriter(BufferedWriter outputFile, ArrayList<String> sortedText) {
        // Try block to prevent crash if file doesn't write
        try {
            // Want to output file to be written to this destination
            outputFile = new BufferedWriter(new FileWriter("data/exercise41_output.txt"));
            // int will return number of lines without hardcoding actual number
            int numLines = sortedText.size();
            // Formatted output to go to top of text File
            outputFile.write("Total of " + numLines + " names\n------------\n");

            for (String lineMarker : sortedText) {
                outputFile.write(lineMarker);
                outputFile.newLine();
            }
        return outputFile;
            // File Not found
        } catch //
         (IOException exception){ exception.printStackTrace();
        } finally {
            try {
                // EOF, Close the file
                if (outputFile != null) outputFile.close();
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
        // returns file for testing
        return outputFile;
    }

}