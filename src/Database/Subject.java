package Database;
public class Subject {
    private String subjectCode;
    private String subjectName;
    Subject(String sc, String sn){
        subjectCode=sc;
        subjectName=sn;
    }
    String getCode(){
        return subjectCode;
    }
    String getName(){
        return subjectName;
    }
    void setCode(String sC){
        subjectCode=sC;
    }
    void setName(String sN){
        subjectName=sN;
    }
    @Override
    public String toString(){
        return(subjectCode+"\t"+subjectName);
    }
}
