import java.util.*;

public class SportTable<T extends Team> {

    private String league;
    private LinkedList<T> teams;

    public SportTable(String league) {
        this.league = league;
        teams = new LinkedList<>();
    }

    public boolean addTeam(T team) {

        if (this.teams.size() == 0) {
            this.teams.add(team);
            return true;
        }

        if (this.teams.contains(team)) {
            System.out.println(team.getName() + " is already add to the sport table");
        }

        ListIterator i = this.teams.listIterator();
        T courrentTeam;
        while (i.hasNext()) {
            courrentTeam = (T) i.next();

            if(courrentTeam.getScore() < team.getScore()) {
                i.previous();
                i.add(team);
                return true;
            }

        }

        i.add(team);
        return true;
    }

    public void printTeams() {
        Iterator i = this.teams.iterator();
        int positions = 0;
        T currentTeam;
        while (i.hasNext()) {
            currentTeam = (T) i.next();
            System.out.println("Position: " + positions++ + "- Team: " + currentTeam.getName() + "- Score: " + currentTeam.getScore());
        }
    }

    public boolean setTeam(T team) {
        if (!deleteTeam(team)) {
            System.out.println("The team does'n exist in the sport table");
            return false;
        }

        addTeam(team);
        return true;

        Collections.sort();
    }

    private boolean deleteTeam(T team) {

        Iterator i = teams.iterator();
        T currentTeam;
        while (i.hasNext()) {
            currentTeam = (T) i.next();
            if (currentTeam.getName() == team.getName()) {
                i.remove();
                return true;
            }
        }

        return true;
    }
}
