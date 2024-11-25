public class Practice1 {
    public static void main(String[] args) {
        // 1. Операторы + и +=
        int num1 = 7;
        int num2 = 12;
        int result1 = num1 + num2;
        num1 += num2;
        System.out.println("Result1: " + result1 + ", Num1 after +=: " + num1);

        String text1 = "Good";
        String text2 = "Morning";
        String result2 = text1 + " " + text2;
        text1 += ", Everyone";
        System.out.println("Result2: " + result2 + ", Text1 after +=: " + text1);

        // 2. Операторы ==, != и =
        int val1 = 25;
        int val2 = 30;
        boolean areEqual = (val1 == val2);
        boolean areNotEqual = (val1 != val2);
        System.out.println("AreEqual: " + areEqual + ", AreNotEqual: " + areNotEqual);

        String string1 = "Java";
        String string2 = "Programming";
        boolean sameRef = (string1 == string2);
        boolean sameValue = string1.equals(string2);
        System.out.println("SameRef: " + sameRef + ", SameValue: " + sameValue);

        // 3. Тернарный оператор ? :
        int score = 75;
        String grade = (score >= 60) ? "Pass" : "Fail";
        System.out.println("Grade: " + grade);

        // 4. Логические операторы || и &&
        boolean isSunny = true;
        boolean isWarm = false;
        boolean goForAWalk = isSunny || isWarm;
        boolean havePicnic = isSunny && isWarm;
        System.out.println("GoForAWalk: " + goForAWalk + ", HavePicnic: " + havePicnic);

        // 5. Побитовые операторы |, ^, &
        int mask1 = 9;  // 1001
        int mask2 = 14; // 1110
        int bitwiseOr = mask1 | mask2;
        int bitwiseXor = mask1 ^ mask2;
        int bitwiseAnd = mask1 & mask2;
        System.out.println("BitwiseOr: " + bitwiseOr + ", BitwiseXor: " + bitwiseXor + ", BitwiseAnd: " + bitwiseAnd);

        // 6. Сравнительные операторы >, >=, <, <=
        int height1 = 180;
        int height2 = 175;
        boolean isTaller = height1 > height2;
        boolean isShorterOrEqual = height1 <= height2;
        System.out.println("IsTaller: " + isTaller + ", IsShorterOrEqual: " + isShorterOrEqual);

        // 7. Сдвиги >>, >>>, <<
        int data = 16; // 10000
        int shiftLeft = data << 2;
        int shiftRight = data >> 2;
        int unsignedShiftRight = data >>> 2;
        System.out.println("ShiftLeft: " + shiftLeft + ", ShiftRight: " + shiftRight + ", UnsignedShiftRight: " + unsignedShiftRight);

        // 8. Арифметические операторы +, -, *, /, %
        int numA = 21;
        int numB = 8;
        int sum = numA + numB;
        int difference = numA - numB;
        int product = numA * numB;
        int quotient = numA / numB;
        int remainder = numA % numB;
        System.out.println("Sum: " + sum + ", Difference: " + difference + ", Product: " + product + ", Quotient: " + quotient + ", Remainder: " + remainder);

        // 9. Префиксные и постфиксные ++, --
        int counter1 = 3;
        int newCounter1 = ++counter1;
        System.out.println("Counter1 after ++: " + counter1 + ", NewCounter1: " + newCounter1);

        int counter2 = 5;
        int oldCounter2 = counter2++;
        System.out.println("Counter2 after ++: " + counter2 + ", OldCounter2: " + oldCounter2);

        // 10. Группирующие операторы ( ) и [ ]
        int[] numbers = {10, 20, 30};
        int thirdElement = numbers[2];
        int sumOfElements = numbers[0] + numbers[1];
        System.out.println("ThirdElement: " + thirdElement + ", SumOfElements: " + sumOfElements);
    }
}
