package mygui;

/*
Formularea problemei:
Sunt date 2 multimi de numere intregi care sunt deja sortate.
Se cere de elaborat si implementat un algoritm de creare 
a unuei multimi comune - sortata pentru cele 2 multimi de intrare.
NU se permite ca algoritmul sa apeleze indicii neexistenti a multimilor
*/

public class Sort {
        
    public static void main (String[] args) {
       int[] a = {-4, 0, 3, 4, 4, 7, 7};        //1 multime initiala
       int[] b = {-7, -4, -1, 0, 0, 1, 3, 5, 5, 6, 8};      //2 multime initiala
       
       int[] c = new int[(a.length + b.length)];   // multimea finala
       
       int i = 0;                                  // indecele multimii a
       int j = 0;                                  // indecele multimii b
       int k = 0;                                  // indecele multimii c
       
        if (a.length > b.length){                 // conditia ca a[] > b[]
           while (j < b.length){                  // ciclul asigura ca indecele j al lui b[] !> c marimea b[]
               if (b[j] <= a[i]){                 // se compara elementele cu indicii actualii
                   c[k] = b[j];                   // se initializeaza multimea c cu cel mai mic element al b[]
                   j++;                           // se misca la elementul b[j+1] in caz de efectuare a prezentului "if"
               } else {                           
                   c[k] = a[i];                   // alltfel se initializeaza cu elementul din a[]
                   i++;                           // se misca la elementul a[i+1] in caz de efectuare a prezentului "if"
               }
               k++;                               // se misca la elementul c[k+1]
           }                                      // pina aici se sorteaza pina la ultimul element al b[]
           for (int g = i; g < a.length; g++){    // deoarece elementele ramase din a[] sunt deja sortate, preluam ultimul indece.
               c[k] = a[g];
               k++;
               }
       }
        
       if (b.length > a.length){                    // conditia ca b[] > a[] analogic "if"-lui precedent
           while (i < a.length){
               if (a[i] <= b[j]){
                   c[k] = a[i];
                   i++;
               } else {
                   c[k] = b[j];
                   j++;
               } 
               k++;
       }
           for (int g = j; g < b.length; g++){
               c[k] = b[g];
               k++;
           }       
       }
       
       if (a.length == b.length){                     // daca marimea a[] = b[]
           while (j < b.length){
               if (b[j] <= a[i]){
                   c[k] = b[j];
                   j++;
               } else {
                   c[k] = a[i];
                   i++;
               }
               k++;   
           }      
           for (int g = i; g < a.length; g++){
               c[k] = a[g];
               k++;
           }
       }     
       
       for (int l = 0; l < c.length; l++)
               System.out.print(c[l] + ", ");
      
    
    System.out.println( "\n i = " + i + " j = " + j + " k = " + k );
    System.out.println( "marimea C = " + c.length );
    }
}            

       
      