package collections;

import pets.Cat;
import pets.Dog;
import pets.Hamster;
import pets.Pet;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lanqilu
 * @date Created in 2020/10/13  20:03
 * @description
 */
public class PetMap {
    public static void main(String[] args) {
        Map<String, Pet> petMap = new HashMap<>();
        petMap.put("My Cat", new Cat("Molly"));
        petMap.put("My Dog", new Dog("Ginger"));
        petMap.put("My Hamster", new Hamster("Bosco"));
        System.out.println(petMap);
        Pet dog = petMap.get("My Dog");
        System.out.println(dog);
        System.out.println(petMap.containsKey("My Dog"));
        System.out.println(petMap.containsValue(dog));
    }
}
/* Output:
{My Dog=Dog Ginger, My Cat=Cat Molly, My Hamster=Hamster Bosco}
Dog Ginger
true
true
*/
