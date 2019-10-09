#!/usr/bin/perl

my $url = "https://www.basketball-reference.com/leagues/NBA_2018_advanced.html";
my $file = "nbaperg.csv";
open CSVFILE, ">$file";
print CSVFILE "Player, POS, Age, Team, G, GS, MP, FG, FGA, FG%, 3P, 3PA, 3P%, 2P, 2PA, 2P%, eFG%, FT, FTA, FT%, ORB, DRB, TRB, AST, STL, BLK, TOV, PF, PPG\n";
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
		if ($line =~ /data-stat="gs" >([0-9]+)</) {
			print CSVFILE "$1,";
		}
		if ($line =~ /data-stat="mp_per_g" >([0-9]+)</) {
			print CSVFILE "$1,";
		}
		if ($line =~ /data-stat="fg_per_g" >([0-9]+)</) {
			print CSVFILE "$1,";
		}
		if ($line =~ /data-stat="fga_per_g" >([0-9]+)</) {
			print CSVFILE "$1,";
		}	
		if ( $line =~ /data-stat="fg_pct" >([\.0-9]+)</) {
			print CSVFILE "$1,";
		} if ( $line =~ /data-stat="fg_pct" ></) {
			print CSVFILE "0,";
		}
		if ($line =~ /data-stat="fg3_per_g" >([0-9]+)</) {
			print CSVFILE "$1,";
		}
		if ($line =~ /data-stat="fg3a_per_g" >([0-9]+)</) {
			print CSVFILE "$1,";
		}	
		if ( $line =~ /data-stat="fg3_pct" >([\.0-9]+)</) {
			print CSVFILE "$1,";
		} if ( $line =~ /data-stat="fg3_pct" ></) {
			print CSVFILE "0,";
		}
		if ($line =~ /data-stat="fg2_per_g" >([0-9]+)</) {
			print CSVFILE "$1,";
		}
		if ($line =~ /data-stat="fg2a_per_g" >([0-9]+)</) {
			print CSVFILE "$1,";
		}	
		if ( $line =~ /data-stat="fg2_pct" >([\.0-9]+)</) {
			print CSVFILE "$1,";
		} if ( $line =~ /data-stat="fg2_pct" ></) {
			print CSVFILE "0,";
		}
		if ( $line =~ /data-stat="efg_pct" >([\.0-9]+)</) {
			print CSVFILE "$1,";
		} if ( $line =~ /data-stat="efg_pct" ></) {
			print CSVFILE "0,";
		}
		if ($line =~ /data-stat="ft_per_g" >([0-9]+)</) {
			print CSVFILE "$1,";
		}
		if ($line =~ /data-stat="fta_per_g" >([0-9]+)</) {
			print CSVFILE "$1,";
		}	
		if ( $line =~ /data-stat="ft_pct" >([\.0-9]+)</) {
			print CSVFILE "$1,";
		} if ( $line =~ /data-stat="ft_pct" ></) {
			print CSVFILE "0,";
		}
		if ($line =~ /data-stat="orb_per_g" >([0-9]+)</) {
			print CSVFILE "$1,";
		}
		if ($line =~ /data-stat="drb_per_g" >([0-9]+)</) {
			print CSVFILE "$1,";
		}
		if ($line =~ /data-stat="trb_per_g" >([0-9]+)</) {
			print CSVFILE "$1,";
		}
		if ($line =~ /data-stat="ast_per_g" >([0-9]+)</) {
			print CSVFILE "$1,";
		}
		if ($line =~ /data-stat="stl_per_g" >([0-9]+)</) {
			print CSVFILE "$1,";
		}
		if ($line =~ /data-stat="blk_per_g" >([0-9]+)</) {
			print CSVFILE "$1,";
		}
		if ($line =~ /data-stat="tov_per_g" >([0-9]+)</) {
			print CSVFILE "$1,";
		}
		if ($line =~ /data-stat="pf_per_g" >([0-9]+)</) {
			print CSVFILE "$1,";
		}
		if ($line =~ /data-stat="pts_per_g" >([0-9]+)</) {
			print CSVFILE "$1,";
		}
		
		print CSVFILE "\n";
   } 
 