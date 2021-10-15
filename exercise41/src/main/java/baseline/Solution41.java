
/*
 * UCF COP3330 Fall 2021 Assignment 4 Solutions
 * Copyright 2021 Jonah Fernandez
 */


package baseline;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Solution41 {

    public static void main(String[] args) {


        // Program will read form list of names from a text file named 'exercise41_input.txt'
        // Program will have a method or methods to sort alphabetically
        // Program will print list of names alphabetically to a text file named 'exercise41_output.txt'
        // Output text will display number of names along with a marker then a column of names sorted.
    }
    // Will most likely use Reader object to read in file
    private static ArrayList<String> fileReader(BufferedReader inFile, String file){
        // Using array list to do this.
        ArrayList<String> inputText = new ArrayList<>();

        // try block for error handling
        try{
            // Buffered reader object creating a new file reader object
            inFile = new BufferedReader(new FileReader(file));

            var textReader = inFile.readLine();

            while (textReader != null){

                inputText.add(textReader);
                textReader = inFile.readLine();
            }
        }catch (IOException exception){
            exception.printStackTrace();
        }finally {

            try{

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
   // private static BufferedWriter fileWriter(BufferedWriter outputFile, ArrayList<String>, sorted ){

   // }
    // going to have to figure out to add to the file as well


}