package jsoup;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Test {

	private static String FILEPATH = "D:\\MyRepository\\DataInSZ\\src\\main\\resources\\data\\";

	public static void main(String[] args) {

		{
			try {
				Document doc1 = Jsoup.connect("http://www.baidu.com").get();
				Elements links = doc1.select("a[href]");
				System.out.println("link number :" + links.size());
				int size = 0;
				byte[] buffer = new byte[100];
				for (Element link : links) {
					String urlStr = link.attr("href");
					String[] urlStrArray = urlStr.split("\\.");
					System.out.println(urlStr);
					try {
						URL url = new URL(urlStr);
						HttpURLConnection connection = (HttpURLConnection) url.openConnection();
						connection.connect();
						BufferedInputStream bis = new BufferedInputStream(connection.getInputStream());
						FileOutputStream fos = new FileOutputStream(
								FILEPATH + Pattern.compile("[/:*?\"<>|.]").matcher(urlStr).replaceAll("-") + ".html");
						while ((size = bis.read(buffer)) != -1) {
							fos.write(buffer);
						}
						fos.close();
						bis.close();
						connection.disconnect();
					} catch (Exception e) {
						e.printStackTrace();
						continue;
					}

				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		// {
		// String str = "|/:*?<>";
		// System.out.println("out : " +
		// Pattern.compile("[/:*?\"<>|]").matcher(str).replaceAll("_"));
		// }
	}
}
