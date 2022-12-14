package tr.edu.medipol.yova.OgrenciWebServisi;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.* ;

// http://localhost:8080/ogrenci/listele

@RestController 	// Rest web service sınıfı özelligi kazandırır
@RequestMapping("/ogrenci") // /ogrenci ile başlayan web isteklerini bu sınıfa yönlendirir

public class OgrenciRestApi {

		private static  List<String> OGRENCILER = new ArrayList<>();

		{
			
			OGRENCILER.add("Jane");
			OGRENCILER.add("Joe");
			
		}

		@GetMapping("/listele")  //get veri istemek, post gönder demek
		public List<String> listele() {
			return OGRENCILER;
			
			
		}
		




}

