package bowlinggamescore;

public class Game {
    private String sequence ;
    
    public Game(String sequence){
        this.sequence=sequence;
    }
    
   public int score(){
        int score =0;
        int indexFrame=0;
        int[] rolls = new int[21];
        String s[] = sequence.split(",");
        int cpt=0;
        try{
            for(String item:s){
                //check that the max is 10 pins by roll
                if(Integer.parseInt(item)>10)
                    throw new Exception();
                rolls[cpt] = Integer.parseInt(item);
                cpt++;
            }
            for(int i=0; i<10; i++){
               if(rolls[indexFrame]==10 ){
                   score += rolls[indexFrame]+rolls[indexFrame+1]+rolls[indexFrame+2];
                   indexFrame++;
               }
               else if(rolls[indexFrame]+rolls[indexFrame+1]==10){
                   score += rolls[indexFrame]+rolls[indexFrame+1]+rolls[indexFrame+2];
                   indexFrame += 2;
               }else{
                   score += rolls[indexFrame]+rolls[indexFrame+1];
                   indexFrame += 2;
               }
            }
            return score;
        } catch(NumberFormatException e){
            // if the sequence contains non-numeric characters
            System.out.println("the sequence is invalid !!!!!");
            return -1;
        } catch (Exception ex) {
            System.out.println("the sequence is invalid !!!!!");
            return -1;
        } 
       
   }
}
