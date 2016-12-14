class Second {

    public static void main(String[] args) {


        int[] arrOrig = {7, 2, 9, 3, 10, 5, 1, 4, 6, 8};
        int[] arrRes = new int[arrOrig.length];

        int e = 10;

        for (int i = 0; i < arrOrig.length; i++) {

            if (1 / Math.pow((arrOrig[i] + 1), 2) < e) {

                arrRes[i] = arrOrig[i]; //записываем только те элементы, которые удовлетворяют условию
                System.out.println(arrRes[i]);
            }
        }

        int min = arrRes[0];

        for (int i = 0; i < arrRes.length; i++) { //?
            if (min > arrRes[i]) {
                int tmp = min;
                min = arrRes[i];
                arrRes[--i] = tmp;
            }

        }

        for (int i = 0; i < arrRes.length; i++) {
            if (arrRes[i] == min) {
                System.out.println("Номер минимального элемента со значением (" + min + "): " + i);
                break;
            } //else System.out.println(i + " Что-то пошло не так");
        }
    }
}
