import java.net.URLClassLoader;

class Test {
    public void test(URLClassLoader loader) {
        loader.getResourceAsStream("test").toString();
    }
}
