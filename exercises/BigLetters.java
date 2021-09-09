package com.example.demo.exercises;

import java.util.*;
public class BigLetters {
   static String[] letter_A_data =
                               { "   XX     ",
                                 "  XXXX    ",
                                 " XX  XX   ",
                                 "XX    XX  ",
                                 "XXXXXXXX  ",
                                 "XX    XX  ",
                                 "XX    XX  " } ;

   static String[] letter_B_data =
                               { "XXXXXXX   ",
                                 "XX    XX  ",
                                 "XX    XX  ",
                                 "XXXXXXX   ",
                                 "XX    XX  ",
                                 "XX    XX  ",
                                 "XXXXXXX   " } ;

   static String[] letter_C_data =
                               { " XXXXXX   ",
                                 "XX    XX  ",
                                 "XX        ",
                                 "XX        ",
                                 "XX        ",
                                 "XX    XX  ",
                                 " XXXXXX   " } ;

   static String[] letter_D_data =
                               { "XXXXXXX   ",
                                 "XX    XX  ",
                                 "XX    XX  ",
                                 "XX    XX   ",
                                 "XX    XX  ",
                                 "XX    XX  ",
                                 "XXXXXXX   " } ;

   static String[] letter_E_data =
                               { "XXXXXXX   ",
                                 "XX        ",
                                 "XX        ",
                                 "XXXXX     ",
                                 "XX        ",
                                 "XX        ",
                                 "XXXXXXX   " } ;

		
   static String[] unknown_letter_data =
                               { "????????  ",
                                 "????????  ",
                                 "????????  ",
                                 "????????  ",
                                 "????????  ",
                                 "????????  ",
                                 "????????  " } ;


   static void print_big_letter( char given_letter )
   {
      if ( given_letter == 'A' )
      {
         for ( String letter_data_line : letter_A_data )
         {
            System.out.print( "\n " + letter_data_line ) ;
         }
      }
      else if ( given_letter == 'B' )
      {
         for ( String letter_data_line : letter_B_data )
         {
            System.out.print( "\n " + letter_data_line ) ;
         }
      }
      else if ( given_letter == 'C' )
      {
         for ( String letter_data_line : letter_C_data )
         {
            System.out.print( "\n " + letter_data_line ) ;
         }
      }
      else if ( given_letter == 'D' )
      {
          for ( String letter_data_line : letter_D_data )
          {
             System.out.print( "\n " + letter_data_line ) ;
          }
       }else if ( given_letter == 'E' )
       {
           for ( String letter_data_line : letter_E_data )
           {
              System.out.print( "\n " + letter_data_line ) ;
           }
        }else
      {
         for ( String letter_data_line : unknown_letter_data )
         {
            System.out.print( "\n " + letter_data_line ) ;
         }
      }
      System.out.println();
   }


   public static void main( String[] not_in_use )
   {
      Scanner  keyboard  =  new  Scanner( System.in ) ;
      String s="ABBA";
      for(int i=0;i<s.length();i++)
      {
    	  print_big_letter(s.charAt(i)); 
      }
      print_big_letter( 'E' ) ;
      print_big_letter( 'D' ) ;
      print_big_letter( 'C' ) ;
      print_big_letter( 'B' ) ;
      print_big_letter( 'A' ) ;
      print_big_letter( 'W' ) ;
   }
}

