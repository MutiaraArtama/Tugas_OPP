/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Loop_Control;

/**
 *
 * @author Asus; Mutiara Azzahrani Artama. 2113020163. Program Rata-rata Nilai.
 */
import java.util.Scanner;

public class While_Nilai {
   public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int i, n;
        float jum, x, rata;
        
        System.out.println("======================");
        System.out.println(" Rata-Rata Nilai Quiz ");
        System.out.println("======================");
        System.out.print ("Jumlah Quiz : ");
        System.out.println(" ");
        n = input.nextInt();
        jum=0;
        i=1;
        
        while (i<=n){
                System.out.print ("Nilai Quiz ke-"+i+": ");
                x=input.nextFloat ();
                jum += x;
                i++;
        }
        rata = jum / n;
        
        System.out.println(" ");
        System.out.println ("Jumlah: "+jum);
        System.out.println(" ");
        System.out.println ("Rata-rata: "+rata);
        System.out.println("======================");
   }  
}
