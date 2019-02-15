import com.pdfcrowd.*;
import org.apache.commons.io.FileUtils;
import java.io.*;
public class PdfcrowdTest {

	public static void main(String[] args) {
		 try 
	        {
	            FileOutputStream fileStream;     
	            fileStream = new FileOutputStream("d:\\example.pdf");
	 
	            // create an API client instance
	            Client client = new Client("shauryamanhar", "6bb610edec05c1e5f377ba528aeb9058");

	            /*// convert a web page and save the PDF to a file
	            client.convertURI("http://example.com/", fileStream);
	            fileStream.close();*/

	            // convert an HTML string and store the PDF into a byte array
	            ByteArrayOutputStream memStream  = new ByteArrayOutputStream();
	            String html = "<html><body>In-memory HTML.</body></html>";
	            client.convertHtml(html, memStream);
	            FileUtils.writeByteArrayToFile(new File("d:\\aa1.pdf"), memStream.toByteArray());
	         /* // convert an HTML file
	            fileStream = new FileOutputStream("D:\\file.pdf");
	            client.convertFile("C:\\Users\\Shaurya Manhar\\Desktop\\New folder\\index.html", fileStream);

	            fileStream.close();
	            // retrieve the number of credits in your account
	            Integer ncredits = client.numTokens();*/
	        }
	        catch(PdfcrowdError why) {
	            System.err.println(why.getMessage());
	        }
	        catch(IOException exc) {
	            // handle the exception
	        } 

	}

}
