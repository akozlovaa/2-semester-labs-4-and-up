package main.java.ua.lviv.iot.enkefa_lab.manager;

import java.util.LinkedList;
import java.util.List;

import main.java.ua.lviv.iot.enkefa_lab.model.Duration;
import main.java.ua.lviv.iot.enkefa_lab.model.Service;

public class ServiceManager {

  private List<Service> services = new LinkedList<>();

  public void addServices(List<Service> services) {
    this.services.addAll(services);
  }

  public void addPlant(Service plants) {
    this.services.add(plants);
  }
  
  /**
   * sample text.
   * @param duration duration
   * @return
   */
  public List<Service> findServicesBy(Duration duration) {

    LinkedList<Service> result = new LinkedList<>();

    for (Service service : services) {
      if (service.getDuration() == duration) {
        result.add(service);
      }
    }
    return result;
  }
}
