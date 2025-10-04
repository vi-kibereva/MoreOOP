import lotr.Character;
import lotr.CharacterFactory;

public class GameManager{
    private static CharacterFactory factory = new CharacterFactory();
    public static void fight(Character c1, Character c2){
        String loser;
        String winner;
        System.out.println(String.format("%s and %s met in the Great Forest and soon got into a fight", c1.getClass().getSimpleName(), c2.getClass().getSimpleName()));
        if (c1.getClass().getSimpleName() == "Hobbit" && c2.getClass().getSimpleName() == "Hobbit"){
            System.out.println("But hobbits are nonviolent creatures");
            System.out.println("So they sat there and cried until the sun set.");
            System.out.println("The end!");
            return;
        }
        String name_1 = c1.getClass().getSimpleName();
        String name_2 = c2.getClass().getSimpleName();
        while (true){
            System.out.println(String.format("The %s strikes", name_1));
            int prior_hp = c2.getHp();
            int prior_power = c2.getPower();
            c1.kick(c2);
            System.out.println(String.format("%s has lost %d hp and %d power", name_2, prior_hp - c2.getHp(), prior_power - c2.getPower()));
            if (!c2.isAlive()){
                loser = name_2;
                winner = name_1;
                break;
            }
            System.out.println(String.format("The %s strikes", name_2));
            prior_hp = c1.getHp();
            prior_power = c1.getPower();
            c2.kick(c1);
            System.out.println(String.format("%s has lost %d hp and %d power", name_1, prior_hp - c1.getHp(), prior_power-c1.getPower()));
            if (!c1.isAlive()){
                loser = name_1;
                winner = name_2;
                break;
            }
        }
        System.out.println(String.format("The %s has lost, the %s has won.", loser, winner));
        System.out.println("The end.");
    }
    public static void main(String[] args) {
        Character c1 = factory.createCharacter();
        Character c2 = factory.createCharacter();
        fight(c1, c2);
    }
}