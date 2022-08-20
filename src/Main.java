import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ScannerException {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String output = calc(input);
        System.out.println(output);
    }
    public static String calc(String input) throws ScannerException {
        String[] mas = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
        String str = input.trim();
        if (!str.matches("\\w+\\s[+\\-*/]\\s\\w+")) {
            throw new ScannerException("Пожалуйста, вводите правильно: 'число от 1 до 10' 'мат.оператор' 'число от 1 до 10' и используйте одну систему счисления");
        }
        String[] words = str.split(" ");
        String a = words[0];
        String b = words[2];
        String c = words[1];
        int i1 = 0;
        int i2 = 0;
        if (a.matches("[IVX][IVX]?[IVX]?") && b.matches("[IVX][IVX]?[IVX]?") && c.matches("[+\\-*/]")) {
            for (int i = 0; i<9; i++) {
                if (a.equals(mas[i]))
                    i1 = i + 1;
                if (b.equals(mas[i])) {
                    i2 = i + 1;
                }
            }
            if (i1!=0 && i2 != 0) {
                int i3 = 0;
                if (c.equals("+")) {
                    i3 = i1 + i2;
                } else if (c.equals("-")) {
                    i3 = i1 - i2;
                } else if (c.equals("*")) {
                    i3 = i1 * i2;
                } else if (c.equals("/")) {
                    i3 = i1 / i2;
                }
                if (i3>=1 && i3<=100){
                str = mas[i3-1];
                }else {
                    throw new ScannerException("В римской системе нет нуля и отрицательных чисел");
                }
            }else {
                throw new ScannerException("Вы ввели числа не от I до X");
            }
        } else if (((a.matches("[1-9]")) || (a.equals("10"))) && ((b.matches("[1-9]")) || (b.equals("10"))) && c.matches("[+\\-*/]")) {
            int k1 = Integer.parseInt(a);
            int k2 = Integer.parseInt(b);
            int k3 = 0;
            if (c.equals("+")) {
                k3 = k1 + k2;
            } else if (c.equals("-")) {
                k3 = k1 - k2;
            } else if (c.equals("*")) {
                k3 = k1 * k2;
            } else if (c.equals("/")) {
                k3 = k1 / k2;
            }
            str = String.valueOf(k3);
        } else {
            throw new ScannerException("Пожалуйста, вводите правильно: 'число от 1 до 10' 'мат.оператор' 'число от 1 до 10' и используйте одну систему счисления");
        }
        return str;
    }
}

