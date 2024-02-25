import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.usermodel.Row;


public class Zad2 {

    public static void main(String[] args) {
        Zad2 reader = new Zad2();
        reader.readStudents("studenti.xlsx");
    }

    public void readStudents(String filename) {
        try (FileInputStream file = new FileInputStream(filename)) {
            Workbook workbook = WorkbookFactory.create(file);
            Sheet sheet = workbook.getSheetAt(0);

            for (Row row : sheet) {
                String ime = row.getCell(0).toString();
                String prezime = row.getCell(1).toString();
                String brojIndeksa = row.getCell(2).toString();


                System.out.println("Ime: " + ime + ", Prezime: " + prezime + ", Broj Indeksa: " + brojIndeksa);
            }

            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
