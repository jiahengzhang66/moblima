package moblima;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CinemaController {
	public static void convertCSV(CinemaSeat[] seat,String[] scinema) {
		String csvFile = "test.csv";
        String line = "";
        String cvsSplitBy = ",";
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

        	
        	for(int i = 0; i < 144&&(line = br.readLine()) != null; i++){
                // use comma as separator
                scinema = line.split(cvsSplitBy); 
                seat[i] = new CinemaSeat((i+1));
                seat[i].setSeatID(Integer.parseInt(scinema[0]));
                seat[i].setAssigned(Boolean.parseBoolean(scinema[1]));
        		seat[i].setMovieGoersID(Integer.parseInt(scinema[2]));
/*               	System.out.println(seat[i].getSeatID() + "," + seat[i].isAssigned() + ","+seat[i].getMovieGoersID());
               	System.out.println(scinema[0] + "," + scinema[1] + ","+scinema[2]);	*/
               	};
                

            

        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}
