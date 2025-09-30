package kickstrat;
import lotr.Character;
import java.util.Random;
public class NobleStrategy implements KickStrategy{
    public void kick(Character c, Character target){
        Random random = new Random();
        target.setHp(target.getHp()- random.nextInt(c.getPower()+1));
    }
}
