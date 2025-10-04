package lotr;
import kickstrat.ElfStrategy;

public final class Elf extends Character{
    public Elf(){
        super(10, 10, new ElfStrategy());
    }
}