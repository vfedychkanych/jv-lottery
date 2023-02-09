package core.basesyntax;

public class Ball {
 private Colors color;
 private int number;

    public void setNumber(int number) {
        this.number = number;
    }

    public Ball(Colors color, int number){
   this.color = color;
   this.number = number;
 }

    public void setColor(Colors color) {
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public Colors getColor() {
        return color;
    }

    public String toString() {
    return "Ball: " +
            "color - " + getColor() + " |||" +
            " number - " + getNumber();
  }
}
