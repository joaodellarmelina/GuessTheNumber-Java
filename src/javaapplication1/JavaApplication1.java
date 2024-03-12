package javaapplication1;


public class JavaApplication1 {
   public static void main(String[] args) {
        int min = 0;
        int max = 100;
        int randomNum = (int)(Math.random() * (max - min + 1)) + min;
      
        int chute = 0;
 
        int tryCount = 0;
        
        InOut.MsgDeInformacao("!!!", "Chute um número de 0-100");
        
     
       
       while (randomNum != chute) {
           tryCount = tryCount + 1;  
           chute = InOut.leInt("Tetantiva " + tryCount+":" + " Chuta ai:");
           
            if (tryCount >= 7) {
               InOut.MsgDeAviso("Fuck", "7 Tentativas :( Você perdeu");
               break;
           } else {
                if (chute > randomNum) { 
                    InOut.MsgDeAviso("TIP:", "O Chute está muito alto");
                } else if (chute < randomNum) {
                    InOut.MsgDeAviso("TIP:", "O chute está muito baixo");
                } else {
                    InOut.MsgDeInformacao("Resposta", "Você Ganhou!!!");
                    break;
                }
            }
       }
   }
}

