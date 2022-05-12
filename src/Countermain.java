public class Countermain{

    public static void main(String[] args) {

    Counter count = new Counter();
    System.out.println("count is " + count.value());
    count.decrease();
    System.out.println("count is " + count.value());
    count.decrease(2);
    System.out.println("count is " + count.value());


    Counter count1 = new Counter();
    System.out.println("count is " + count1.value());
    count1.increase();
    System.out.println("count is " + count1.value());
    count1.increase(3);
    System.out.println("count is " + count1.value());

    }
}

