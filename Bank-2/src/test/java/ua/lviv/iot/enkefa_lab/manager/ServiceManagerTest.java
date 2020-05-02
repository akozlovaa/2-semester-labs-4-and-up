package test.java.ua.lviv.iot.enkefa_lab.manager;

import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import main.java.ua.lviv.iot.enkefa_lab.manager.ServiceManager;
import main.java.ua.lviv.iot.enkefa_lab.model.Duration;
import main.java.ua.lviv.iot.enkefa_lab.model.Service;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class ServiceManagerTest extends BaseServiceManagerTest {

  private ServiceManager serviceManager;

  @BeforeEach
  public void setUp() {
    serviceManager = new ServiceManager();

    createServices();

    serviceManager.addServices(credits);
    serviceManager.addServices(deposits);
  }

  @Test
  public void testFindServiceByDuration() {
    List<Service> service = serviceManager.findServicesBy(Duration.MEDIUM);
    assertEquals(2, service.size());
    assertEquals(Duration.MEDIUM, service.get(0).getDuration());

  }

}
