public class AccessModifierExample {
    private String privateField = "Private Field";
    protected String protectedField = "Protected Field";
    public String publicField = "Public Field";
    String defaultField = "Default Field"; // package-private

    private void privateMethod() {
        System.out.println("This is a private method.");
    }

    protected void protectedMethod() {
        System.out.println("This is a protected method.");
    }

    public void publicMethod() {
        System.out.println("This is a public method.");
    }

    void defaultMethod() {
        System.out.println("This is a default (package-private) method.");
    }

    public static void main(String[] args) {
        AccessModifierExample example = new AccessModifierExample();

        // Accessing fields
        System.out.println(example.privateField);
        System.out.println(example.protectedField);
        System.out.println(example.publicField);
        System.out.println(example.defaultField);

        // Accessing methods
        example.privateMethod();
        example.protectedMethod();
        example.publicMethod();
        example.defaultMethod();
    }
}
