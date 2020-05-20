
package benimalgoritmasorum;
import java.util.Scanner;
import java.util.Random;

public class BenimAlgoritmaSorum {
public int[]dizi;
public static int x;
protected static int y;
  
 public static void CiftBul(int arr[]){
 for (int i = 0; i < arr.length; i++) {
     if(arr[i]%2==0)  {
   System.out.print(arr[i]+" ");
        }
      }
  }
 
 public static void TekBul(int arr[]){
      for (int i = 0; i < arr.length; i++) {
        if(arr[i]%2!=0)  {
            System.out.print(arr[i]+" ");
        }
      }
  }
     
 public static  class AritmetikOrtalamaBul extends BenimAlgoritmaSorum {
 double  toplam=0;
 double  ortalama;
 
 public  void  OrtalamaBul(int arr[]){
     for (int i = 0; i < arr.length; i++) {
        toplam=toplam+arr[i];
        }
      ortalama=toplam/arr.length;
            System.out.println(ortalama);
      }   
      }
    
  public static void main(String[] args) 
  {
  
  System.out.println("Tavan sayı değerini girin");
  Scanner giris=new Scanner(System.in);
  x=giris.nextInt();
  
  System.out.println("Üretilecek sayı adedini girin");   
  y=giris.nextInt();
 int[] dizi = new int[y];
  for(int i=0; i<y; i++){
      Random rn=new Random();
      int sayi = rn.nextInt(x);
      dizi[i] = sayi;
      System.out.print(" ");
      System.out.print(dizi[i]);
      
  }
  System.out.println();
      System.out.println("Üretilen rastgele dizinin çift terimleri");
      CiftBul(dizi);
      
      System.out.println();
      System.out.println("Üretilen rastgele dizinin tek terimleri");
      TekBul(dizi);
      
      System.out.println();
      System.out.println("Üretilen rastgele dizinin aritmetik ortalamsı:");
      AritmetikOrtalamaBul aritmetikortalamabul=new AritmetikOrtalamaBul();
      aritmetikortalamabul.OrtalamaBul(dizi);
  }  
}
