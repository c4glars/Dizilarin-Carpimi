package com.mycompany.nelemandizicarpimi;
import java.util.Scanner;
public class NElemanDiziCarpimi {

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("1.dizinin eleman sayisini giriniz: ");
        int d1 = input.nextInt();
        System.out.println("2.dizinin eleman sayisini giriniz: ");
        int d2 = input.nextInt();
        
        double[] dizi1 = new double[d1];
        double[] dizi2 = new double [d2];
        
        System.out.println("1.dizinin eleamnlarını giriniz; ");
            for(int i = 0 ; i <= dizi1.length-1 ; i++){
                System.out.println(i+" indexli eleman: ");
                dizi1[i] = input.nextInt();
            }
        System.out.println("2.dizinin elemanlarını giriniz; ");
            for(int i = 0 ; i <= dizi2.length-1 ; i++){
                System.out.println(i+" indexli eleman: ");
                dizi2[i] = input.nextInt();
            }
            
        double mul1 = 1;
            for(int i = 0 ; i < d1 ; i++){
                mul1 *= (double)dizi1[i];
            }
        double mul2 = 1;
            for(int i = 0 ; i < d2 ; i++){
                mul2 *= (double)dizi2[i];
            }
        double mul = mul1 *mul2;
        System.out.println("iki dizinin carpimi :"+mul);
            
            
  }
}
