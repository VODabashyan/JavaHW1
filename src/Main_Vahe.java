public class Main_Vahe {
    static void a_full() {
        for (int i = 0; i < 4; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println();
    }

    static void a_empty() {
        for (int i = 1; i <= 4; i++) {
            if (i == 1) {
                for (int k = 1; k <= 4; k++) {
                    System.out.print('*');
                }
            } else {
                for (int j = 4; j >= i; j--) {
                    if (j == i || j == 4) {
                        System.out.print('*');
                    } else {
                        System.out.print(' ');
                    }
                }

            }
            System.out.println();
        }
        System.out.println();
    }

    static void c_full() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j >= i) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    static void c_empty() {
        for (int i = 1; i <= 4; i++) {
            if (i == 2) {
                for (int j = 1; j <= 4; j++) {
                    if (j % 2 == 0) {
                        System.out.print('*');
                    } else {
                        System.out.print(' ');
                    }
                }
                System.out.println();
            } else {
                for (int k = 1; k <= 4; k++) {
                    if (k >= i) {
                        System.out.print('*');
                    } else {
                        System.out.print(' ');
                    }
                }
                System.out.println();
            }
        }
        System.out.println();
    }

    static void d_full() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println();
    }

    static void d_empty() {
        for (int i = 1; i <= 4; i++) {
            if (i == 3) {
                for (int j = 1; j <= 4; j++) {
                    if (j % 2 != 0) {
                        System.out.print('*');
                    } else {
                        System.out.print(' ');
                    }
                }
                System.out.println();
            } else {
                for (int k = 1; k <= 4; k++) {
                    if (k <= i) {
                        System.out.print('*');
                    }
                }
                System.out.println();
            }
        }
        System.out.println();
    }

    static void f_full() {
        for (int i = 0; i < 4; i++) {
            for (int j = 4; j > 0; j--) {
                if (j - 1 > i) {
                    System.out.print(' ');
                } else {
                    System.out.print('*');
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    static void f_empty() {
        for (int i = 1; i <= 4; i++) {
            if (i == 3) {
                for (int j = 1; j <= 4; j++) {
                    if (j % 2 == 0) {
                        System.out.print('*');
                    } else {
                        System.out.print(' ');
                    }
                }
                System.out.println();
            } else {
                for (int k = 4; k > 0; k--) {
                    if (k - 1 >= i) {
                        System.out.print(' ');
                    } else {
                        System.out.print('*');
                    }
                }
                System.out.println();
            }
        }
        System.out.println();
    }


    public static void main(String[] args) {
        a_full();
        a_empty();
        d_full();
        d_empty();
        c_full();
        c_empty();
        f_full();
        f_empty();
    }
}
