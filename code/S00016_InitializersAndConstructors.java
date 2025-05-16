public class S00016_InitializersAndConstructors {
    
    public S00016_InitializersAndConstructors() {
        System.out.println("parameterless");
    }

    public S00016_InitializersAndConstructors(String name) {
        System.out.println(name);
    }

    {
        System.out.println("shared code");
    }
  

    public static void main(String[] args) {
        new S00016_InitializersAndConstructors();
        new S00016_InitializersAndConstructors("with parameter");
    }
}
