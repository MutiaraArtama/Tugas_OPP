/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorphism;

/**
 *
 * @author Asus; Mutiara Azzahrani Artama. 2113020163. Program Data Mahasiswa.
 */
public class P_DataMahasiswa 
{
    public void IdentitasData(String Print)
    {       
        System.out.println(Print);
    }
    public void IdentitasData(int Print)
    {
       System.out.println(Print); 
    }
}

class DataMhs
{
    public static void main (String[] args)
    {
        P_DataMahasiswa data = new P_DataMahasiswa();
        
        System.out.println("====================================================");
        System.out.println("                   Data Mahasiswa                   ");
        System.out.println("====================================================");
        
        System.out.print("Nama      : ");
        data.IdentitasData("Mutiara Azzahrani");
        
        System.out.print("Jurusan   : ");
        data.IdentitasData("IT-Economy");
        
        System.out.print("Angkatan  : ");
        data.IdentitasData("2021");
    }    
}