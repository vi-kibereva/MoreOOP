// package lotr;
// import java.lang.reflect.Constructor;
// import java.util.ArrayList;
// import java.util.Random;
// import java.util.List;

// public class CharacterFactory {
//     private static final Random random = new Random();
//     private static final List<Class<? extends Character>> charClasses = new ArrayList<>();
//     static{
//         charClasses.add(Hobbit.class);
//         charClasses.add(Elf.class);
//         charClasses.add(King.class);
//         charClasses.add(Knight.class);
//     }
//     public Character createCharacter(){
//         int idx = random.nextInt(charClasses.size());
//         try{
//             Constructor<? extends Character> constructor = charClasses.get(idx).getDeclareConstructor();
//             return constructor.newInstance(null);
//         } catch (Exception e){
//             return null;
//         }
//     }
// }


package lotr;
import java.util.ArrayList;
import java.util.Random;
import org.reflections.Reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
public class CharacterFactory{
    private static final Random random = new Random();
    public Character creatCharacter(){
        Reflections reflections = new Reflections("lotr");
        ArrayList<Class<? extends Character>> charClasses = new ArrayList<>(reflections.getSubTypesOf(Character.class));
        charClasses.removeIf(c -> !Modifier.isFinal(c.getModifiers()));
        int idx = random.nextInt((charClasses.size()));
        try{
            Constructor<? extends Character> constructor = charClasses.get(idx).getDeclaredConstructor();
            return constructor.newInstance();
        } catch (Exception e){
            return null;
        }
    }
}