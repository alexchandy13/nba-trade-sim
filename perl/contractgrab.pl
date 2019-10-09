#!/usr/bin/perl

my $url = "https://www.basketball-reference.com/contracts/players.html";
my $file = "nbacontracts.csv";
open CSVFILE, ">$file";
print CSVFILE "Player, Team, 17-18, 18-19, 19-20,  20-21, 21-22, 22-23, Gtd\n";
my $cmd = "curl $url | grep \"<tr\"";
my @out = `$cmd`;
foreach my $line ( @out ) {
		
		if ($line =~ /data-stat="player" ><a href="\/players\/[a-z]\/.+">([-'A-Za-z\.]+\s[-'A-Za-z\.]+)/) {
			print CSVFILE "$1, ";
		} else {
			next;
		}
		if ($line =~ /data-stat="team_id" ><a href="\/contracts\/.+">([A-Z]+)/) {
			print CSVFILE "$1, ";
		} 
		if ($line =~ /data-stat="y1" csk="([0-9]+)"/) {
			print CSVFILE "$1, ";
		} if ($line =~ /data-stat="y1" ></) {
			print CSVFILE "0, ";
		} 
		if ($line =~ /data-stat="y2" csk="([0-9]+)"/) {
			print CSVFILE "$1, ";
		} if ($line =~ /data-stat="y2" ></) {
			print CSVFILE "0, ";
		} 
		if ($line =~ /data-stat="y3" csk="([0-9]+)"/) {
			print CSVFILE "$1, ";
		} if ($line =~ /data-stat="y3" ></) {
			print CSVFILE "0, ";
		} 	
		if ($line =~ /data-stat="y4" csk="([0-9]+)"/) {
			print CSVFILE "$1, ";
		} if ($line =~ /data-stat="y4" ></) {
			print CSVFILE "0, ";
		} 
		if ($line =~ /data-stat="y5" csk="([0-9]+)"/) {
			print CSVFILE "$1, ";
		} if ($line =~ /data-stat="y5" ></) {
			print CSVFILE "0, ";
		} 
		if ($line =~ /data-stat="y6" csk="([0-9]+)"/) {
			print CSVFILE "$1, ";
		} if ($line =~ /data-stat="y6" ></) {
			print CSVFILE "0, ";
		} 
		if ($line =~ /data-stat="remain_gtd" csk="([0-9]+)"/) {
			print CSVFILE "$1, ";
		} if ($line =~ /data-stat="remain_gtd" ></) {
			print CSVFILE "0, ";
		}
			
		print CSVFILE "\n";
   } 