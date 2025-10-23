import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void load(ArrayList<Claw> claws) {
        try{
            String line;
            BufferedReader br = new BufferedReader(new FileReader("AOC-13.txt"));
            int i = 0, ax=0, ay=0, bx=0, by=0, prizeX=0, prizeY=0;
            while(true) {
                line = br.readLine();
                if(i%4==0){
                    String[] split = line.split("\\+");
                    String axString = split[1];
                    String ayString = split[2];
                    axString=axString.substring(0,axString.indexOf(","));
                    ax = Integer.parseInt(axString);
                    ay = Integer.parseInt(ayString);
                }
                if(i%4==1){
                    String[] split = line.split("\\+");
                    String bxString = split[1];
                    String byString = split[2];
                    bxString=bxString.substring(0,bxString.indexOf(","));
                    bx = Integer.parseInt(bxString);
                    by = Integer.parseInt(byString);
                }
                if(i%4==2){
                    String[] split = line.split("=");
                    String prizeXString = split[1];
                    String prizeYString = split[2];
                    prizeXString=prizeXString.substring(0,prizeXString.indexOf(","));
                    prizeX = Integer.parseInt(prizeXString);
                    prizeY=Integer.parseInt(prizeYString);
                }
                if(i%4==3){
                    Claw claw=new Claw(ax, ay, bx, by, prizeX, prizeY);
                    claw.print();
                    claws.add(claw);
                }
                i++;
                if(line==null) break;
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        ArrayList<Claw> claws = new ArrayList<>();
        load(claws);
        int tokens=0;
        for(Claw claw:claws){
            if(claw.nrOfTokens()!=-1){
                tokens+=claw.nrOfTokens();
            }
        }
        System.out.println(tokens);
    }
}