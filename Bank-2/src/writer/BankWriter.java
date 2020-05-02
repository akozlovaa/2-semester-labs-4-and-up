package writer;

import java.io.IOException;
import java.io.Writer;
import java.util.List;
import main.java.ua.lviv.iot.enkefa_lab.model.AbstractBank;
import main.java.ua.lviv.iot.enkefa_lab.model.Service;

public class BankWriter {

  private Writer csvWriter;

  public void setCsvWriter(Writer csvWriter) {
    this.csvWriter = csvWriter;
  }

  /**
 * sample text.
 * @param services services
 * @throws IOException IOException
 */
  public void writeToFile(List<Service> services) throws IOException {
    for (AbstractBank service : services) {
      csvWriter.write(service.getHeaders());
      csvWriter.write("\n");
      csvWriter.write(service.toCsV());
      csvWriter.write("\n");
      csvWriter.flush();
    }
  }
}
