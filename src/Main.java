public class Main {
    public static void main(String[] args) {

        HelloSwing form = new HelloSwing();

        form.setContentPane(form.panel1);

        form.setTitle("Hello Panel");
        form.setSize(500,500);
        form.setVisible(true);


    }
}