public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "cuc tac";
    }

    @Override
    public String howtoEat() {
        return "could be fried";
    }
}
