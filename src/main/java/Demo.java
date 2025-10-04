import lotr.*;
import lotr.Character;
public class Demo {
    private static CharacterFactory factory = new CharacterFactory();
    public static void main(String args[]) {
        Character c1 = factory.createCharacter();
        Character c2 = factory.createCharacter();
        GameManager.fight(c1, c2);
    }
}
