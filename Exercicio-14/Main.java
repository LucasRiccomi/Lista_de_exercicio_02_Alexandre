public class Main
{
    public static void main(String[] args) 
    {
        int[] vetor = new int[50];
        
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = 0;
        }
        
        System.out.println("Vetores preenchidos com zeros: ");
        for(int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }       
    }    
}