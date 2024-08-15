import java.util.Scanner;

public class Operation implements CreateMenu {
    int solde;
    int operationPrec;
    String nom;
    String client_id;
    public Operation(String cname,String c_id){
        this.nom=cname;
        this.client_id=c_id;

    }
    
    public void versement(int montant){
if(montant !=0){
    this.solde +=montant;
    this.operationPrec=montant;
}
    }
    public void retrait(int montant) {
        if(montant !=0){
            this.solde -=montant;
            this.operationPrec =-montant;
        }

    }
    public void operationPrecedente(){
        if (this.operationPrec > 0) {
            System.out.println("Virement Montant :"+ this.operationPrec +" DH");
        }else if (this.operationPrec < 0){
            System.out.println("Retrait Montant :"+ Math.abs(this.operationPrec) +" DH");

        }else{
            System.out.println("aucun operation");
        }
    }
    public void SchowMenu(){
        char option ='o';
        Scanner scanner=new Scanner(System.in);
        System.out.println("BienVenue "+this.nom);
        System.out.println("Votre id "+this.nom);
        System.out.println("\n");
        System.out.println("A.consulter votre solde");
        System.out.println("B.Virement");
        System.out.println("C. Retrait ");
        System.out.println("D . Operation precédente ");
        System.out.println("E . Sorti");
        do{
System.out.println("==========================");
System.out.println("Veuillez choisir une option :");
System.out.println("==========================");
option=scanner.next().charAt(0);
switch (option) {
    case 'A':
        
System.out.println("==========================");
System.out.println("Votre solde :"+this.solde);
System.out.println("==========================");
        break;
        case 'B':
        
        System.out.println("==========================");
        System.out.println("Entrer le montant :");
       int montant= scanner.nextInt();
        versement(montant);
    
        System.out.println("==========================");
                break;
                case 'C':
        
                System.out.println("==========================");
                System.out.println("Entrer le montant :");
               int montante= scanner.nextInt();
               retrait(montante);
            
                System.out.println("==========================");
                        break;
                        case 'D':
        
                        System.out.println("==========================");
                        operationPrecedente();
                        System.out.println("==========================");
                                break;
        
    default:
    System.out.println("Operation invalide");
 break;
} 
}while(option != 'E');
System.out.println("Mersi pour votre visite");

scanner.close();



    }

}
