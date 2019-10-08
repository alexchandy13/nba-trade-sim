package com.test1.jsp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TmOpt {

    public static String TradeSim(String a1) {

        String csvFile = "/Users/alexchandy13/Documents/Basketball/Research/Trade Simulator/nbatms.csv";        
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        String tm = "";
        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] playerdata = line.split(cvsSplitBy);
                String team = playerdata[0];               		
                tm = tm+"<option>"+team+"</option>";
               
            }
            return tm;
        } 
        
        
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } 
        catch (IOException e) {
            e.printStackTrace();
        } 
        finally {
            if (br != null) {
                try {
                    br.close();
                } 
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        
        return null;

    }

}


