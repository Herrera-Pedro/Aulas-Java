package com.mycompany.trycatch;

import java.io.File;

public class Trycatch {

    public static void main(String[] args) {
        // File file = new File("exercicio5.txt");
        // boolean exists = file.exists();
        
        File file = new File("exercicio5.txt");
        System.out.println(file.getAbsolutePath());

    //     try {
    //         if (exists) {
    //             if (file.canRead()) {
    //                 System.out.println("The file exists.");
    //             } else {
    //                 throw new Exception("The file exists but cannot be read.");
    //             }
    //         } else {
    //             System.out.println("The file does not exist.");
    //         }
    //     } catch (Exception e) {
    //         System.out.println("The file exists.");
    //         e.printStackTrace();
    //     }
    // }
    }
}