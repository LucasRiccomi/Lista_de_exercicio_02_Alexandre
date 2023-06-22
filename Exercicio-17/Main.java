public class Main
{
    public static void main(String[] args) 
    {
        int i = 0;

        do{
            i--;
            if(i % 7 == 0){
                System.out.print(i + " ");
            }

        }while(i < 0 && i > -1000);
    }
    
}