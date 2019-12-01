package Database;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class PersonMain{
    static Person human[] = new Person[100];
    static Subject subs[] = new Subject[16];
    static int index;
    public static void main(String []args) throws IOException{
        access();
        subAccess();
        menu();
    }
    public static void access() throws IOException{
        Scanner f = new Scanner(new File("Names.txt"));
        boolean gen=true;
        String name;
        int age;
        String gentemp;
        String text[]=new String[100];
        index=0;
        while(f.hasNext()){
            text[index]=f.nextLine();
            index++;
        }
        f.close();
        for(int count=0;count<index;count++){
            name=(text[count].substring(0,text[count].indexOf(" "))).trim();
            age=Integer.parseInt((text[count].substring(text[count].indexOf(" "), (text[count].indexOf(" "))+3)).trim());
            gentemp=(text[count].substring(text[count].lastIndexOf(" ")).trim());
             if (gentemp.equalsIgnoreCase("Female"))
                gen=true;
            else if (gentemp.equalsIgnoreCase("Male"))
                gen=false;
            human[count]=new Person(name,age,gen);
        }
    }
    public static void subAccess() throws IOException{
        Scanner f = new Scanner(new File("Subjects.txt"));
        String code;
        String sName;
        String text[]=new String[100];
        int i=0;
        while(f.hasNext()){
            text[i]=f.nextLine();
            i++;
        }
        f.close();
        for(int count=0;count<i;count++){
            code=text[count].substring(0,text[count].indexOf("\t"));
            sName=(text[count].substring(text[count].indexOf("\t"))).trim();
            subs[count]=new Subject(code, sName);
        }
    }
    public static void menu() throws IOException{
        int choice=0;
        while(choice!=10){
            choice=Integer.parseInt(input("Main Menu:\n1.Edit a person\n2.Search for a name\n3.Search for an age\n4.Sort by name\n5.Sort by age\n6.Add a person\n7.Remove a person\n8.Results\n9.Display\n10.Quit"));
            if(choice==1)
                edit();
            else if(choice==2){
                searchN();
            }
            else if(choice==3){
                searchA();
            }
            else if(choice==4){
                sortN();
            }
            else if(choice==5){
                sortA();
            }   
            else if(choice==6){
                add();
            }
            else if(choice==7){
                remove();
            }
            else if(choice==8){
                int secChoice=0;
                while(secChoice!=5){
                    secChoice = Integer.parseInt(input("Results Menu:\n1.Add results\n2.Calculate Results\n3.Subject Average\n4.Display Results\5.Quit"));
                    if(secChoice==1){
                        addRes();
                    }
                    else if(secChoice==2){
                        calculate();
                    }
                    else if(secChoice==3){
                        subjectAvg();
                    }
                    else if(secChoice==4){
                        displayRes();
                    }
                }
            }
            else if(choice==9){
                display();
            }
        }
    }
    public static void edit(){
        String newname = input("Who do you want to edit: ");
        String editor = input("Which attribute would you like to change(\"Name\"or\"Age\"or\"Gender\"): ");
        int flag=0;
        for(int count=0;count<index;count++){
            if(((human[count].getName()).equalsIgnoreCase(newname))){
            if(editor.equalsIgnoreCase("Name")){
                    String edt = input("What would you like to change the name to: ");
                    human[count].setName(edt);
                    output("The name has been changed");
                }
                else if(editor.equalsIgnoreCase("Age")){
                    int edt = Integer.parseInt(input("What would you like to change the age to: "));
                    human[count].setAge(edt);
                    output("The age has been changed");
                }
                else if(editor.equalsIgnoreCase("Gender")){
                    String edt = input("What would you like to change the gender to: ");
                    boolean gen=true;
                    if (edt.equalsIgnoreCase("Female"))
                        gen=true;
                    else if (edt.equalsIgnoreCase("Male"))
                        gen=false;
                    human[count].setGender(gen);
                    output("The gender has been changed");
                }
                else
                    output("This option does not exist");
                flag=1;
            } 
        }
        if (flag==0)
            output("This name does not exist");
    }
    public static void searchN(){
        int flag=0;
        String newname = input("Which name would you like to search for: ");
        for(int count=0;count<index;count++){
            if(((human[count].getName()).equalsIgnoreCase(newname))){
                output(human[count].toString());
                flag=1;
            }        
        }
        if(flag==0)
            output("This name was not found");  
    }
    public static void searchA(){
        int flag=0;
        int newage = Integer.parseInt(input("Enter an age you would like to find"));
        for(int count=0;count<index;count++){
            if(human[count].getAge()==newage){
                output(human[count].toString());
                flag=1;
            }
        }
        if(flag==1){
               output("These name(s) were of age "+newage); 
            }
        if(flag==0)
            output("People of this age were not found");
    }
    public static void sortN(){
        try {
            access();
        } catch (IOException ex) {
            Logger.getLogger(PersonDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        Person temp;
        for(int count=0;count<index;count++){
            for(int counter=0;counter<index-1;counter++){
                if(((human[counter].getName()).compareTo(human[counter+1].getName()))>0){
                    temp=human[counter];
                    human[counter]=human[counter+1];
                    human[counter+1]=temp;
                }
            }
        }
        try {
            reWrite();
        } catch (IOException ex) {
            Logger.getLogger(PersonMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void sortA(){
        try {
            access();
        } catch (IOException ex) {
            Logger.getLogger(PersonDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        int i, j, first;
        Person temp;
        for (i = index-1;i > 0;i--){  
            first = 0;  
            for(j = 1;j <= i;j ++){   
                if((human[j].getAge())>(human[first].getAge()))         
                    first = j;
            }
            temp = human[first]; 
            human[first] = human[i];
            human[i] = temp;
        }
        try {
            reWrite();
        } catch (IOException ex) {
            Logger.getLogger(PersonMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void add(){
        
    }
    public static void remove() throws IOException{
        int flag=0;
        String t1=input("Enter a name you would like to remove");
        for(int count=0;count<index;count++){
            if(((human[count].getName()).equalsIgnoreCase(t1))){
                flag=count;
            }        
        }
        if(t1.equals(""))
            output("You need to enter a name");
        else if(flag==0)
            output("This name was not found");
        else{
            human[flag]=human[index-1];          
            output("The person has been deleted from the database");
        reWrite();
        }
    }    
    public static void addRes(){
        int flag=0;
        String newname = input("What is the name of the student: ");
        for(int count=0;count<index;count++){
            if(((human[count].getName()).equalsIgnoreCase(newname))){
                flag=1;
                int howM = Integer.parseInt(input("How many subjects would you like to add: "));
                int counter=0;
                for(int i=0;i<subs.length;i++)
                    System.out.println(subs[i].toString());
                while(counter<howM){
                    int flg=0;
                    String code;
                    String subN = input("Ënter the name of the subject you would like to add: ");
                    for(int j=0;j<subs.length;j++){
                        if(subs[j].getName().equalsIgnoreCase(subN)){
                            code=subs[j].getCode();
                            counter++;
                            flg=1;
                            int subscore=Integer.parseInt(input("What did "+newname+" score in "+subN+"(0-100)"));
                            boolean pf=true;
                            if(subscore>40)
                                pf=true;
                            else if(subscore<=40)
                                pf=false;
                            human[count].addResult(new Results(code,subscore,pf));
                        }
                    }
                    if(flg==0)
                        output("This subject name was not found. You must enter a valid subject name.");  
                }    
            }        
        }
        if(flag==0)
            output("This name was not found");
    }
    public static void calculate(){
        int flag=0;
        String newname = input("Which name would you like to search for: ");
        for(int count=0;count<index;count++){
            if(((human[count].getName()).equalsIgnoreCase(newname))){
                flag=1;
                if(human[count].getNum()==0){
                    output("You must first add the results for "+newname+".");
                    break;
                }
                else
                    output("The avergae score for "+newname+" is: "+human[count].avgScore()+"\n"+newname+"\'s highest scoring subject was: "+human[count].highScore(subs));
            }        
        }
        if(flag==0)
            output("This name was not found");   
    }
    public static void displayRes(){
        int flag=0;
        String newname = input("Which name would you like to search for: ");
        for(int count=0;count<index;count++){
            if(((human[count].getName()).equalsIgnoreCase(newname))){
                flag=1;
                if(human[count].getNum()==0){
                    output("You must first add the results for "+newname+".");
                    break;
                }
                else
                    output(human[count].dispRes(subs));
            }        
        }
        if(flag==0)
            output("This name was not found");
    }
    public static void subjectAvg(){
        int flg=0,total=0,counter=0;
        String code;
        String subN = input("Ënter the name of the subject you would like to find an average for: ");
        for(int j=0;j<subs.length;j++){
            if(subs[j].getName().equalsIgnoreCase(subN)){
                code=subs[j].getCode();
                flg=1;
                for(int i=0;i<index;i++){
                    if(human[i].searchRes(code)==true){
                        total=total+human[i].searchResS(code);
                        counter++;
                    }
                }
            }
        }
        if(flg==0)
            output("This subject name was not found. You must enter a valid subject name.");
        else{
            output("From the "+counter+" people that passed "+subN+" the average score was: "+(total/counter));
        }  
    }
    public static void display() throws IOException{
        for(int count=0;count<index;count++)
            System.out.println(human[count].toString());
        reWrite();
    }
    public static void reWrite() throws IOException{
        FileWriter fw = new FileWriter("Names.txt");
        PrintWriter output = new PrintWriter(fw,true);
        for(int count=0;count<index;count++){
            if(human[count].getGender()==true)
                output.println(human[count].getName()+" "+human[count].getAge()+" Female");
            else
                output.println(human[count].getName()+" "+human[count].getAge()+" Male");       
        }
    }
    static String input(String prompt){
        return javax.swing.JOptionPane.showInputDialog(null,prompt); }
    static void output(String message){
        javax.swing.JOptionPane.showMessageDialog(null,message); }
}
 