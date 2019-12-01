package Database;
public class Person {
    private String name;
    private int age;
    private boolean gender;
    private Results[]res=new Results[8];
    private int numOfSubjects=0;
    Person(String nm, int ag, boolean gen){
        name=nm;
        age=ag;
        gender=gen;
    }
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
    boolean getGender(){
        return gender;
    }
    int getNum(){
        return numOfSubjects;
    }
    void setName(String nm){
        name=nm;
    }
    void setAge(int ag){
        age=ag;
    }
    void setGender(boolean gen){
        gender=gen;
    }
    void addResult(Results j){
        res[numOfSubjects]=j;
        numOfSubjects++;
    }
    double avgScore(){
        double tScore=0;
        for(int count=0;count<numOfSubjects;count++){
            tScore=tScore+res[count].getScore();
        }
        tScore=tScore/numOfSubjects;
        return tScore;
    }
    String getsubName(int numSub, Subject p[]){
        return res[numSub].getName(res[numSub].getCode(),p);
    }
    String highScore(Subject s[]){
        int high=0;
        String highS="";
        for(int count=0;count<numOfSubjects;count++){
            if(res[count].getScore()>high){
                high=res[count].getScore();
                for(int counter=0;counter<s.length;counter++){
                    if(res[count].getCode().equals(s[counter].getCode())){
                        highS=s[counter].getName();
                    }
                }
            }
            else if(res[count].getScore()==high){
                for(int counter=0;counter<s.length;counter++){
                    if(res[count].getCode().equals(s[counter].getCode())){
                        highS=highS+"\n"+s[counter].getName();
                    }
                }
            }
        }
        return highS;
    }
    String dispRes(Subject p[]){
        String s=name+"\n";
        for(int count=0;count<numOfSubjects;count++){
            s=s+res[count].toString(p)+"\n";
        }
        s=s+"Highest scoring subject was: "+highScore(p);
        return s;
    }
    String dispGrad(Subject p[]){
        String s=name+"\nSubject\tGrade\n__________________\n";
        for(int count=0;count<p.length;count++){
            if(subNameSearch(p[count].getCode())==true){
                s=s+p[count].getName()+"\t";
                if(searchResSWF(p[count].getCode())>84){
                    s=s+"7\n";
                }
                else if(searchResSWF(p[count].getCode())>74){
                    s=s+"6\n";
                }
                else if(searchResSWF(p[count].getCode())>64){
                    s=s+"5\n";
                }
                else if(searchResSWF(p[count].getCode())>54){
                    s=s+"4\n";
                }
                else if(searchResSWF(p[count].getCode())>39){
                    s=s+"3\n";
                }
                else if(searchResSWF(p[count].getCode())>29){
                    s=s+"2\n";
                }
                else if(searchResSWF(p[count].getCode())>19){
                    s=s+"1\n";
                }
                else{
                    s=s+"0\n";
                }
            }
        }
        return s;
    }
    boolean searchRes(String code){
        boolean found=false;
        for(int count=0;count<numOfSubjects;count++){
            if(res[count].getCode().equals(code)&&res[count].getPassFail()==true)
                found=true;
        }
        return found;
    }
    int searchResS(String code){
        int found=0;
        for(int count=0;count<numOfSubjects;count++){
            if(res[count].getCode().equals(code)&&res[count].getPassFail()==true)
                found=res[count].getScore();
        }
        return found;
    }
    int searchResSWF(String code){
        int found=0;
        for(int count=0;count<numOfSubjects;count++){
            if(res[count].getCode().equals(code))
                found=res[count].getScore();
        }
        return found;
    }
    boolean subNameSearch(String code){
        boolean found=false;
        for(int count=0;count<numOfSubjects;count++){
            if(res[count].getCode().equals(code))
                found=true;
        }
        return found;
    }
    String retStat(int num){
        String s;
        s=res[num].getCode()+" "+res[num].getScore()+" ";
        return s;
    }
    void removeSub(String subName, Subject p[]){
        String cod="";
        for(int count=0;count<p.length;count++){
            if(p[count].getName().equals(subName)){
                cod=p[count].getCode();
            }
        }
        int flag=-1;
        for(int count=0;count<numOfSubjects;count++){
            if(res[count].getCode().equals(cod)){
                flag=count;
            }
        }
        if(flag!=numOfSubjects-1){     
            res[flag]=res[numOfSubjects-1];
        }
        else{
            res[flag]=null;
        }
        numOfSubjects=numOfSubjects-1;
    }
    void changeScore(String subName, Subject p[], int scor){
        String cod="";
        for(int count=0;count<p.length;count++){
            if(p[count].getName().equals(subName)){
                cod=p[count].getCode();
            }
        }
        int flag=-1;
        for(int count=0;count<numOfSubjects;count++){
            if(res[count].getCode().equals(cod)){
                flag=count;
            }
        }
        res[flag].setScore(scor);
    }
    @Override
    public String toString(){
        String s;
        if (gender==true)
            s=(name+"\t"+age+"\t"+"Female");
        else
            s=(name+"\t"+age+"\t"+"Male");
        return s;
    }
}