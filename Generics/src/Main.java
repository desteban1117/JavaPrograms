public class Main {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("joe");
        BaseballPlayer pat = new BaseballPlayer("pat");
        SoccerPlayer beckham = new SoccerPlayer("beckham");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");

        adelaideCrows.addPlayer(joe);
        //adelaideCrows.addPlayer(pat);
        //adelaideCrows.addPlayer(beckham);

        System.out.println(adelaideCrows.numPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

        Team<SoccerPlayer> soccerTeam = new Team<>("USA");
        soccerTeam.addPlayer(beckham);

        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordon");
        melbourne.addPlayer(banks);

        Team<FootballPlayer> hawthor = new Team<>("Hawthor");
        Team<FootballPlayer> fremantle = new Team<>("fremantle");

        hawthor.matchResult(fremantle,0,1);
        hawthor.matchResult(adelaideCrows,3,8);

        adelaideCrows.matchResult(fremantle, 2,1);
        adelaideCrows.matchResult(baseballTeam,1,1);



    }
}
