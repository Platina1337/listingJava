package list2;

public class ScopeDemo {
    public static void main(String[] args) {
        int x;
        x = 1;
        System.out.println("До вложенного блока: x =" + x);
        {
            int y = 3;
            x = y * 3;
        }

    }
}
