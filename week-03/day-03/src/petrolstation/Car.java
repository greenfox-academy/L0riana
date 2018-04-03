package petrolstation;

public class Car {

  private int gasAmount;
  private int capacity;

  public Car(int gasAmount, int capacity) {
    this.gasAmount = 0;
    this.capacity = 100;
  }

  public int getGasAmount() {
    return gasAmount;
  }

  public void setGasAmount(int gasAmount) {
    this.gasAmount = gasAmount;
  }

  public int getCapacity() {
    return capacity;
  }

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }

  @Override
  public String toString() {
    return "Car {" +
            "gasAmount = " + gasAmount +
            ", capacity = " + capacity +
            '}';
  }
}