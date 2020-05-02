package main.java.ua.lviv.iot.enkefa_lab.model;

public class Service extends AbstractBank {

  private Duration duration;
  protected int interestRate;

  public Duration getDuration() {
    return duration;
  }

  public void setDuration(Duration duration) {
    this.duration = duration;
  }

  public int getInterestRate() {
    return interestRate;
  }

  public void setInterestRate(int interestRate) {
    this.interestRate = interestRate;
  }

  /**
   * Lorem ipsum.
   * @param name name
   * @param numberOfFilials numberOfFilials
   * @param duration duration
   * @param interestRate interestRate
   */
  public Service(String name, int numberOfFilials, Duration duration,
      int interestRate) {
    super(name, numberOfFilials);
    this.duration = duration;
    this.interestRate = interestRate;
  }

  @Override
  public String getHeaders() {
    return super.getHeaders() + "," + " duration" + "," + "interestRate";
  }

  @Override
  public String toCsV() {
    return super.toCsV() + "," + duration + "," + interestRate;
  }
}
