import java.util.*;

public class MapExemplars {
    public static void main(String[] args) {
//        Map carrosPopulares =  new HashMap(); // antes do java 5
//        Map<String, Double> carrosPopularess = new HashMap<>(); // Generics(jdk) Diamond Operator
//        HashMap<String, Double> carrosPopulares = new HashMap<>();
//        Map<String, Double> carrosPopulares = Map
//                .of("gol",14.4, "uno", 15.6, "mobi", 16.1, "hb20", 14.5,"kwid", 15.6);

        System.out.println("Crie um dicionario que relaciona os modelos com respectivos consumos");
        Map<String, Double> carrospopulares = new HashMap<>(){{
            put("gol",14.4); put("uno", 15.6); put("mobi",  16.1);
            put("hb20", 14.5); put("kwid", 15.6);
        }};
        System.out.println(carrospopulares);

        System.out.println("___________________________________");
        System.out.println("Substitua o consumo do gol 15,2 km/l:");
        carrospopulares.put("gol", 15.2);
        System.out.println(carrospopulares);

        System.out.println("____________________________________");
        System.out.println("confira se o modelo tucson está no dicionario");
        System.out.println(carrospopulares.containsKey("tucson"));

        System.out.println("____________________________________");
        System.out.println("Exiba o consumo do uno");
        System.out.println(carrospopulares.get("uno"));

//        System.out.println("Exiba o terceiro modelo adicionado:"); / tem com Map

        System.out.println("____________________________________");
        System.out.println("Exiba os modelos");
        Set<String> modelos = carrospopulares.keySet();
        System.out.println(modelos);

        System.out.println("_____________________________________");
        System.out.println("Exiba os modelos dos carros");
        Collection<Double> consumos = carrospopulares.values();
        System.out.println(consumos);

        System.out.println("\t");
        System.out.println("Exiba o modelo mais economico e seu consumo");

        Double consumMaisEficiente = Collections.max(carrospopulares.values());
        System.out.println(consumMaisEficiente);

        //caso ouver mais carros eficiente, interesante fazer um loop para obter mais resultados
        Set<Map.Entry<String, Double>> entries = carrospopulares.entrySet();

        String modelosMaisEficiente = "";
        for (Map.Entry<String, Double> entry: entries) {
            if (entry.getValue().
                    equals(consumMaisEficiente)) modelosMaisEficiente = entry.getKey();
            }

        System.out.println(modelosMaisEficiente);

        System.out.println("\t");
        System.out.println("Exiba o modelo menos economico e seu consumo");
        Double carrobaixoEficiencia = Collections.min(carrospopulares.values());

        Set<Map.Entry<String, Double>> entries1 = carrospopulares.entrySet();
        for (Map.Entry<String, Double> entry: entries1) {
            String modelo = "";
            if(entry.getValue().equals(carrobaixoEficiencia)) {
                modelo = entry.getKey();
                System.out.println("Modelo de baixa eficiencia: " + modelo + " - " + carrobaixoEficiencia);
            }
        }

        System.out.println("\t");
        System.out.println("Exiba a soma  dos consumos: ");
        Iterator<Double> iterator = carrospopulares.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println(soma);

        System.out.println("\t");
        System.out.println("Exiba a média dos consumos deste dicionarios de carros: " + (soma/carrospopulares.size()));

        System.out.println("\t");
        System.out.println(carrospopulares);
        System.out.println("Remova os modelos com o consumo igual a 15,6l: ");
        Iterator<Double> valuesDeCarroComMetodoInterator = carrospopulares.values().iterator();
        while (valuesDeCarroComMetodoInterator.hasNext()){
            if(valuesDeCarroComMetodoInterator.next().equals(15.6)) valuesDeCarroComMetodoInterator.remove();
        }
        System.out.println(carrospopulares);

        System.out.println("\t");
        System.out.println("Exiba todos os carros na ordem em que foram colocados: ");
        Map<String, Double> carrospopulares1 = new LinkedHashMap<>(){{
            put("gol",14.4); put("uno", 15.6); put("mobi",  16.1);
            put("hb20", 14.5); put("kwid", 15.6);
        }};
        System.out.println(carrospopulares1);

        System.out.println("\t");
        System.out.println("Exiba o dicionario ordenado pelo modelo: ");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrospopulares1);
        System.out.println(carrosPopulares2);

        System.out.println("\t");
        System.out.println("Apague o dicionário de carros: ");
        carrospopulares.clear();
        System.out.println(carrospopulares);
        System.out.println("Está vazia: " + carrospopulares.isEmpty());

    }
}
