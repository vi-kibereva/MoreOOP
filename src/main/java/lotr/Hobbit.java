package lotr;
import kickstrat.HobbitStrategy;

public final class Hobbit extends Character{
    public Hobbit(){
        super(0, 3, new HobbitStrategy());
    }
}