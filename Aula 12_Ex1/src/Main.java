
public static void main(String[] args) {
    List<Double> listadouble = new ArrayList<>();
    listadouble.add(5.0);
    listadouble.add(3.0);
    listadouble.add(4.7);
    listadouble.add(4.4);
    listadouble.add(2.3);

    Collections.sort(listadouble);

    for(double numero : listadouble) {
        System.out.println(numero);
    }
}