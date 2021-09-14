package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 hudson millar
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        System.out.println( "Enter a quote" );
        String quote = scan.nextLine();

        System.out.println( "Who's the author?");
        String author = scan.nextLine();

        System.out.println(author + " once said \"" + quote + "\"");
    }
}
