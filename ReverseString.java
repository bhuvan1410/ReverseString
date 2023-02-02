public class ReverseString {

    public static void reverseString(char[] s) {
        int length = s.length - 1;
        int i = 0;
        char swap = ' ';

        while (i < length) {
            swap = s[i];
            s[i] = s[length];
            s[length] = swap;

            i++;
            length--;

        }

    }

    public static void main(String[] args) {
        char[] array1 = new char[5];

        array1[0] = 'H';
        array1[1] = 'e';
        array1[2] = 'l';
        array1[3] = 'l';
        array1[4] = '0';

        char[] array2 = new char[6];

        array2[0] = 'B';
        array2[1] = 'h';
        array2[2] = 'u';
        array2[3] = 'v';
        array2[4] = 'a';
        array2[5] = 'n';

        System.out.print("The first array is: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array2[i] + ",");
        }

        System.out.println();

        System.out.print("The second array is: ");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + ",");
        }

        System.out.println();
        reverseString(array1);
        reverseString(array2);

        System.out.print("The first array after reversing is: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + ",");
        }

        System.out.println();

        System.out.print("The second array after reversing is: ");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + ",");
        }

    }

}
