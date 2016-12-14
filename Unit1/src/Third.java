class Third {
    public static void main(String[] args) {


        int a = 2; //отрезок от a до b
        int b = 12;

        int h = 1; //шаг на отрезке

        int e = ((b - a) / h) + 1; //кол-во точек отрезка (11)

        int[] arr = new int[e];

        for (int i = 0; i < arr.length; i++) {

            double fX = Math.tan(2 * a) - 3;

            System.out.println(a + "\t" + fX);
            a = a + h;
        }
    }
}
