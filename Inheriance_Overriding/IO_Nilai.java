/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheriance_Overriding;

/**
 *
 * @author Asus; Mutiara Azzahrani Artama. 2113020163. Program Rata-rata Nilai Ujian.
 */
public class IO_Nilai 
{
    String nama;
    int rata_nilai = 75; 
    
   public void data ()
   {
       System.out.println("====================================================");
       System.out.println("              Nilai Ujian Mahasiswa                 ");
       System.out.println("====================================================");
   }
   void nilai ()
   {
       System.out.print ("Rata-rata nilai lulus : "+ rata_nilai);
       System.out.println(" ");
   }
}  

//SubClass
class nilai extends IO_Nilai 
{
    int UAS=70, UTS=88, total, nilai;
  
@Override
  public void data ()
  {
      System.out.println("Nama            : Mutiara Azzahrani Artama");
      System.out.println("Jurusan         : IT-Economy");
  }
    void total_nilai ()
    {
        total=UAS+UTS;
        nilai=total/2;
        System.out.println("Nilai UTS       : "+UTS);
        System.out.println("Nilai UAS       : "+UAS);
        System.out.println("Total Nilai     : "+total);
        System.out.println("Rata-rata Nilai : "+nilai);
        System.out.println(" ");
    }
}
    
class Main_Program 
{    
public static void main(String[] args)
{
        IO_Nilai objSuper = new IO_Nilai ();
        nilai objSub = new nilai();
        
    System.out.println("Fakultas Teknik Universitas Indonesia");
    objSuper.data();
    objSuper.nilai();
    System.out.println(" ");
    
    System.out.println("Data Mahasiswa");
    objSub.data();
    objSub.total_nilai();
    System.out.println(" ");
}
}   

