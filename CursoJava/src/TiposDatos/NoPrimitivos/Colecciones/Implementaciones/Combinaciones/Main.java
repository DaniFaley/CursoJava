package TiposDatos.NoPrimitivos.Colecciones.Implementaciones.Combinaciones;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // ✅ List<List<DataType>>
        // Lista que contiene listas
        List<List<Integer>> matriz = new ArrayList<>();
        matriz.add(Arrays.asList(1, 2, 3));
        matriz.add(Arrays.asList(4, 5, 6));
        System.out.println("Matriz: " + matriz);

        // ✅ List<Set<DataType>>
        // Lista que contiene conjuntos (sin duplicados)
        List<Set<String>> etiquetasPorPost = new ArrayList<>();
        etiquetasPorPost.add(new HashSet<>(Arrays.asList("java", "backend")));
        etiquetasPorPost.add(new HashSet<>(Arrays.asList("html", "css", "frontend")));
        System.out.println("Etiquetas por post: " + etiquetasPorPost);

        // ✅ List<Map<Key,Value>>
        // Lista de mapas
        List<Map<String, String>> personas = new ArrayList<>();
        Map<String, String> persona1 = new HashMap<>();
        persona1.put("nombre", "Daniel");
        persona1.put("ciudad", "Culiacán");
        personas.add(persona1);
        System.out.println("Personas: " + personas);

        // ✅ Set<List<DataType>>
        // Conjunto de listas
        Set<List<String>> combinaciones = new HashSet<>();
        combinaciones.add(Arrays.asList("Rojo", "Verde"));
        combinaciones.add(Arrays.asList("Azul", "Amarillo"));
        System.out.println("Combinaciones: " + combinaciones);

        // ✅ Set<Set<DataType>>
        // Conjunto de conjuntos
        Set<Set<Integer>> grupos = new HashSet<>();
        grupos.add(new HashSet<>(Arrays.asList(1, 2, 3)));
        grupos.add(new HashSet<>(Arrays.asList(4, 5, 6)));
        System.out.println("Grupos: " + grupos);

        // ✅ Set<Map<Key,Value>>
        // Conjunto de mapas
        Set<Map<String, String>> registros = new HashSet<>();
        Map<String, String> reg1 = new HashMap<>();
        reg1.put("usuario", "daniel");
        reg1.put("rol", "admin");
        registros.add(reg1);
        System.out.println("Registros: " + registros);

        // ✅ Map<Key, List<Value>>
        // Mapa que almacena listas
        Map<String, List<String>> grupoAlumnos = new HashMap<>();
        grupoAlumnos.put("Programación", Arrays.asList("Daniel", "Luis", "Pedro"));
        grupoAlumnos.put("Matemáticas", Arrays.asList("Ana", "Lucía"));
        System.out.println("Grupo de alumnos: " + grupoAlumnos);

        // ✅ Map<Key, Set<Value>>
        // Mapa que almacena conjuntos
        Map<String, Set<String>> etiquetasPorCategoria = new HashMap<>();
        etiquetasPorCategoria.put("Tecnología", new HashSet<>(Arrays.asList("java", "python")));
        etiquetasPorCategoria.put("Diseño", new HashSet<>(Arrays.asList("figma", "photoshop")));
        System.out.println("Etiquetas por categoría: " + etiquetasPorCategoria);

        // ✅ Map<Key, Map<Key2, Value2>>
        // Mapa que almacena mapas
        Map<String, Map<String, String>> ubicaciones = new HashMap<>();
        Map<String, String> lugar1 = new HashMap<>();
        lugar1.put("latitud", "24.8");
        lugar1.put("longitud", "-107.4");
        ubicaciones.put("Culiacán", lugar1);
        System.out.println("Ubicaciones: " + ubicaciones);

        // ✅ Map<List<Key>, Value>
        // Lista como clave
        Map<List<String>, Double> rutasConCosto = new HashMap<>();
        rutasConCosto.put(Arrays.asList("A", "B"), 15.5);
        rutasConCosto.put(Arrays.asList("B", "C"), 12.0);
        System.out.println("Rutas con costo: " + rutasConCosto);

        // ✅ Map<Set<Key>, Value>
        // Conjunto como clave
        Map<Set<String>, String> equipos = new HashMap<>();
        equipos.put(new HashSet<>(Arrays.asList("Pedro", "Juan")), "Equipo 1");
        equipos.put(new HashSet<>(Arrays.asList("Ana", "Luis")), "Equipo 2");
        System.out.println("Equipos: " + equipos);

        // ✅ Map<Key, List<Map<Key2, Value2>>>
        // Mapa que almacena listas de mapas
        Map<String, List<Map<String, Double>>> historialCompras = new HashMap<>();
        Map<String, Double> compra1 = new HashMap<>();
        compra1.put("Mouse", 299.99);
        Map<String, Double> compra2 = new HashMap<>();
        compra2.put("Teclado", 499.99);
        historialCompras.put("daniel", Arrays.asList(compra1, compra2));
        System.out.println("Historial de compras: " + historialCompras);

        // ✅ List<Map<Key, List<Value>>>
        // Lista de mapas con listas como valores
        List<Map<String, List<Double>>> productos = new ArrayList<>();
        Map<String, List<Double>> producto1 = new HashMap<>();
        producto1.put("Laptops", Arrays.asList(12500.0, 14500.0, 13500.0));
        productos.add(producto1);
        System.out.println("Productos con precios: " + productos);
    }
}