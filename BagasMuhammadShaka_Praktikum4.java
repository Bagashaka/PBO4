package bagasmuhammadshaka_praktikum4;
import java.util.Scanner;

public class BagasMuhammadShaka_Praktikum4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        
//        int[] nilai = new int[3];
//     
////array    
//      String[] nama = {"Stepen","Surya","Kepin","Tejo"};
//            for(int i = 0;i < nama.length; i++){
//                 System.out.println(nama[i]);
//            }
//    
//     int[] number = {1,3,5,7,9};
//            for(int j = 0; j < number.length; j++){
//                 System.out.println("Nilai :"+number[j]);
//            }
//            System.out.println("Jumlah indeks array :" + number.length);
//      
////FOR EACH mempermudah mengakses element pada array 
//            for(int num:number){
//                 System.out.println(num);
//            }
//            
//       System.out.print("Nilai matematika :");
//       nilai[0] = input.nextInt();
//      
//       System.out.print("Nilai logika :");
//       nilai[1] = input.nextInt();
//       
//       System.out.print("Nilai Bahasa :");
//       nilai[2] = input.nextInt();
//       
//      nilai[1] = 0;
//            
//        for(int print:nilai){
//                  System.out.print(print + " ");            
//      }
        
//ARRAY MULTIDIMENSI
      int[][] nilai = {{90,75,80},{80,90,80},{70,75,95}};
            for(int[] i:nilai){
               for(int j:i){
               System.out.println(j);
               }
            }
            
      nilai [0][1] = 20; 
            System.out.println ("Nilai Setelah diubah");
            
            for(int[] i:nilai){
                System.out.print("{");
               for(int j:i){              
               System.out.print(j + ",");
               }
                System.out.println("}");
            }
    }  
}   
    
    
    
   
