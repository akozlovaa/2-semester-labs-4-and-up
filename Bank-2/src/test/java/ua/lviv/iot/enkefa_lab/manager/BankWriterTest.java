package test.java.ua.lviv.iot.enkefa_lab.manager;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.File;
import java.io.FileWriter;
import java.io.StringWriter;
import java.io.Writer;
import main.java.ua.lviv.iot.enkefa_lab.model.Service;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import writer.BankWriter;

public class BankWriterTest extends BaseServiceManagerTest {

  @BeforeEach
  public void setUp() {
    createServices();
  }

  @Test
  void testBankWriter() {
    try (Writer csvWriter = new FileWriter(new File("bank.csv"))) {
      BankWriter writer = new BankWriter();
      writer.setCsvWriter(csvWriter);
      writer.writeToFile(credits);
      writer.writeToFile(deposits);
    } catch (Exception exception) {
      fail("test failed");
    }
  }

  @Test
  public void testProperTextFormatting() {
    try (Writer csvWriter = new StringWriter()) {
      BankWriter writer = new BankWriter();
      writer.setCsvWriter(csvWriter);
      writer.writeToFile(credits);
      writer.writeToFile(deposits);

      String expectedOutput = "";
      for (Service credit : credits) {
        expectedOutput += credit.getHeaders() + "\n" + credit.toCsV() + "\n";
      }
      for (Service deposit : deposits) {
        expectedOutput += deposit.getHeaders() + "\n" + deposit.toCsV() + "\n";
      }
      assertEquals(expectedOutput, csvWriter.toString());
    } catch (Exception e) {
      fail("the test failed unexpectedly - try to write to the file ");
    }
  }
}
