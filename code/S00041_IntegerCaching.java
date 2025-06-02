interface S00041_IntegerCaching {

    static void main(String... args) {
        var number = 128;
        var first = Integer.valueOf(number);
        var another = Integer.valueOf(number);

        // objects are not equal
        if (first == another)
            System.out.println("%1$d == %1$d".formatted(first));
        else
            System.out.println("%1$d != %1$d".formatted(first));
        // only equal by .equals operator
        if (first.equals(another))
            System.out.println("%1$d == %1$d".formatted(first));
        else
            System.out.println("%1$d != %1$d".formatted(first));
    }
}
