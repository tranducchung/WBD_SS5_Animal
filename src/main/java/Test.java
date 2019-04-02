public class Test {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Chicken();
        animals[1] = new Tiger();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            if  (animal instanceof Chicken){
                System.out.println(((Chicken) animal).howtoEat());
            }
        }
        Edible edible = new Chicken();
        System.out.println(edible.howtoEat());
       Fruit[] fruit = new Fruit[2];
        fruit[0] = new Apple();
        fruit[1] = new Orange();
        for (Fruit x : fruit){
            System.out.println(x.howtoEat());
        }
    }
}
