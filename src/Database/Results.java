package Database;
public class Results {
    private String subjectCode;
    private int subScore;
    private boolean passFail;
    Results(String sc, int ss, boolean pf){
        subjectCode=sc;
        subScore=ss;
        passFail=pf;
    }
    String getCode(){
        return subjectCode;
    }
    int getScore(){
        return subScore;
    }
    boolean getPassFail(){
        return passFail;
    }
    void setCode(String sC){
        subjectCode=sC;
    }
    void setScore(int sS){
        subScore=sS;
    }
    void setPassFail(boolean pF){
        passFail=pF;
    }
    String getName(String cd, Subject p[]){
        String name="";
        for(int count=0;count<p.length;count++){
           if(p[count].getCode().equals(cd)){
               name=p[count].getName();
           } 
        }
        return name;
    }
    public String toString(Subject[]p){
        String s;
        String subName="";
        for(int count=0;count<p.length;count++){
            if(p[count].getCode().equals(subjectCode)){
                subName=p[count].getName();
            }
        }
        if(passFail==true)
            s=(subName+"\t"+subScore+"\tPass");
        else
            s=(subName+"\t"+subScore+"\tFail");
        return s;
    }
}
