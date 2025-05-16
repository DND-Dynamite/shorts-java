interface S0009_Console {

    public static void main(String[] args) {
        var console = System.console();
        console.printf(">");
        var input = console.readLine();
        console.printf("echo " + input);
    }

}
