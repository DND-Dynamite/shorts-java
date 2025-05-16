public class S00014_Autoclosable {

    public static void main(String[] args) {

        try (var obj = new MyResource()) {
            obj.doSomething();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

class MyResource implements AutoCloseable {

    @Override
    public void close() {
        System.out.println("closing");
    }

    public void doSomething() {
        System.out.println("hey, there ...");
    }

}