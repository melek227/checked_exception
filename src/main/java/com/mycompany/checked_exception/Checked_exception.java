/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.checked_exception;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class Checked_exception {

    public static void main(String[] args) {
        
        BufferedReader reader=null;
        int total=0; //metin dosyasındaki sayıların toplamını bulmak için değişken
        try{  
            //FileReader unhandling exception hatası verdi.Classları try-catch içine almalıyız

            reader=new BufferedReader(new FileReader("C:users\\checked_exception\\src\\sayilar.txt"));
            //filereader ile dosyadan karakterleri döndürürüz
             //dosyayı belleğe alan ve bellekten okumamızı sağlayan class  BufferedReader
             //dosyadan okuma işlemleri satır satır olur
             String line=null;//açılan dosyada kayıt olmayabilir.Bu sebeple null değeri verdik
             while((line=reader.readLine())!=null){//bi satır oku okuyabiliyosa true değeri döndür
                //dosya okuma işleminde dosya okuma hatası olabilir

                total+=Integer.valueOf(line);//okunan değerler string geleceği için integere çevirdik

             };
             System.out.println("Toplam:"+total);

        }catch(FileNotFoundException e){

            e.printStackTrace();

        }catch(Exception e){
              
            e.printStackTrace();

        }finally{
            try{

                reader.close(); //eğer dosya yoksa kapatılmaz.IOException fırlatmamız gerekir yada tekrar try catch bloğuna almalıyız

            }catch(Exception e){

            }
        }

        
        
    }
}
