package main.java.ua.lviv.iot.enkefa_lab.model;

public class Deposit extends Service {

  private int moneyDeposited;

  public int getMoneyDeposited() {
    return moneyDeposited;
  }

  public void setMoneyDeposited(int moneyDeposited) {
    this.moneyDeposited = moneyDeposited;
  }

  public Deposit(String name, int numberOfFilials, Duration duration, int interestRate, 
      int moneyDeposited) {
    super(name, numberOfFilials, duration, interestRate);
    this.moneyDeposited = moneyDeposited;
  }

  @Override
  public String getHeaders() {
    return super.getHeaders() + "," + " moneyDeposited";
  }

  @Override
  public String toCsV() {
    return super.toCsV() + "," + moneyDeposited;
  }

}
