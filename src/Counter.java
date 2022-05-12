public class Counter {

     private int myNumber;

     public Counter() {
         myNumber = 0;
     }

     public Counter(int myNumber){
        this.myNumber = myNumber;
    }

    public int value() {
        return this.myNumber;
    }

    public void increase() {
        this.myNumber += 1;
    }

    public void increase(int increaseBy) {
        if (increaseBy < 0) {
            this.myNumber += 0;
        } else {
        this.myNumber += increaseBy;
        }
    }

    public void decrease() {
        this.myNumber -= 1;
    }


    public void decrease(int decreaseBy) {
        if (decreaseBy < 0) {
            this.myNumber += 0;
        } else {
        this.myNumber -= decreaseBy;
        }
    }

    
}
