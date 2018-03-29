/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cst140021;

import java.util.Scanner;

/**
 *
 * @author cssuser
 */
public class Cst140021 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double weight[] = new double[4];
        double w1, w2, w3, w4;
       
        
        System.out.println("Enter 4 weighted values");
        for (int i = 0; i < 4; i++) {
            weight[i] = scan.nextDouble();

        }


        System.out.print("Enter theshold value    ");
        System.out.println();


        double thesahold = scan.nextDouble();
        System.out.println("_________________");
        System.out.println("input      result");

        int k1, k2, k3, k4;
        for (k1 = 0; k1 < 2; k1++) {
            for (k2 = 0; k2 < 2; k2++) {
                for (k3 = 0; k3 < 2; k3++) {
                    for (k4 = 0; k4 < 2; k4++) {
                        System.out.print(k1 + " " + k2 + " " + k3 + " " + k4 + "     ");
                        if (((k1 * weight[0]) + (k1 * weight[1]) + (k1 * weight[2]) + (k1 * weight[3]) > thesahold)) {
                            System.out.print("1");
                        } else {
                            System.out.print("0");
                        }
                        System.out.println();
                    }
                }


            }


        }



    }
}
