public class Main_Vahe {
    static void a_full(int numberOfRows) {
        for (int i = 1; i <= numberOfRows; i++) {
            for (int j = numberOfRows; j >= i; j--) {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println();
    }

    static void a_empty(int numberOfRows) {
        for (int i = 1; i <= numberOfRows; i++) {
            if (i == 1) {
                for (int k = 1; k <= numberOfRows; k++) {
                    System.out.print('*');
                }
            } else {
                for (int j = numberOfRows; j >= i; j--) {
                    if (j == i || j == numberOfRows) {
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

    static void c_full(int numberOfRows) {
        for (int i = 1; i <= numberOfRows; i++) {
            for (int j = 1; j <= numberOfRows; j++) {
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

    static void d_full(int numberOfRows) {
        for (int i = 1; i <= numberOfRows; i++) {
            for (int j = 1; j <= i; j++) {
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

    static void f_full(int numberOfRows) {
        for (int i = 1; i <= numberOfRows; i++) {
            for (int j = numberOfRows; j > 0; j--) {
                if (j > i) {
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

    static void b_full(int numberOfRows) {
        for (int i = 1; i <= numberOfRows; i++) {
            for (int j = 1; j <= 2 * numberOfRows - 1; j++) {
                if (j >= numberOfRows - i + 1 && j <= numberOfRows + i - 1) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    static void b_empty() {
        for (int i = 1; i <= 3; i++) {
            if (i == 2) {
                for (int j = 1; j <= 5; j++) {
                    if (j % 2 == 0) {
                        System.out.print('*');
                    } else {
                        System.out.print(' ');
                    }
                }
                System.out.println();
            } else {
                for (int k = 1; k <= 5; k++) {
                    if (k >= 3 - i + 1 && k <= 3 + i - 1) {
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

    static void e_full(int numberOfRows) {
        for (int i = numberOfRows; i >= 1; i--) {
            for (int j = 1; j <= 2 * numberOfRows - 1; j++) {
                if (j >= numberOfRows - i + 1 && j <= numberOfRows + i - 1) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    static void e_empty() {
        for (int i = 3; i >= 1; i--) {
            if (i == 2) {
                for (int j = 1; j <= 5; j++) {
                    if (j % 2 == 0) {
                        System.out.print('*');
                    } else {
                        System.out.print(' ');
                    }
                }
                System.out.println();
            } else {
                for (int k = 1; k <= 5; k++) {
                    if (k >= 3 - i + 1 && k <= 3 + i - 1) {
                        System.out.print('*');
                    } else {
                        System.out.print(' ');
                    }
                }
                System.out.println();
            }
        }
    }

    static void g_full(int numberOfRows) {
        for (int i = 1; i <= 2 * numberOfRows - 1; i++) {
            for (int j = 0; j < numberOfRows; j++) {
                if (i >= numberOfRows - j && i <= numberOfRows + j) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    static void g_empty() {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                for (int j = 0; j < 3; j++) {
                    if (j % 2 == 0) {
                        System.out.print('*');
                    } else {
                        System.out.print(' ');
                    }
                }
                System.out.println();
            } else {
                for (int k = 0; k < 3; k++) {
                    if (i >= 3 - k && i <= 3 + k) {
                        System.out.print('*');
                    } else {
                        System.out.print(' ');
                    }
                }
                System.out.println();
            }
        }
    }

    static void h_full(int numberOfRows) {
        for (int i = 1; i <= 2 * numberOfRows - 1; i++) {
            for (int j = numberOfRows; j > 0; j--) {
                if (i >= numberOfRows - j + 1 && i <= numberOfRows + j - 1) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    static void h_empty() {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                for (int j = 0; j < 3; j++) {
                    if (j % 2 == 0) {
                        System.out.print('*');
                    } else {
                        System.out.print(' ');
                    }
                }
                System.out.println();
            } else {
                for (int j = 3; j > 0; j--) {
                    if (i >= 3 - j + 1 && i <= 3 + j - 1) {
                        System.out.print('*');
                    } else {
                        System.out.print(' ');
                    }
                }
                System.out.println();
            }
        }
    }



    public static void main(String[] args) {
        a_full(10);
        b_full(10);
        c_full(10);
        d_full(10);
        e_full(10);
        f_full(10);
        g_full(10);
        h_full(10);

        a_empty(10);
        b_empty();
        c_empty();
        d_empty();
        e_empty();
        f_empty();
        g_empty();
        h_empty();



    }
}

