package com.test1.jsp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.*;

public class PlayerOpt {

    public static String TradeSim(String a1) {

        String csvFile = "/Users/alexchandy13/Documents/Basketball/Research/Trade Simulator/nbaratings.csv";        
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        String options = "";
        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] playerdata = line.split(cvsSplitBy);
               
                String name = playerdata[0];
                String pos = playerdata[1];
                String team = playerdata[2];
                double y1 = Double.parseDouble(playerdata[3]);
                double y2 = Double.parseDouble(playerdata[4]);
                double y3 = Double.parseDouble(playerdata[5]);
                double y4 = Double.parseDouble(playerdata[6]);
                double y5 = Double.parseDouble(playerdata[7]);
                double y6 = Double.parseDouble(playerdata[8]);
                double y7 = Double.parseDouble(playerdata[9]);
                double length = Double.parseDouble(playerdata[10]);
                double fa = Double.parseDouble(playerdata[11]);
                double rating = Double.parseDouble(playerdata[12]);
                double age = Double.parseDouble(playerdata[13]);
                
                double ry1 = y1;
                double ry2 = y2-y1;
                double ry3 = y3-y2;
                double ry4 = y4-y3;
                double ry5 = y5-y4;
                double ry6 = y6-y5;
               
         
               		
                options = options + "<option>"+name+" "+team+" "+pos+" "+"Player Val:"+" "+Math.round(rating)+" "+"Current Contract:"+" "+Math.round(ry1)+" "+"</option>";
                //                             0  1      2        3         4      5               6                7        8              9
                //                             10 11    12        13        14     15             16               17       18             19
          
            }
            return options;
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


