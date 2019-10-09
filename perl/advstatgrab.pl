#!/usr/bin/perl

my $url = "https://www.basketball-reference.com/leagues/NBA_2018_advanced.html";
my $file = "nbaadv.csv";
open CSVFILE, ">$file";
print CSVFILE "Player, POS, Age, Team, G, MP, PER, TS%, 3PAr, FTr, ORB%, DRB%, TRB%, AST%, STL%, BLK%, TOV%, USG%, , OWS, DWS, WS, WS48, , OBPM, DBPM, BPM, VORP\n";
my $cmd = "curl $url | grep \"<tr\"";
my @out = `$cmd`;

foreach my $line ( @out ) {
		
		if ($line =~ /class="full_table"/) {
			print CSVFILE "";
		} else {
			next;
		}
		if ($line =~ /data-stat="player" csk=".+" ><a href="\/players\/[a-z]\/.+">([-'A-Za-z\.]+\s[-'A-Za-z\.]+)/) {
			print CSVFILE "$1,";
		}	
		if ($line =~ /data-stat="pos" >([A-Z]+)</) {
			print CSVFILE "$1,";
		}
		if ($line =~ /data-stat="age" >([0-9]+)</) {
			print CSVFILE "$1,";
		}
		if ($line =~ /data-stat="team_id" ><a href="\/teams\/[A-Z]+\/.+">([A-Z]+)/) {
			print CSVFILE "$1,";
		} if ($line =~ /data-stat="team_id" >([A-Z]+)/) {
			print CSVFILE "$1,";
		}	
		if ($line =~ /data-stat="g" >([0-9]+)</) {
			print CSVFILE "$1,";
		}	
		if ($line =~ /data-stat="mp" >([0-9]+)</) {
			print CSVFILE "$1,";
		}
		if ( $line =~ /data-stat="per" >(.[0-9.0-9]+)</) {
			print CSVFILE "$1,";
		}	
		if ( $line =~ /data-stat="ts_pct" >([\.0-9]+)</) {
			print CSVFILE "$1,";
		} if ( $line =~ /data-stat="ts_pct" ></) {
			print CSVFILE "0,";
		}
		if ( $line =~ /data-stat="fg3a_per_fga_pct" >([\.0-9]+)</) {
			print CSVFILE "$1,";
		} if ( $line =~ /data-stat="fg3a_per_fga_pct" ></) {
			print CSVFILE "0,";
		}
		if ( $line =~ /data-stat="fta_per_fga_pct" >([\.0-9]+)</) {
			print CSVFILE "$1,";
		} if ( $line =~ /data-stat="fta_per_fga_pct" ></) {
			print CSVFILE "0,";
		}
		if ( $line =~ /data-stat="orb_pct" >([0-9.0-9]+)</) {
			print CSVFILE "$1,";
		}
		if ( $line =~ /data-stat="drb_pct" >([0-9.0-9]+)</) {
			print CSVFILE "$1,";
		}	
		if ( $line =~ /data-stat="trb_pct" >([0-9.0-9]+)</) {
			print CSVFILE "$1,";
		}
		if ( $line =~ /data-stat="ast_pct" >([0-9.0-9]+)</) {
			print CSVFILE "$1,";
		}
		if ( $line =~ /data-stat="stl_pct" >([0-9.0-9]+)</) {
			print CSVFILE "$1,";
		}
		if ( $line =~ /data-stat="blk_pct" >([0-9.0-9]+)</) {
			print CSVFILE "$1,";
		}
		if ( $line =~ /data-stat="tov_pct" >([0-9.0-9]+)</) {
			print CSVFILE "$1,";
		} if ( $line =~ /data-stat="tov_pct" ></) {
			print CSVFILE "0,";
		}
		if ( $line =~ /data-stat="usg_pct" >([0-9.0-9]+)</) {
			print CSVFILE "$1,";
		}
		if ( $line =~ /data-stat="ws-dum" ></) {
			print CSVFILE "0,";
		}
		if ( $line =~ /data-stat="ows" >(.[0-9.0-9]+)</) {
			print CSVFILE "$1,";
		}
		if ( $line =~ /data-stat="dws" >(.[0-9.0-9]+)</) {
			print CSVFILE "$1,";
		}
		if ( $line =~ /data-stat="ws" >(.[0-9.0-9]+)</) {
			print CSVFILE "$1,";
		}
		if ( $line =~ /data-stat="ws_per_48" >(.[0-9.0-9]+)</) {
			print CSVFILE "$1,";
		}
		if ( $line =~ /data-stat="bpm-dum" ></) {
			print CSVFILE "0,";
		}
		if ( $line =~ /data-stat="obpm" >(.[0-9.0-9]+)</) {
			print CSVFILE "$1,";
		}
		if ( $line =~ /data-stat="dbpm" >(.[0-9.0-9]+)</) {
			print CSVFILE "$1,";
		}
		if ( $line =~ /data-stat="bpm" >(.[0-9.0-9]+)</) {
			print CSVFILE "$1,";
		}
		if ( $line =~ /data-stat="vorp" >(.[0-9.0-9]+)</) {
			print CSVFILE "$1,";
		}
		print CSVFILE "\n";
   } 
 