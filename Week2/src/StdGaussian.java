public class StdGaussian {
    public static void main(String[] args) {
        double u = Math.random();
        double v = Math.random();
        double z = Math.sin(2*Math.PI*v) * Math.sqrt(-2*Math.log(u)/Math.log(Math.E));
        System.out.println(z);
    }
}
