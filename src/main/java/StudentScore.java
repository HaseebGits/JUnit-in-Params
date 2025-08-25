public class StudentScore {
    private int satScore;

    public void calculateSatScore(int mathScore,int computerScore){
        if(mathScore<0 || mathScore>100 || computerScore<0 || computerScore>100){
            satScore=-1;
        }        else{

            satScore=mathScore*computerScore;
        }
    }
    public int getSatScore(){
        return this.satScore;
    }
}
