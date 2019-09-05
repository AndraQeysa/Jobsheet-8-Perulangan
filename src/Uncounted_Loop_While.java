import java.util.Scanner;
public class Uncounted_Loop_While {
    public static void main (String [] args){
        //menentukan variable
        int counter = 0;
        boolean running = true;
        String jawab;
        Scanner noir = new Scanner(System.in);
        
        while( running ){
            System.out.println("Apakah anda ingin keluar ?");
            System.out.print("Jawab [Ya/Tidak]> ");
            
            jawab = noir.nextLine();
            
            //cek jawaban, kalau ya maka berhenti mengulang
            if (jawab.equalsIgnoreCase("Ya")){
                running = false;
            }            
            
            counter++;
        }
        
        System.out.println("Anda sudah mengulang sebanyak " + counter + " kali");
    }
}
