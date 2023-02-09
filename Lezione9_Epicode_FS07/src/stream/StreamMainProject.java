package stream;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StreamMainProject {
	
	static List<String> lista1 = new ArrayList<String>();
	static List<String> lista2 = Arrays.asList("Test1", "Test2", "Test3");

	public static void main(String[] args) throws IOException {
		
		Logger log = LoggerFactory.getLogger(StreamMainProject.class);
		log.info("Test Logger");
		
		File file = new File("dirFile/test.txt");
		String testo = "Test di scrittura su file";
		FileUtils.writeStringToFile(file, testo, "UTF-8",true);
		System.out.println("Testo inseirito nel file");
		
		
		
		lista1.add("Angular");
		lista1.add("CorsoEpicode");
		lista1.add("Angular");
		lista1.add("JavaSpring");
		
		//lista1.forEach(ele -> System.out.println(ele));
		//lista2.forEach(ele -> System.out.println(ele));
		
		Stream<String> listaFiltrata =  lista1
											.stream()
											.filter(ele -> ele.length() >= 8)
											.map(ele -> ele + "!");
		
		
		String s = listaFiltrata.reduce("", (acc, ele) ->  acc + ele + "#");
		System.out.println(s);
		
		Set<String> listaManipolata =  lista1
											.stream()
											.map(ele ->  "|" + ele + "|")
											.collect(Collectors.toSet());
		
		listaManipolata.forEach(ele -> System.out.println(ele));

		Stream<Integer> streamBuilder = Stream.<Integer>builder()
												.add(25)
												.add(14)
												.add(66)
												.add(49)
												.add(22)
												.add(8)
												.build();
		//long count = streamBuilder.count();
		//System.out.println("Count String: " + count);
		
		//Integer max = streamBuilder.max(Integer::compare).get();
		//System.out.println("Max num: " + max);
		
		//Integer min = streamBuilder.min(Integer::compare).get();
		//System.out.println("Min num: " + min);
		
		streamBuilder.sorted().limit(3).forEach(ele -> System.out.println(ele));
	}

}
