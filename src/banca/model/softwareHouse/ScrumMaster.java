package banca.model.softwareHouse;

import java.time.LocalDate;

public class ScrumMaster extends Person{

    private int yearsOfExperience;
    private double levelOfPatience;
    private Developer[] team;

    public ScrumMaster(String fN, String lN, LocalDate dob, char sex, int yOE, double lOP, int teamSize) {
        super(fN, lN, dob, sex);
        this.yearsOfExperience = yOE;
        this.levelOfPatience = lOP;
        this.team = new Developer[teamSize];
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
        for(int i = 0; i < team.length; i++){
            if (team[i] == null){
                team[i] = d;
                return true;
            }
        }
        return false;

    }


}
