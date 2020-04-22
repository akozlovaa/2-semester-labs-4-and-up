package test.java.ua.lviv.iot.enkefa_lab.manager;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.ua.lviv.iot.enkefa_lab.manager.ServiceManager;
import main.java.ua.lviv.iot.enkefa_lab.model.Duration;
import main.java.ua.lviv.iot.enkefa_lab.model.Service;

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
