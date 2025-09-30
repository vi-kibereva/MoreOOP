package lotr;

import kickstrat.ElfStrategy;

public class Elf extends Character{
    public Elf(){
        super(10, 10, new ElfStrategy());
    }
}