package codigo.EX4;

import java.util.Objects;
import java.util.Scanner;

public class EX4 {
    public static void main  (String[] args){
        Scanner teclado = new Scanner(System.in);
        inverterstring(teclado.nextLine());
teclado.close();
    }
    public static void inverterstring(String teclado){
        Scanner string= new Scanner(System.in);

       if(Objects.equals(teclado,"fim")|| Objects.equals(teclado, "Fim") ){
           System.exit(0);
       }
       else{
           String[] invertida= new String[teclado.length()];
           int cout= teclado.length()-1;
           for(int i=0;i<teclado.length();i++)
           {
               invertida[i]=teclado.split("")[cout];
               cout--;
           }
           String finalarray= "";
          for(int i=0;i<teclado.length();i++) {
              finalarray = finalarray+ invertida[i];

          }
           System.out.println(finalarray +'\n');
           inverterstring(string.nextLine());
       }



    }
}