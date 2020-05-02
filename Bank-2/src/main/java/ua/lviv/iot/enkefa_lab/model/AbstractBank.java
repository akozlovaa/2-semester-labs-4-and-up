package main.java.ua.lviv.iot.enkefa_lab.model;


public abstract class AbstractBank {

  protected String name;
  protected int numberOfFilials;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getNumberOfFilials() {
    return numberOfFilials;
  }

  public void setNumberOfFilials(int numberOfFilials) {
    this.numberOfFilials = numberOfFilials;
  }

  /**
   * Lorem Ipsum.
   * @param name name
   * @param numberOfFilials numberOfFilials
   */
  public AbstractBank(String name, int numberOfFilials) {
    super();
    this.name = name;
    this.numberOfFilials = numberOfFilials;
  }

  public String getHeaders() {
    return "name, numberOfFilials";
  }

  public String toCsV() {
    return name + "," + numberOfFilials;
  }
}
