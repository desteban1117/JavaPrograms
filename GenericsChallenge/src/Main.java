public class Main {

    public static void main(String[] args) {

        BaseballTeam teambas = new BaseballTeam("tembas1", 1);
        FootballTeam teamfoo = new FootballTeam("fo1", 1);
        BaseballTeam teambas2 = new BaseballTeam("tembas2", 3);
        BaseballTeam teambas3 = new BaseballTeam("tembas3", 9);
        BaseballTeam teambas4 = new BaseballTeam("tembas4", 15);
        BaseballTeam teambas5 = new BaseballTeam("tembas5", 1);
        BaseballTeam teambas6 = new BaseballTeam("tembas6", 2);

        SportTable<BaseballTeam> sportTableBaseball = new SportTable<>("sptb");

        sportTableBaseball.addTeam(teambas);
        sportTableBaseball.addTeam(teambas2);
        sportTableBaseball.addTeam(teambas3);
        sportTableBaseball.addTeam(teambas4);
        sportTableBaseball.addTeam(teambas4);
        sportTableBaseball.addTeam(teambas5);
        sportTableBaseball.addTeam(teambas6);

        sportTableBaseball.printTeams();

        teambas.setScore(5);
        sportTableBaseball.setTeam(teambas);

        System.out.println("-------------------------");

        sportTableBaseball.addTeam(teambas4);

        sportTableBaseball.printTeams();
    }
}
