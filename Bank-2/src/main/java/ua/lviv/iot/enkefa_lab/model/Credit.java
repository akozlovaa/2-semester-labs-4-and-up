package main.java.ua.lviv.iot.enkefa_lab.model;

public class Credit extends Service {
  protected int moneyLoaned;

  public int getMoneyLoaned() {
    return moneyLoaned;
  }

  public void setMoneyLoaned(int moneyLoaned) {
    this.moneyLoaned = moneyLoaned;
  }

  public Credit(String name, int numberOfFilials, Duration duration, int interestRate, 
      int moneyLoaned) {
    super(name, numberOfFilials, duration, interestRate);
    this.moneyLoaned = moneyLoaned;
  }

  @Override
  public String getHeaders() {
    return super.getHeaders() + "," + " moneyLoaned";
  }

  @Override
  public String toCsV() {
    return super.toCsV() + "," + moneyLoaned;
  }
}
