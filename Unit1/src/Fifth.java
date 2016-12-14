class Fifth {

    public static void main(String[] args) {

        int x = 9;
        int y = 9;
        int[][] arr = new int[x][y];

        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
        }

        int z = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[z][i] = 1;
            z++;
        }
        for (int j = 0; j < arr.length; j++) { //столбцы
            for (int i = 0; i < arr.length; i++) { //строки
                System.out.print(arr[j][i] + " ");
            }
            System.out.println("");
        }
    }
}