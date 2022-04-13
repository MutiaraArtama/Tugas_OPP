/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decision_Making;

/**
 *
 * @author Asus; Mutiara Azzahrani Artama. 2113020163. Program Nilai.
 */
import java.util.Scanner;

public class IfElse_Nilai {
 public static void main(String args[])
    {
        int nilai = 0;
        Scanner input = new Scanner(System.in);
        
        System.out.println("====================================================");
        System.out.println("              Nilai Ujian Mahasiswa                 ");
        System.out.println("====================================================");
        System.out.print("Nilai Ujian : ");
        nilai = input.nextInt();
        System.out.println(" ");
        
        if (nilai >= 70)
        {
            System.out.println("Selamat, Anda telah lulus Ujian.");
        }
        else
        {
            System.out.println("Anda tidak lulus Ujian! Silahkan mengikuti remedial.");
        }
    }
}
