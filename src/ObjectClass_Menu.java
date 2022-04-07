/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */

//membuat class
public class ObjectClass_Menu {
    
}

class MenuSalad {
  String nama, deskripsi;
  double harga;
}

class Main {
  public static void main(String[] args) {

    MenuSalad salad1 = new MenuSalad(); //membuat object Salad1 dari Class MenuSalad
    salad1.nama = "Low-fat Salad";
    salad1.deskripsi = "Salad dengan isian potongan buah kiwi, apel, anggur, strawberry, dan pisang ditambah dengan dressing yoghurt.";
    salad1.harga = 40000;

    MenuSalad salad2 = new MenuSalad(); //membuat object Salad2 dari Class MenuSalad
    salad2.nama = "Morning Salad";
    salad2.deskripsi = "Salad dengan isian potongan buah kiwi, strawberry, apel, melon, nanas, dan semangka ditambah dengan dressing air lemont dan daun mint.";
    salad2.harga = 45000;

    MenuSalad salad3 = new MenuSalad(); //membuat object Salad3 dari Class MenuSalad
    salad3.nama = "Summer Salad";
    salad3.deskripsi = "Salad dengan isian potongan buah kiwi, anggur, strawberry, nanas, jeruk, dan pisang ditambah dengan dressing yoghurt";
    salad3.harga = 35000;

    System.out.println("=====================");
    System.out.println(" Daftar Menu Salad : ");
    System.out.println("=====================");
    
    MenuSalad[] menuPilihan = {salad1,salad2,salad3};
    
    for (MenuSalad sld: menuPilihan) { // syntax for each
      String teks = sld.nama+ "\nDeskripsi : "+ sld.deskripsi+ "\nHarga     : Rp " +sld.harga+ "\n";
      
      System.out.println(teks);
    }
  }
}