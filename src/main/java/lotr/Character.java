package lotr;
import kickstrat.KickStrategy;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class Character {
    private int power;
    private int hp;
    private KickStrategy kickStrategy;
    public void kick(Character target){
        kickStrategy.kick(this, target);
    }
    public boolean isAlive(){
        return hp>0;
    }
}
