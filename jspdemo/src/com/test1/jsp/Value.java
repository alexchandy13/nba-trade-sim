package com.test1.jsp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Value {

    public static String TradeSim(String t1a1, String t1a2, String t1a3, String t1a4, String t1a5, String t1a6,
    								 String t2a1, String t2a2, String t2a3, String t2a4, String t2a5, String t2a6,
    								 String t3a1, String t3a2, String t3a3, String t3a4, String t3a5, String t3a6,
    								 String t4a1, String t4a2, String t4a3, String t4a4, String t4a5, String t4a6,
    								 String t1d1, String t1d2, String t1d3, String t1d4, String t1d5, String t1d6,
    								 String t2d1, String t2d2, String t2d3, String t2d4, String t2d5, String t2d6,
    								 String t3d1, String t3d2, String t3d3, String t3d4, String t3d5, String t3d6,
    								 String t4d1, String t4d2, String t4d3, String t4d4, String t4d5, String t4d6) {

 
// Retrieving String of Inputs                
                
                	String totval = t1a1+" "+t1a2+" "+t1a3+" "+t1a4+" "+t1a5+" "+t1a6+" "+
                				   t2a1+" "+t2a2+" "+t2a3+" "+t2a4+" "+t2a5+" "+t2a6+" "+
                				   t3a1+" "+t3a2+" "+t3a3+" "+t3a4+" "+t3a5+" "+t3a6+" "+
                				   t4a1+" "+t4a2+" "+t1a3+" "+t4a4+" "+t4a5+" "+t4a6;
                	
        			String vl[] = totval.split(" ");
     
// Extracting Value of Each Asset        			
        			
        			double vt1a1, vt1a2, vt1a3, vt1a4, vt1a5, vt1a6,
        			       vt2a1, vt2a2, vt2a3, vt2a4, vt2a5, vt2a6,
        			       vt3a1, vt3a2, vt3a3, vt3a4, vt3a5, vt3a6,
        			       vt4a1, vt4a2, vt4a3, vt4a4, vt4a5, vt4a6;
        		
        			vt1a1 = Double.parseDouble(vl[6]);
        			vt1a2 = Double.parseDouble(vl[16]);
        			vt1a3 = Double.parseDouble(vl[26]);
        			vt1a4 = Double.parseDouble(vl[36]);
        			vt1a5 = Double.parseDouble(vl[46]);
        			vt1a6 = Double.parseDouble(vl[56]);
        			vt2a1 = Double.parseDouble(vl[66]);
        			vt2a2 = Double.parseDouble(vl[76]);
        			vt2a3 = Double.parseDouble(vl[86]);
        			vt2a4 = Double.parseDouble(vl[96]);
        			vt2a5 = Double.parseDouble(vl[106]);
        			vt2a6 = Double.parseDouble(vl[116]);
        			vt3a1 = Double.parseDouble(vl[126]);
        			vt3a2 = Double.parseDouble(vl[136]);
        			vt3a3 = Double.parseDouble(vl[146]);
        			vt3a4 = Double.parseDouble(vl[156]);
        			vt3a5 = Double.parseDouble(vl[166]);
        			vt3a6 = Double.parseDouble(vl[176]);
        			vt4a1 = Double.parseDouble(vl[186]);
        			vt4a2 = Double.parseDouble(vl[196]);
        			vt4a3 = Double.parseDouble(vl[206]);
        			vt4a4 = Double.parseDouble(vl[216]);
        			vt4a5 = Double.parseDouble(vl[226]);
        			vt4a6 = Double.parseDouble(vl[236]);
        			
// Extracting Current Salary of Each Asset        			
    
        			double ct1a1, ct1a2, ct1a3, ct1a4, ct1a5, ct1a6,
 				       ct2a1, ct2a2, ct2a3, ct2a4, ct2a5, ct2a6,
		               ct3a1, ct3a2, ct3a3, ct3a4, ct3a5, ct3a6,
		               ct4a1, ct4a2, ct4a3, ct4a4, ct4a5, ct4a6;


        			ct1a1 = Double.parseDouble(vl[9]);
        			ct1a2 = Double.parseDouble(vl[19]);
        			ct1a3 = Double.parseDouble(vl[29]);
        			ct1a4 = Double.parseDouble(vl[39]);
        			ct1a5 = Double.parseDouble(vl[49]);
        			ct1a6 = Double.parseDouble(vl[59]);
        			ct2a1 = Double.parseDouble(vl[69]);
        			ct2a2 = Double.parseDouble(vl[79]);
        			ct2a3 = Double.parseDouble(vl[89]);
        			ct2a4 = Double.parseDouble(vl[99]);
        			ct2a5 = Double.parseDouble(vl[109]);
        			ct2a6 = Double.parseDouble(vl[119]);
        			ct3a1 = Double.parseDouble(vl[129]);
        			ct3a2 = Double.parseDouble(vl[139]);
        			ct3a3 = Double.parseDouble(vl[149]);
        			ct3a4 = Double.parseDouble(vl[159]);
        			ct3a5 = Double.parseDouble(vl[169]);
        			ct3a6 = Double.parseDouble(vl[179]);
        			ct4a1 = Double.parseDouble(vl[189]);
        			ct4a2 = Double.parseDouble(vl[199]);
        			ct4a3 = Double.parseDouble(vl[209]);
        			ct4a4 = Double.parseDouble(vl[219]);
        			ct4a5 = Double.parseDouble(vl[229]);
        			ct4a6 = Double.parseDouble(vl[239]);
        			
// Extracting Original Team of Each Asset        			
        			 
        			String tt1a1, tt1a2, tt1a3, tt1a4, tt1a5, tt1a6,
        				   tt2a1, tt2a2, tt2a3, tt2a4, tt2a5, tt2a6,
        				   tt3a1, tt3a2, tt3a3, tt3a4, tt3a5, tt3a6,
        				   tt4a1, tt4a2, tt4a3, tt4a4, tt4a5, tt4a6;
        			
        			tt1a1 = vl[2];
        			tt1a2 = vl[12];
        			tt1a3 = vl[22];
        			tt1a4 = vl[32];
        			tt1a5 = vl[42];
        			tt1a6 = vl[22];
        			tt2a1 = vl[62];
        			tt2a2 = vl[72];
        			tt2a3 = vl[82];
        			tt2a4 = vl[92];
        			tt2a5 = vl[102];
        			tt2a6 = vl[112];
        			tt3a1 = vl[122];
        			tt3a2 = vl[132];
        			tt3a3 = vl[142];
        			tt3a4 = vl[152];
        			tt3a5 = vl[162];
        			tt3a6 = vl[172];
        			tt4a1 = vl[182];
        			tt4a2 = vl[192];
        			tt4a3 = vl[202];
        			tt4a4 = vl[212];
        			tt4a5 = vl[222];
        			tt4a6 = vl[232];
        			
// Determining Actual Team for Teams 1-4        			
        			
        			String t1id ="";
        			String t2id ="";
        			String t3id ="";
        			String t4id ="";
 
        			if (!tt1a1.equals("0")) {
        				t1id = tt1a1;
        			} else if (!tt1a2.equals("0")) {
        				t1id = tt1a2;
        			} else if (!tt1a3.equals("0")) {
        				t1id = tt1a3;
        			} else if (!tt1a4.equals("0")) {
        				t1id = tt1a4;
        			} else if (!tt1a5.equals("0")) {
        				t1id = tt1a5;
        			} else if (!tt1a6.equals("0")) {
        				t1id = tt1a6;
        			} else {
        				t1id = "0";
        			}
        			
        			if (!tt2a1.equals("0")) {
        				t2id = tt2a1;
        			} else if (!tt2a2.equals("0")) {
        				t2id = tt2a2;
        			} else if (!tt2a3.equals("0")) {
        				t2id = tt2a3;
        			} else if (!tt2a4.equals("0")) {
        				t2id = tt2a4;
        			} else if (!tt2a5.equals("0")) {
        				t2id = tt2a5;
        			} else if (!tt2a6.equals("0")) {
        				t2id = tt2a6;
        			} else {
        				t2id = "0";
        			}
        			
        			if (!tt3a1.equals("0")) {
        				t3id = tt3a1;
        			} else if (!tt3a2.equals("0")) {
        				t3id = tt3a2;
        			} else if (!tt3a3.equals("0")) {
        				t3id = tt3a3;
        			} else if (!tt3a4.equals("0")) {
        				t3id = tt3a4;
        			} else if (!tt3a5.equals("0")) {
        				t3id = tt3a5;
        			} else if (!tt3a6.equals("0")) {
        				t3id = tt3a6;
        			} else {
        				t3id = "0";
        			}
        			
        			if (!tt4a1.equals("0")) {
        				t4id = tt4a1;
        			} else if (!tt4a2.equals("0")) {
        				t4id = tt4a2;
        			} else if (!tt4a3.equals("0")) {
        				t4id = tt4a3;
        			} else if (!tt4a4.equals("0")) {
        				t4id = tt4a4;
        			} else if (!tt4a5.equals("0")) {
        				t4id = tt4a5;
        			} else if (!tt4a6.equals("0")) {
        				t4id = tt4a6;
        			} else {
        				t4id = "0";
        			}
        			
// Adjusting Salary Cap Space by Team
        			
        			double t1space = 0;
        			double t2space = 0;
        			double t3space = 0;
        			double t4space = 0;
        		
// Adjusting Luxury Tax Space by Team
        			
        			double t1lspace = 0;
        			double t2lspace = 0;
        			double t3lspace = 0;
        			double t4lspace = 0;

        			if (t1id.equals("ATL")) {
        				t1space = 14170164;
        				t1lspace = 44215721;
        			} else if (t1id.equals("BOS")) {
        				t1space = -11761690;
        				t1lspace = 10102310;
        			} else if (t1id.equals("BKN")) {
        				t1space = -2362584;
        				t1lspace = 19501416;
        			} else if (t1id.equals("CHA")) {
        				t1space = -13047758;
        				t1lspace = 8816242;
        			} else if (t1id.equals("CHI")) {
        				t1space = -13863223;
        				t1lspace = 62198657;
        			} else if (t1id.equals("CLE")) {
        				t1space = -2218158;
        				t1lspace = 17445842;
        			} else if (t1id.equals("DAL")) {
        				t1space = -2176364;
        				t1lspace = 33927133;
        			} else if (t1id.equals("DEN")) {
        				t1space = -28726101;
        				t1lspace = -6862101;
        			} else if (t1id.equals("DET")) {
        				t1space = -21593446;
        				t1lspace = 270554;
        			} else if (t1id.equals("GSW")) {
        				t1space = -38748646;
        				t1lspace = -16884646;
        			} else if (t1id.equals("HOU")) {
        				t1space = -17444148;
        				t1lspace = 4419852;
        			} else if (t1id.equals("IND")) {
        				t1space = 8972160;
        				t1lspace = 33981631;
        			} else if (t1id.equals("LAC")) {
        				t1space = -1874039;
        				t1lspace = 19989961;
        			} else if (t1id.equals("LAL")) {
        				t1space = 1382138;
        				t1lspace = 23246138;
        			} else if (t1id.equals("MEM")) {
        				t1space = -10637895;
        				t1lspace = 11226105;
        			} else if (t1id.equals("MIA")) {
        				t1space = -20033504;
        				t1lspace = 1830496;
        			} else if (t1id.equals("MIL")) {
        				t1space = -8283621;
        				t1lspace = 13580379;
        			} else if (t1id.equals("MIN")) {
        				t1space = -19026917;
        				t1lspace = 2837083;
        			} else if (t1id.equals("NOP")) {
        				t1space = -9782674;
        				t1lspace = 12081326;
        			} else if (t1id.equals("NYK")) {
        				t1space = -3511065;
        				t1lspace = 18352935;
        			} else if (t1id.equals("OKC")) {
        				t1space = -55481809;
        				t1lspace = -33617809;
        			} else if (t1id.equals("ORL")) {
        				t1space = -2683179;
        				t1lspace = 19180821;
        			} else if (t1id.equals("PHI")) {
        				t1space = -11927058;
        				t1lspace = 24825942;
        			} else if (t1id.equals("PHX")) {
        				t1space = -5440204;
        				t1lspace = 28041956;
        			} else if (t1id.equals("POR")) {
        				t1space = -17775048;
        				t1lspace = 4088952;
        			} else if (t1id.equals("SAC")) {
        				t1space = -7443391;
        				t1lspace = 40015284;
        			} else if (t1id.equals("SAS")) {
        				t1space = -4064577;
        				t1lspace = 17632714;
        			} else if (t1id.equals("TOR")) {
        				t1space = -34545032;
        				t1lspace = -12847741;
        			} else if (t1id.equals("UTH")) {
        				t1space = -10288930;
        				t1lspace = 11498878;
        			} else if (t1id.equals("WAS")) {
        				t1space = -26120702;
        				t1lspace = -4256702;
        			}
        			if (t2id.equals("ATL")) {
        				t2space = 14170164;
        				t2lspace = 44215721;
        			} else if (t2id.equals("BOS")) {
        				t2space = -11761690;
        				t2lspace = 10102310;
        			} else if (t2id.equals("BKN")) {
        				t2space = -2362584;
        				t2lspace = 19501416;
        			} else if (t2id.equals("CHA")) {
        				t2space = -13047758;
        				t2lspace = 8816242;
        			} else if (t2id.equals("CHI")) {
        				t2space = -13863223;
        				t2lspace = 62198657;
        			} else if (t2id.equals("CLE")) {
        				t2space = -2218158;
        				t2lspace = 17445842;
        			} else if (t2id.equals("DAL")) {
        				t2space = -2176364;
        				t2lspace = 33927133;
        			} else if (t2id.equals("DEN")) {
        				t2space = -28726101;
        				t2lspace = -6862101;
        			} else if (t2id.equals("DET")) {
        				t2space = -21593446;
        				t2lspace = 270554;
        			} else if (t2id.equals("GSW")) {
        				t2space = -38748646;
        				t2lspace = -16884646;
        			} else if (t2id.equals("HOU")) {
        				t2space = -17444148;
        				t2lspace = 4419852;
        			} else if (t2id.equals("IND")) {
        				t2space = 8972160;
        				t2lspace = 33981631;
        			} else if (t2id.equals("LAC")) {
        				t2space = -1874039;
        				t2lspace = 19989961;
        			} else if (t2id.equals("LAL")) {
        				t2space = 1382138;
        				t2lspace = 23246138;
        			} else if (t2id.equals("MEM")) {
        				t2space = -10637895;
        				t2lspace = 11226105;
        			} else if (t2id.equals("MIA")) {
        				t2space = -20033504;
        				t2lspace = 1830496;
        			} else if (t2id.equals("MIL")) {
        				t2space = -8283621;
        				t2lspace = 13580379;
        			} else if (t2id.equals("MIN")) {
        				t2space = -19026917;
        				t2lspace = 2837083;
        			} else if (t2id.equals("NOP")) {
        				t2space = -9782674;
        				t2lspace = 12081326;
        			} else if (t2id.equals("NYK")) {
        				t2space = -3511065;
        				t2lspace = 18352935;
        			} else if (t2id.equals("OKC")) {
        				t2space = -55481809;
        				t2lspace = -33617809;
        			} else if (t2id.equals("ORL")) {
        				t2space = -2683179;
        				t2lspace = 19180821;
        			} else if (t2id.equals("PHI")) {
        				t2space = -11927058;
        				t2lspace = 24825942;
        			} else if (t2id.equals("PHX")) {
        				t2space = -5440204;
        				t2lspace = 28041956;
        			} else if (t2id.equals("POR")) {
        				t2space = -17775048;
        				t2lspace = 4088952;
        			} else if (t2id.equals("SAC")) {
        				t2space = -7443391;
        				t2lspace = 40015284;
        			} else if (t2id.equals("SAS")) {
        				t2space = -4064577;
        				t2lspace = 17632714;
        			} else if (t2id.equals("TOR")) {
        				t2space = -34545032;
        				t2lspace = -12847741;
        			} else if (t2id.equals("UTH")) {
        				t2space = -10288930;
        				t2lspace = 11498878;
        			} else if (t2id.equals("WAS")) {
        				t2space = -26120702;
        				t2lspace = -4256702;
        			}
        			if (t3id.equals("ATL")) {
        				t3space = 14170164;
        				t3lspace = 44215721;
        			} else if (t3id.equals("BOS")) {
        				t3space = -11761690;
        				t3lspace = 10102310;
        			} else if (t3id.equals("BKN")) {
        				t3space = -2362584;
        				t3lspace = 19501416;
        			} else if (t3id.equals("CHA")) {
        				t3space = -13047758;
        				t3lspace = 8816242;
        			} else if (t3id.equals("CHI")) {
        				t3space = -13863223;
        				t3lspace = 62198657;
        			} else if (t3id.equals("CLE")) {
        				t3space = -2218158;
        				t3lspace = 17445842;
        			} else if (t3id.equals("DAL")) {
        				t3space = -2176364;
        				t3lspace = 33927133;
        			} else if (t3id.equals("DEN")) {
        				t3space = -28726101;
        				t3lspace = -6862101;
        			} else if (t3id.equals("DET")) {
        				t3space = -21593446;
        				t3lspace = 270554;
        			} else if (t3id.equals("GSW")) {
        				t3space = -38748646;
        				t3lspace = -16884646;
        			} else if (t3id.equals("HOU")) {
        				t3space = -17444148;
        				t3lspace = 4419852;
        			} else if (t3id.equals("IND")) {
        				t3space = 8972160;
        				t3lspace = 33981631;
        			} else if (t3id.equals("LAC")) {
        				t3space = -1874039;
        				t3lspace = 19989961;
        			} else if (t3id.equals("LAL")) {
        				t3space = 1382138;
        				t3lspace = 23246138;
        			} else if (t3id.equals("MEM")) {
        				t3space = -10637895;
        				t3lspace = 11226105;
        			} else if (t3id.equals("MIA")) {
        				t3space = -20033504;
        				t3lspace = 1830496;
        			} else if (t3id.equals("MIL")) {
        				t3space = -8283621;
        				t3lspace = 13580379;
        			} else if (t3id.equals("MIN")) {
        				t3space = -19026917;
        				t3lspace = 2837083;
        			} else if (t3id.equals("NOP")) {
        				t3space = -9782674;
        				t3lspace = 12081326;
        			} else if (t3id.equals("NYK")) {
        				t3space = -3511065;
        				t3lspace = 18352935;
        			} else if (t3id.equals("OKC")) {
        				t3space = -55481809;
        				t3lspace = -33617809;
        			} else if (t3id.equals("ORL")) {
        				t3space = -2683179;
        				t3lspace = 19180821;
        			} else if (t3id.equals("PHI")) {
        				t3space = -11927058;
        				t3lspace = 24825942;
        			} else if (t3id.equals("PHX")) {
        				t3space = -5440204;
        				t3lspace = 28041956;
        			} else if (t3id.equals("POR")) {
        				t3space = -17775048;
        				t3lspace = 4088952;
        			} else if (t3id.equals("SAC")) {
        				t3space = -7443391;
        				t3lspace = 40015284;
        			} else if (t3id.equals("SAS")) {
        				t3space = -4064577;
        				t3lspace = 17632714;
        			} else if (t3id.equals("TOR")) {
        				t3space = -34545032;
        				t3lspace = -12847741;
        			} else if (t3id.equals("UTH")) {
        				t3space = -10288930;
        				t3lspace = 11498878;
        			} else if (t3id.equals("WAS")) {
        				t3space = -26120702;
        				t3lspace = -4256702;
        			}
        			if (t4id.equals("ATL")) {
        				t4space = 14170164;
        				t4lspace = 44215721;
        			} else if (t4id.equals("BOS")) {
        				t4space = -11761690;
        				t4lspace = 10102310;
        			} else if (t4id.equals("BKN")) {
        				t4space = -2362584;
        				t4lspace = 19501416;
        			} else if (t4id.equals("CHA")) {
        				t4space = -13047758;
        				t4lspace = 8816242;
        			} else if (t4id.equals("CHI")) {
        				t4space = -13863223;
        				t4lspace = 62198657;
        			} else if (t4id.equals("CLE")) {
        				t4space = -2218158;
        				t4lspace = 17445842;
        			} else if (t4id.equals("DAL")) {
        				t4space = -2176364;
        				t4lspace = 33927133;
        			} else if (t4id.equals("DEN")) {
        				t4space = -28726101;
        				t4lspace = -6862101;
        			} else if (t4id.equals("DET")) {
        				t4space = -21593446;
        				t4lspace = 270554;
        			} else if (t4id.equals("GSW")) {
        				t4space = -38748646;
        				t4lspace = -16884646;
        			} else if (t4id.equals("HOU")) {
        				t4space = -17444148;
        				t4lspace = 4419852;
        			} else if (t4id.equals("IND")) {
        				t4space = 8972160;
        				t4lspace = 33981631;
        			} else if (t4id.equals("LAC")) {
        				t4space = -1874039;
        				t4lspace = 19989961;
        			} else if (t4id.equals("LAL")) {
        				t4space = 1382138;
        				t4lspace = 23246138;
        			} else if (t4id.equals("MEM")) {
        				t4space = -10637895;
        				t4lspace = 11226105;
        			} else if (t4id.equals("MIA")) {
        				t4space = -20033504;
        				t4lspace = 1830496;
        			} else if (t4id.equals("MIL")) {
        				t4space = -8283621;
        				t4lspace = 13580379;
        			} else if (t4id.equals("MIN")) {
        				t4space = -19026917;
        				t4lspace = 2837083;
        			} else if (t4id.equals("NOP")) {
        				t4space = -9782674;
        				t4lspace = 12081326;
        			} else if (t4id.equals("NYK")) {
        				t4space = -3511065;
        				t4lspace = 18352935;
        			} else if (t4id.equals("OKC")) {
        				t4space = -55481809;
        				t4lspace = -33617809;
        			} else if (t4id.equals("ORL")) {
        				t4space = -2683179;
        				t4lspace = 19180821;
        			} else if (t4id.equals("PHI")) {
        				t4space = -11927058;
        				t4lspace = 24825942;
        			} else if (t4id.equals("PHX")) {
        				t4space = -5440204;
        				t4lspace = 28041956;
        			} else if (t4id.equals("POR")) {
        				t4space = -17775048;
        				t4lspace = 4088952;
        			} else if (t4id.equals("SAC")) {
        				t4space = -7443391;
        				t4lspace = 40015284;
        			} else if (t4id.equals("SAS")) {
        				t4space = -4064577;
        				t4lspace = 17632714;
        			} else if (t4id.equals("TOR")) {
        				t4space = -34545032;
        				t4lspace = -12847741;
        			} else if (t4id.equals("UTH")) {
        				t4space = -10288930;
        				t4lspace = 11498878;
        			} else if (t4id.equals("WAS")) {
        				t4space = -26120702;
        				t4lspace = -4256702;
        			}
        			
// Determining Practical Space        			
        			
        			double t1pspace = t1lspace - 21864000;
        			double t2pspace = t2lspace - 21864000;
        			double t3pspace = t3lspace - 21864000;
        			double t4pspace = t4lspace - 21864000;
        			
// Determining Asset Value Leaving Each Team
      			
        			double vf1 = vt1a1 + vt1a2 + vt1a3 + vt1a4 + vt1a5 + vt1a6;  
        			double vf2 = vt2a1 + vt2a2 + vt2a3 + vt2a4 + vt2a5 + vt2a6;  
        			double vf3 = vt3a3 + vt3a2 + vt3a3 + vt3a4 + vt3a5 + vt3a6;  
        			double vf4 = vt4a1 + vt4a2 + vt4a3 + vt4a4 + vt4a5 + vt4a6; 
        			
// Initializing Asset Value Going to Each Team
        			
        			double vt1=0;
        			double vt2=0;
        			double vt3=0;
        			double vt4=0;
        			
// Determining Salary Leaving Each Team        			
        			
        			double sf1 = ct1a1 + ct1a2 + ct1a3 + ct1a4 + ct1a5 + ct1a6;
        			double sf2 = ct2a1 + ct2a2 + ct2a3 + ct2a4 + ct2a5 + ct2a6;
        			double sf3 = ct3a1 + ct3a2 + ct3a3 + ct3a4 + ct3a5 + ct3a6;
        			double sf4 = ct4a1 + ct4a2 + ct4a3 + ct4a4 + ct4a5 + ct4a6;
        			
// Initializing Salary Going to Each Team
        			
        			double st1=0;
        			double st2=0;
        			double st3=0;
        			double st4=0;
        			      			
// Updating Asset Value and Salary to Each Team
        			
        			if (t2d1.equals(t1id)) {
        				vt1 = vt1 + vt2a1;
        				st1 = st1 + ct2a1;
        			} if (t2d2.equals(t1id)) {
        				vt1 = vt1 + vt2a2;
        				st1 = st1 + ct2a2;
        			} if (t2d3.equals(t1id)) {
        				vt1 = vt1 + vt2a3;
        				st1 = st1 + ct2a3;
        			} if (t2d4.equals(t1id)) {
        				vt1 = vt1 + vt2a4;
        				st1 = st1 + ct2a4;
        			} if (t2d5.equals(t1id)) {
        				vt1 = vt1 + vt2a5;
        				st1 = st1 + ct2a5;
        			} if (t2d6.equals(t1id)) {
        				vt1 = vt1 + vt2a6;
        				st1 = st1 + ct2a6;
        			} if (t3d1.equals(t1id)) {
        				vt1 = vt1 + vt3a1;
        				st1 = st1 + ct3a1;
        			} if (t3d2.equals(t1id)) {
        				vt1 = vt1 + vt3a2;
        				st1 = st1 + ct3a2;
        			} if (t3d3.equals(t1id)) {
        				vt1 = vt1 + vt3a3;
        				st1 = st1 + ct3a3;
        			} if (t3d4.equals(t1id)) {
        				vt1 = vt1 + vt3a4;
        				st1 = st1 + ct3a4;
        			} if (t3d5.equals(t1id)) {
        				vt1 = vt1 + vt3a5;
        				st1 = st1 + ct3a5;
        			} if (t3d6.equals(t1id)) {
        				vt1 = vt1 + vt3a6;
        				st1 = st1 + ct3a6;
        			} if (t4d1.equals(t1id)) {
        				vt1 = vt1 + vt4a1;
        				st1 = st1 + ct4a1;
        			} if (t4d2.equals(t1id)) {
        				vt1 = vt1 + vt4a2;
        				st1 = st1 + ct4a2;
        			} if (t4d3.equals(t1id)) {
        				vt1 = vt1 + vt4a3;
        				st1 = st1 + ct4a3;
        			} if (t4d4.equals(t1id)) {
        				vt1 = vt1 + vt4a4;
        				st1 = st1 + ct4a4;
        			} if (t4d5.equals(t1id)) {
        				vt1 = vt1 + vt4a5;
        				st1 = st1 + ct4a5;
        			} if (t4d6.equals(t1id)) {
        				vt1 = vt1 + vt4a6;
        				st1 = st1 + ct4a6;
        			}
        			if (t1d1.equals(t2id)) {
        				vt2 = vt2 + vt1a1;
        				st2 = st2 + ct1a1;
        			} if (t1d2.equals(t2id)) {
        				vt2 = vt2 + vt1a2;
        				st2 = st2 + ct1a2;
        			} if (t1d3.equals(t2id)) {
        				vt2 = vt2 + vt1a3;
        				st2 = st2 + ct1a3;
        			} if (t1d4.equals(t2id)) {
        				vt2 = vt2 + vt1a4;
        				st2 = st2 + ct1a4;
        			} if (t1d5.equals(t2id)) {
        				vt2 = vt2 + vt1a5;
        				st2 = st2 + ct1a5;
        			} if (t1d6.equals(t2id)) {
        				vt2 = vt2 + vt1a6;
        				st2 = st2 + ct1a6;
        			} if (t3d1.equals(t2id)) {
        				vt2 = vt2 + vt3a1;
        				st2 = st2 + ct3a1;
        			} if (t3d2.equals(t2id)) {
        				vt2 = vt2 + vt3a2;
        				st2 = st2 + ct3a2;
        			} if (t3d3.equals(t2id)) {
        				vt2 = vt2 + vt3a3;
        				st2 = st2 + ct3a3;
        			} if (t3d4.equals(t2id)) {
        				vt2 = vt2 + vt3a4;
        				st2 = st2 + ct3a4;
        			} if (t3d5.equals(t2id)) {
        				vt2 = vt2 + vt3a5;
        				st2 = st2 + ct3a5;
        			} if (t3d6.equals(t2id)) {
        				vt2 = vt2 + vt3a6;
        				st2 = st2 + ct3a6;
        			} if (t4d1.equals(t2id)) {
        				vt2 = vt2 + vt4a1;
        				st2 = st2 + ct4a1;
        			} if (t4d2.equals(t2id)) {
        				vt2 = vt2 + vt4a2;
        				st2 = st2 + ct4a2;
        			} if (t4d3.equals(t2id)) {
        				vt2 = vt2 + vt4a3;
        				st2 = st2 + ct4a3;
        			} if (t4d4.equals(t2id)) {
        				vt2 = vt2 + vt4a4;
        				st2 = st2 + ct4a4;
        			} if (t4d5.equals(t2id)) {
        				vt2 = vt2 + vt4a5;
        				st2 = st2 + ct4a5;
        			} if (t4d6.equals(t2id)) {
        				vt2 = vt2 + vt4a6;
        				st2 = st2 + ct4a6;
        			}
        			if (t2d1.equals(t3id)) {
        				vt3 = vt3 + vt2a1;
        				st3 = st3 + ct2a1;
        			} if (t2d2.equals(t3id)) {
        				vt3 = vt3 + vt2a2;
        				st3 = st3 + ct2a2;
        			} if (t2d3.equals(t3id)) {
        				vt3 = vt3 + vt2a3;
        				st3 = st3 + ct2a3;
        			} if (t2d4.equals(t3id)) {
        				vt3 = vt3 + vt2a4;
        				st3 = st3 + ct2a4;
        			} if (t2d5.equals(t3id)) {
        				vt3 = vt3 + vt2a5;
        				st3 = st3 + ct2a5;
        			} if (t2d6.equals(t3id)) {
        				vt3 = vt3 + vt2a6;
        				st3 = st3 + ct2a6;
        			} if (t1d1.equals(t3id)) {
        				vt3 = vt3 + vt1a1;
        				st3 = st3 + ct1a1;
        			} if (t1d2.equals(t3id)) {
        				vt3 = vt3 + vt1a2;
        				st3 = st3 + ct1a2;
        			} if (t1d3.equals(t3id)) {
        				vt3 = vt3 + vt1a3;
        				st3 = st3 + ct1a3;
        			} if (t1d4.equals(t3id)) {
        				vt3 = vt3 + vt1a4;
        				st3 = st3 + ct1a4;
        			} if (t1d5.equals(t3id)) {
        				vt3 = vt3 + vt1a5;
        				st3 = st3 + ct1a5;
        			} if (t1d6.equals(t3id)) {
        				vt3 = vt3 + vt1a6;
        				st3 = st3 + ct1a6;
        			} if (t4d1.equals(t3id)) {
        				vt3 = vt3 + vt4a1;
        				st3 = st3 + ct4a1;
        			} if (t4d2.equals(t3id)) {
        				vt3 = vt3 + vt4a2;
        				st3 = st3 + ct4a2;
        			} if (t4d3.equals(t3id)) {
        				vt3 = vt3 + vt4a3;
        				st3 = st3 + ct4a3;
        			} if (t4d4.equals(t3id)) {
        				vt3 = vt3 + vt4a4;
        				st3 = st3 + ct4a4;
        			} if (t4d5.equals(t3id)) {
        				vt3 = vt3 + vt4a5;
        				st3 = st3 + ct4a5;
        			} if (t4d6.equals(t3id)) {
        				vt3 = vt3 + vt4a6;
        				st3 = st3 + ct4a6;
        			}
        			if (t2d1.equals(t4id)) {
        				vt4 = vt4 + vt2a1;
        				st4 = st4 + ct2a1;
        			} if (t2d2.equals(t4id)) {
        				vt4 = vt4 + vt2a2;
        				st4 = st4 + ct2a2;
        			} if (t2d3.equals(t4id)) {
        				vt4 = vt4 + vt2a3;
        				st4 = st4 + ct2a3;
        			} if (t2d4.equals(t4id)) {
        				vt4 = vt4 + vt2a4;
        				st4 = st4 + ct2a4;
        			} if (t2d5.equals(t4id)) {
        				vt4 = vt4 + vt2a5;
        				st4 = st4 + ct2a5;
        			} if (t2d6.equals(t4id)) {
        				vt4 = vt4 + vt2a6;
        				st4 = st4 + ct2a6;
        			} if (t3d1.equals(t4id)) {
        				vt4 = vt4 + vt3a1;
        				st4 = st4 + ct3a1;
        			} if (t3d2.equals(t4id)) {
        				vt4 = vt4 + vt3a2;
        				st4 = st4 + ct3a2;
        			} if (t3d3.equals(t4id)) {
        				vt4 = vt4 + vt3a3;
        				st4 = st4 + ct3a3;
        			} if (t3d4.equals(t4id)) {
        				vt4 = vt4 + vt3a4;
        				st4 = st4 + ct3a4;
        			} if (t3d5.equals(t4id)) {
        				vt4 = vt4 + vt3a5;
        				st4 = st4 + ct3a5;
        			} if (t3d6.equals(t4id)) {
        				vt4 = vt4 + vt3a6;
        				st4 = st4 + ct3a6;
        			} if (t1d1.equals(t4id)) {
        				vt4 = vt4 + vt1a1;
        				st4 = st4 + ct1a1;
        			} if (t1d2.equals(t4id)) {
        				vt4 = vt4 + vt1a2;
        				st4 = st4 + ct1a2;
        			} if (t1d3.equals(t4id)) {
        				vt4 = vt4 + vt1a3;
        				st4 = st4 + ct1a3;
        			} if (t1d4.equals(t4id)) {
        				vt4 = vt4 + vt1a4;
        				st4 = st4 + ct1a4;
        			} if (t1d5.equals(t4id)) {
        				vt4 = vt4 + vt1a5;
        				st4 = st4 + ct1a5;
        			} if (t1d6.equals(t4id)) {
        				vt4 = vt4 + vt1a6;
        				st4 = st4 + ct1a6;
        			}
        	
// Determining which trade restriction should be used        			

        			double operator1 = 0;
        			double operator2 = 0;
        			double operator3 = 0;
        			double operator4 = 0;
        			
        			double asc1=0;
        			double t1n1=((1.75*sf1)+100000);
        			double t1n2=(sf1+5000000);
        			double t1n3=((1.25*sf1)+100000);
        			if (sf1<=6533333) {
        				asc1 = t1n1;
        			} else if (sf1>=6533334 && sf1<=19600000) {
        				asc1 = t1n2;
        			} else if (sf1>=19600001) {
        				asc1 = t1n3;
        			}
        			double atl1=((1.25*sf1)+100000);
        			double bsc1=t1space+sf1+100000;
        			if ((t1space + sf1 - st1) >= -100000) {
        				operator1=bsc1;
        			} else if ((t1space + sf1 - st1) < -100000 && t1lspace + sf1 - st1 > 0) {
        				operator1=asc1;
        			} else {
        				operator1=atl1;
        			}
        			if (t1id.equals("0")) {
        				operator1 = 0;
        			}
        	
        			double asc2=0;
        			double t2n1=((1.75*sf2)+100000);
        			double t2n2=(sf2+5000000);
        			double t2n3=((1.25*sf2)+100000);
        			if (sf2<=6533333) {
        				asc2 = t2n1;
        			} else if (sf2>=6533334 && sf2<=19600000) {
        				asc2 = t2n2;
        			} else if (sf2>=19600001) {
        				asc2 = t2n3;
        			}
        			double atl2=((1.25*sf2)+100000);
        			double bsc2=t2space+sf2+100000;	
        			if ((t2space + sf2 - st2) >= -100000) {
        				operator2=bsc2;
        			} else if ((t2space + sf2 - st2) < -100000 && t2lspace + sf2 - st2 > 0) {
        				operator2=asc2;
        			} else {
        				operator2=atl2;
        			}
        			if (t2id.equals("0")) {
        				operator2 = 0;
        			}
        			
        			double asc3=0;
        			double t3n1=((1.75*sf3)+100000);
        			double t3n2=(sf3+5000000);
        			double t3n3=((1.25*sf3)+100000);
        			if (sf3<=6533333) {
        				asc3 = t3n1;
        			} else if (sf3>=6533334 && sf3<=19600000) {
        				asc3 = t3n2;
        			} else if (sf3>=19600001) {
        				asc3 = t3n3;
        			}
        			double atl3=((1.25*sf3)+100000);
        			double bsc3=t3space+sf3+100000;
        			if ((t3space + sf3 - st3) >= -100000) {
        				operator3=bsc3;
        			} else if ((t3space + sf3 - st3) < -100000 && t3lspace + sf3 - st3 > 0) {
        				operator3=asc3;
        			} else {
        				operator3=atl3;
        			}
        			if (t3id.equals("0")) {
        				operator3 = 0;
        			}
        			
        			double asc4=0;
        			double t4n1=((1.75*sf4)+100000);
        			double t4n2=(sf4+5000000);
        			double t4n3=((1.25*sf4)+100000);
        			if (sf4<=6533333) {
        				asc4 = t4n1;
        			} else if (sf4>=6533334 && sf4<=19600000) {
        				asc4 = t4n2;
        			} else if (sf4>=19600001) {
        				asc4 = t4n3;
        			}
        			double atl4=((1.25*sf4)+100000);
        			double bsc4=t4space+sf4+100000;
        			if ((t4space + sf4 - st4) >= -100000) {
        				operator4=bsc4;
        			} else if ((t4space + sf4 - st4) < -100000 && t4lspace + sf4 - st4 > 0) {
        				operator4=asc4;
        			} else {
        				operator4=atl4;
        			}
        			if (t4id.equals("0")) {
        				operator4 = 0;
        			}
        		
// Determining number of teams in the trade
        			
        			double num = 0;
        			
        			if (!t1id.equals("0")) {
        				num++;
        			} if (!t2id.equals("0")) {
        				num++;
        			} if (!t3id.equals("0")) {
        				num++;
        			} if (!t4id.equals("0")) {
        				num++;
        			}
        			
// Determining probability of trade based on finances and player/asset value        			

        			double prob;	
        			
        			double vd1 = vt1-vf1;
        			double vd2 = vt2-vf2;
        			double vd3 = vt3-vf3;
        			double vd4 = vt4-vf4;
        			
        			double sd1 = st1-sf1;
        			double sd2 = st2-sf2;
        			double sd3 = st3-sf3;
        			double sd4 = st4-sf4;
        			
        			double v = Math.abs(vd1)+Math.abs(vd2)+Math.abs(vd3)+Math.abs(vd4);
        			double vdiv = v/num;
        			
        			double s = Math.abs(sd1)+Math.abs(sd2)+Math.abs(sd3)+Math.abs(sd4);
        			double sdiv = s/num;
        			
        			double f = prob=100-(vdiv*10)-(sdiv/500000);
        			
        			
        			if (st1 > operator1 | st2 > operator2 | st3 > operator3 | st4 > operator4) {
        				prob = 0;
        			} else if (f >= 0) {
        				prob = f;
        			} else {
        				prob = 0;
        			}
        		
// Possible Outputs        			
        			
        			String sprob = "There is a "+ String.valueOf(prob)+"% Chance that this trade will work";
        			String nulldest = "An asset does not have a destination";
        			String samedest = "An asset is being traded to the same team";
        			String nullset = "No assets are entered";
        			String nullasset = "There is a destination with no asset going to it";
        			String wrongteam = "An asset is being traded from the wrong team";
        			String invaldest = "An asset is being traded to a team that is not in the trade";
        			
        			String output = sprob;

// Checking if every asset is going to a destination    			
        			
        			if (!tt1a1.equals("0") && t1d1.equals("None")) {
        				output = nulldest;
        			} else if (!tt1a2.equals("0") && t1d2.equals("None")) {
        				output = nulldest;
        			} else if (!tt1a3.equals("0") && t1d3.equals("None")) {
        				output = nulldest;
        			} else if (!tt1a4.equals("0") && t1d4.equals("None")) {
        				output = nulldest;
        			} else if (!tt1a5.equals("0") && t1d5.equals("None")) {
        				output = nulldest;
        			} else if (!tt1a6.equals("0") && t1d6.equals("None")) {
        				output = nulldest;
        			}
        			if (!tt2a1.equals("0") && t2d1.equals("None")) {
        				output = nulldest;
        			} else if (!tt2a2.equals("0") && t2d2.equals("None")) {
        				output = nulldest;
        			} else if (!tt2a3.equals("0") && t2d3.equals("None")) {
        				output = nulldest;
        			} else if (!tt2a4.equals("0") && t2d4.equals("None")) {
        				output = nulldest;
        			} else if (!tt2a5.equals("0") && t2d5.equals("None")) {
        				output = nulldest;
        			} else if (!tt2a6.equals("0") && t2d6.equals("None")) {
        				output = nulldest;
        			}
        			if (!tt3a1.equals("0") && t3d1.equals("None")) {
        				output = nulldest;
        			} else if (!tt3a2.equals("0") && t3d2.equals("None")) {
        				output = nulldest;
        			} else if (!tt3a3.equals("0") && t3d3.equals("None")) {
        				output = nulldest;
        			} else if (!tt3a4.equals("0") && t3d4.equals("None")) {
        				output = nulldest;
        			} else if (!tt3a5.equals("0") && t3d5.equals("None")) {
        				output = nulldest;
        			} else if (!tt3a6.equals("0") && t3d6.equals("None")) {
        				output = nulldest;
        			}
        			if (!tt4a1.equals("0") && t4d1.equals("None")) {
        				output = nulldest;
        			} else if (!tt4a2.equals("0") && t4d2.equals("None")) {
        				output = nulldest;
        			} else if (!tt4a3.equals("0") && t4d3.equals("None")) {
        				output = nulldest;
        			} else if (!tt4a4.equals("0") && t4d4.equals("None")) {
        				output = nulldest;
        			} else if (!tt4a5.equals("0") && t4d5.equals("None")) {
        				output = nulldest;
        			} else if (!tt4a6.equals("0") && t4d6.equals("None")) {
        				output = nulldest;
        			}
        			
// Checking if any assets are being traded to their original team        			
        			
        			if (tt1a1.equals(t1d1)) {
        				output = samedest;
        			} else if (tt1a2.equals(t1d2)) {
        				output = samedest;
        			} else if (tt1a3.equals(t1d3)) {
        				output = samedest;
        			} else if (tt1a4.equals(t1d4)) {
        				output = samedest;
        			} else if (tt1a5.equals(t1d5)) {
        				output = samedest;
        			} else if (tt1a6.equals(t1d6)) {
        				output = samedest;
        			}
        			if (tt2a1.equals(t2d1)) {
        				output = samedest;
        			} else if (tt2a2.equals(t2d2)) {
        				output = samedest;
        			} else if (tt2a3.equals(t2d3)) {
        				output = samedest;
        			} else if (tt2a4.equals(t2d4)) {
        				output = samedest;
        			} else if (tt2a5.equals(t2d5)) {
        				output = samedest;
        			} else if (tt2a6.equals(t2d6)) {
        				output = samedest;
        			}
        			if (tt3a1.equals(t3d1)) {
        				output = samedest;
        			} else if (tt3a2.equals(t3d2)) {
        				output = samedest;
        			} else if (tt3a3.equals(t3d3)) {
        				output = samedest;
        			} else if (tt3a4.equals(t3d4)) {
        				output = samedest;
        			} else if (tt3a5.equals(t3d5)) {
        				output = samedest;
        			} else if (tt3a6.equals(t3d6)) {
        				output = samedest;
        			}
        			if (tt4a1.equals(t4d1)) {
        				output = samedest;
        			} else if (tt4a2.equals(t4d2)) {
        				output = samedest;
        			} else if (tt4a3.equals(t4d3)) {
        				output = samedest;
        			} else if (tt4a4.equals(t4d4)) {
        				output = samedest;
        			} else if (tt4a5.equals(t4d5)) {
        				output = samedest;
        			} else if (tt4a6.equals(t4d6)) {
        				output = samedest;
        			}
        			
// Checking if anything has been entered        			
        			
        			if (t1id.equals("0") && t2id.equals("0") && t3id.equals("0") && t3id.equals("0")) {
                		output = nullset;
                }
        			
// Checking if each Destination has an asset going to it        			
        			
        			if (tt1a1.equals("0") && !t1d1.equals("None")) {
        				output = nullasset;
        			} else if (tt1a2.equals("0") && !t1d2.equals("None")) {
        				output = nullasset;
        			} else if (tt1a3.equals("0") && !t1d3.equals("None")) {
        				output = nullasset;
        			} else if (tt1a4.equals("0") && !t1d4.equals("None")) {
        				output = nullasset;
        			} else if (tt1a5.equals("0") && !t1d5.equals("None")) {
        				output = nullasset;
        			} else if (tt1a6.equals("0") && !t1d6.equals("None")) {
        				output = nullasset;
        			}
        			if (tt2a1.equals("0") && !t2d1.equals("None")) {
        				output = nullasset;
        			} else if (tt2a2.equals("0") && !t2d2.equals("None")) {
        				output = nullasset;
        			} else if (tt2a3.equals("0") && !t2d3.equals("None")) {
        				output = nullasset;
        			} else if (tt2a4.equals("0") && !t2d4.equals("None")) {
        				output = nullasset;
        			} else if (tt2a5.equals("0") && !t2d5.equals("None")) {
        				output = nullasset;
        			} else if (tt2a6.equals("0") && !t2d6.equals("None")) {
        				output = nullasset;
        			}
        			if (tt3a1.equals("0") && !t3d1.equals("None")) {
        				output = nullasset;
        			} else if (tt3a2.equals("0") && !t3d2.equals("None")) {
        				output = nullasset;
        			} else if (tt3a3.equals("0") && !t3d3.equals("None")) {
        				output = nullasset;
        			} else if (tt3a4.equals("0") && !t3d4.equals("None")) {
        				output = nullasset;
        			} else if (tt3a5.equals("0") && !t3d5.equals("None")) {
        				output = nullasset;
        			} else if (tt3a6.equals("0") && !t3d6.equals("None")) {
        				output = nullasset;
        			}
        			if (tt4a1.equals("0") && !t4d1.equals("None")) {
        				output = nullasset;
        			} else if (tt4a2.equals("0") && !t4d2.equals("None")) {
        				output = nullasset;
        			} else if (tt4a3.equals("0") && !t4d3.equals("None")) {
        				output = nullasset;
        			} else if (tt4a4.equals("0") && !t4d4.equals("None")) {
        				output = nullasset;
        			} else if (tt4a5.equals("0") && !t4d5.equals("None")) {
        				output = nullasset;
        			} else if (tt4a6.equals("0") && !t4d6.equals("None")) {
        				output = nullasset;
        			}
        			
        			if (!tt1a1.equals(t1id) && !tt1a1.equals("0")) {
        				output = wrongteam;
        			} else if (!tt1a2.equals(t1id) && !tt1a2.equals("0")) {
        				output = wrongteam;
        			} else if (!tt1a3.equals(t1id) && !tt1a3.equals("0")) {
        				output = wrongteam;
        			} else if (!tt1a4.equals(t1id) && !tt1a4.equals("0")) {
        				output = wrongteam;
        			} else if (!tt1a5.equals(t1id) && !tt1a5.equals("0")) {
        				output = wrongteam;
        			} else if (!tt1a6.equals(t1id) && !tt1a6.equals("0")) {
        				output = wrongteam;
        			}
        			if (!tt2a1.equals(t2id) && !tt2a1.equals("0")) {
        				output = wrongteam;
        			} else if (!tt2a2.equals(t2id) && !tt2a2.equals("0")) {
        				output = wrongteam;
        			} else if (!tt2a3.equals(t2id) && !tt2a3.equals("0")) {
        				output = wrongteam;
        			} else if (!tt2a4.equals(t2id) && !tt2a4.equals("0")) {
        				output = wrongteam;
        			} else if (!tt2a5.equals(t2id) && !tt2a5.equals("0")) {
        				output = wrongteam;
        			} else if (!tt2a6.equals(t2id) && !tt2a6.equals("0")) {
        				output = wrongteam;
        			}
        			if (!tt3a1.equals(t3id) && !tt3a1.equals("0")) {
        				output = wrongteam;
        			} else if (!tt3a2.equals(t3id) && !tt3a2.equals("0")) {
        				output = wrongteam;
        			} else if (!tt3a3.equals(t3id) && !tt3a3.equals("0")) {
        				output = wrongteam;
        			} else if (!tt3a4.equals(t3id) && !tt3a4.equals("0")) {
        				output = wrongteam;
        			} else if (!tt3a5.equals(t3id) && !tt3a5.equals("0")) {
        				output = wrongteam;
        			} else if (!tt3a6.equals(t3id) && !tt3a6.equals("0")) {
        				output = wrongteam;
        			}
        			if (!tt4a1.equals(t4id) && !tt4a1.equals("0")) {
        				output = wrongteam;
        			} else if (!tt4a2.equals(t4id) && !tt4a2.equals("0")) {
        				output = wrongteam;
        			} else if (!tt4a3.equals(t4id) && !tt4a3.equals("0")) {
        				output = wrongteam;
        			} else if (!tt4a4.equals(t4id) && !tt4a4.equals("0")) {
        				output = wrongteam;
        			} else if (!tt4a5.equals(t4id) && !tt4a5.equals("0")) {
        				output = wrongteam;
        			} else if (!tt4a6.equals(t4id) && !tt4a6.equals("0")) {
        				output = wrongteam;
        			}
//   Checking if the Destination is Actually a Team Involved in the Trade     			
        			
        			if (!t1d1.equals(t1id) && !t1d1.equals(t2id) && !t1d1.equals(t3id) && !t1d1.equals(t4id) && !t1d1.equals("None")) {
        				output = invaldest;
        			} else if (!t1d2.equals(t1id) && !t1d2.equals(t2id) && !t1d2.equals(t3id) && !t1d2.equals(t4id) && !t1d2.equals("None")) {
        				output = invaldest;
        			} else if (!t1d3.equals(t1id) && !t1d3.equals(t2id) && !t1d3.equals(t3id) && !t1d3.equals(t4id) && !t1d3.equals("None")) {
        				output = invaldest;
        			} else if (!t1d4.equals(t1id) && !t1d4.equals(t2id) && !t1d4.equals(t3id) && !t1d4.equals(t4id) && !t1d4.equals("None")) {
        				output = invaldest;
        			} else if (!t1d5.equals(t1id) && !t1d5.equals(t2id) && !t1d5.equals(t3id) && !t1d5.equals(t4id) && !t1d5.equals("None")) {
        				output = invaldest;
        			} else if (!t1d6.equals(t1id) && !t1d6.equals(t2id) && !t1d6.equals(t3id) && !t1d6.equals(t4id) && !t1d6.equals("None")) {
        				output = invaldest;
        			}
        			if (!t2d1.equals(t1id) && !t2d1.equals(t2id) && !t2d1.equals(t3id) && !t2d1.equals(t4id) && !t2d1.equals("None")) {
        				output = invaldest;
        			} else if (!t2d2.equals(t1id) && !t2d2.equals(t2id) && !t2d2.equals(t3id) && !t2d2.equals(t4id) && !t2d2.equals("None")) {
        				output = invaldest;
        			} else if (!t2d3.equals(t1id) && !t2d3.equals(t2id) && !t2d3.equals(t3id) && !t2d3.equals(t4id) && !t2d3.equals("None")) {
        				output = invaldest;
        			} else if (!t2d4.equals(t1id) && !t2d4.equals(t2id) && !t2d4.equals(t3id) && !t2d4.equals(t4id) && !t2d4.equals("None")) {
        				output = invaldest;
        			} else if (!t2d5.equals(t1id) && !t2d5.equals(t2id) && !t2d5.equals(t3id) && !t2d5.equals(t4id) && !t2d5.equals("None")) {
        				output = invaldest;
        			} else if (!t2d6.equals(t1id) && !t2d6.equals(t2id) && !t2d6.equals(t3id) && !t2d6.equals(t4id) && !t2d6.equals("None")) {
        				output = invaldest;
        			}
        			if (!t3d1.equals(t1id) && !t3d1.equals(t2id) && !t3d1.equals(t3id) && !t3d1.equals(t4id) && !t3d1.equals("None")) {
        				output = invaldest;
        			} else if (!t3d2.equals(t1id) && !t3d2.equals(t2id) && !t3d2.equals(t3id) && !t3d2.equals(t4id) && !t3d2.equals("None")) {
        				output = invaldest;
        			} else if (!t3d3.equals(t1id) && !t3d3.equals(t2id) && !t3d3.equals(t3id) && !t3d3.equals(t4id) && !t3d3.equals("None")) {
        				output = invaldest;
        			} else if (!t3d4.equals(t1id) && !t3d4.equals(t2id) && !t3d4.equals(t3id) && !t3d4.equals(t4id) && !t3d4.equals("None")) {
        				output = invaldest;
        			} else if (!t3d5.equals(t1id) && !t3d5.equals(t2id) && !t3d5.equals(t3id) && !t3d5.equals(t4id) && !t3d5.equals("None")) {
        				output = invaldest;
        			} else if (!t3d6.equals(t1id) && !t3d6.equals(t2id) && !t3d6.equals(t3id) && !t3d6.equals(t4id) && !t3d6.equals("None")) {
        				output = invaldest;
        			}
        			if (!t4d1.equals(t1id) && !t4d1.equals(t2id) && !t4d1.equals(t3id) && !t4d1.equals(t4id) && !t4d1.equals("None")) {
        				output = invaldest;
        			} else if (!t4d2.equals(t1id) && !t4d2.equals(t2id) && !t4d2.equals(t3id) && !t4d2.equals(t4id) && !t4d2.equals("None")) {
        				output = invaldest;
        			} else if (!t4d3.equals(t1id) && !t4d3.equals(t2id) && !t4d3.equals(t3id) && !t4d3.equals(t4id) && !t4d3.equals("None")) {
        				output = invaldest;
        			} else if (!t4d4.equals(t1id) && !t4d4.equals(t2id) && !t4d4.equals(t3id) && !t4d4.equals(t4id) && !t4d4.equals("None")) {
        				output = invaldest;
        			} else if (!t4d5.equals(t1id) && !t4d5.equals(t2id) && !t4d5.equals(t3id) && !t4d5.equals(t4id) && !t4d5.equals("None")) {
        				output = invaldest;
        			} else if (!t4d6.equals(t1id) && !t4d6.equals(t2id) && !t4d6.equals(t3id) && !t4d6.equals(t4id) && !t4d6.equals("None")) {
        				output = invaldest;
        			}
        			
                return output;
    }

}

