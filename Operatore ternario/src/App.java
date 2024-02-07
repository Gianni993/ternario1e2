public class App {
    public static void main(String[] args) throws Exception {
       
        //L operatore ? (è un expression) è simile all if (if è uno statement)
        //se la condizione è vera ritorna quello che ce dopo ?
        //altrimenti quello che ce dopo :
        //esempio
        
        
        int eta = 18;
        System.out.println("Sei meggiorenne? La mia eta è " + eta );

        String risposta = eta >= 18 ?  "si" : "no";

        System.out.println(risposta + "\n");

         //diretto in systemout
        int numero = 5;
        System.out.println("Il numero " + numero + " è pari?");
        System.out.println(numero %2 == 0 ?  "si" : "no");
        

    }
}
