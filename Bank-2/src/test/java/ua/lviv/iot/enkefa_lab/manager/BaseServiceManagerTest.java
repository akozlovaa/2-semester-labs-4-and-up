package test.java.ua.lviv.iot.enkefa_lab.manager;

import java.util.LinkedList;
import java.util.List;

import main.java.ua.lviv.iot.enkefa_lab.model.*;

class BaseServiceManagerTest {

  protected List<Service> credits;
  protected List<Service> deposits;

  public void createCredits() {
    credits = new LinkedList<Service>();
    credits.add(new Credit("Mono", 0, Duration.SHORT, 3, 30000));
    credits.add(new Credit("Privat", 24, Duration.MEDIUM, 2, 20000));
  }

  public void createDeposits() {
    deposits = new LinkedList<Service>();
    deposits.add(new Deposit("Mono", 0, Duration.LONG, 10, 150000));
    deposits.add(new Deposit("Privat", 24, Duration.MEDIUM, 5, 120000));
  }

  public void createServices() {
    createCredits();
    createDeposits();
  }

}
