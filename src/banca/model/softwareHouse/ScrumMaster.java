package banca.model.softwareHouse;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class ScrumMaster extends Person{

    private int yearsOfExperience;
    private double levelOfPatience;
    private Random generator = new Random();
    public final int MAX_TEAM_SIZE; //per convenzione le costanti si scrivono tutte in maiuscolo con i _
    private ArrayList<Developer> team; //altro tipo di Array che consente alcune funzioni aggiuntive
    private String[] pronouns = {"Why", "When", "Where", "How", "What"};
    private String[] verbs = {"is", "does", "can i find"};
    private String[] objects = {"polymorphism?", "an abstract class?", "agile developing?", "builder?"};

    public ScrumMaster(String fN, String lN, LocalDate dob, char sex, int yOE, double lOP, int teamSize) {
        super(fN, lN, dob, sex);
        this.yearsOfExperience = yOE;
        this.levelOfPatience = lOP;
        this.team = new ArrayList<>(); //costruttore di ArrayList
        this.MAX_TEAM_SIZE = teamSize;
    }
    @Override
    public void work(){
        System.out.println("Sostanzialmente faccio lavorare gli altri.");
        if (levelOfPatience <= 0){
            System.out.println("Vi prendo tutti a bastonate!");
        }

    }

    public void answerQuestion(String question){
       // if (question.length()%2 == 0)
        if ((question.length() & 1) == 0){
            System.out.println("Bravo, bella domanda!");
            levelOfPatience++;
        } else {
            System.out.println("Ma come ti viene in mente una cosa del genere!?");
            levelOfPatience -= 2;
        }
    }

    public boolean addTeamMember(Developer d){
        int s = team.size();
        if(s == MAX_TEAM_SIZE){
            System.out.println("Il team è già al completo.");
            return false;
        } else {
            team.add(d); //per aggiungere ad un ArrayList si usa il comando nome.add()
            return true;
        }


    }

    public void examineTeam(){
        for(Developer d : team){
            String question = askQuestion();
            String output = String.format("%s chiede: %s", d.getFullName(), question);
            System.out.println(output);
            answerQuestion(question);
            if(levelOfPatience>0){
                System.out.println("Che bravo il mio developer!");
            } else {
                System.out.println("Basta!");
                System.out.println("Compro un biglietto per Malta!");
                break;
            }
        }

    }

    private String askQuestion(){
        int rg1 = generator.nextInt(pronouns.length);
        int rg2 = generator.nextInt(verbs.length);
        int rg3 = generator.nextInt(objects.length);
        //String qstn = (pronouns[rg1] + " " + verbs[rg2] + " " + objects[rg3]);
        String qstn = qstn = String.format("%s %s %s", pronouns[rg1], verbs[rg2], objects[rg3]);
        System.out.println(qstn);
        return qstn;

    }


}
