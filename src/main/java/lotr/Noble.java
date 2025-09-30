package lotr;
import java.util.Random;

import kickstrat.NobleStrategy;
public class Noble extends Character{
    private static final Random random = new Random();
    public Noble(int minPower, int maxPower,int minHp, int maxHp){
        super(random.nextInt(maxPower-minPower)+minPower, random.nextInt(maxHp-minHp)+minHp, new NobleStrategy());
    }
    public void kick(Character target){
        target.setHp(target.getHp()- random.nextInt(this.getPower()+1));
    }
}
