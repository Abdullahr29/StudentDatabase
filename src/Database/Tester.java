package Database;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Tester {
    static Person human[];
    static int index=0;
    static Subject subs[] = new Subject[16];
    public static void main(String []args) throws IOException{
        Scanner f = new Scanner(new File("C:\\Users\\Abdullah\\Downloads\\Namess.txt"));
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
        System.out.println("_______");
        subAccess();
        System.out.println("+++++++");
        resAccess();
    }
    
    public static void resAccess() throws IOException{
        Scanner f = new Scanner(new File("C:\\Users\\Abdullah\\Downloads\\Resultss.txt"));
        String code;
        int score;
        boolean pf=true;
        String text[]=new String[100];
        int i=0;
        while(f.hasNext()){
            text[i]=f.nextLine();
            i++;
        }
        f.close();
        for(int count=0;count<i;count++){
            Scanner sf = new Scanner(text[count]);
            int temp = sf.nextInt();
            System.out.println(temp);
            while(sf.hasNext()){
                code=sf.next();
                score=sf.nextInt();
                if(score<41){
                    pf=false;
                }
                human[count].addResult(new Results(code,score,pf));
            }
            human[count].dispRes(subs);
        }
    }
    public static void subAccess() throws IOException{
        Scanner f = new Scanner(new File("C:\\Users\\Abdullah\\Downloads\\Subjects.txt"));
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
    static String input(String prompt){
        return javax.swing.JOptionPane.showInputDialog(null,prompt); }
    static void output(String message){
        javax.swing.JOptionPane.showMessageDialog(null,message); }
}
