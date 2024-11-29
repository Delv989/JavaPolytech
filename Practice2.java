public class Practice2 {
    public static void main(String[] args) {
        Boolean bool1 = Boolean.TRUE;
        Boolean bool2 = Boolean.FALSE;
        Boolean bool3 = Boolean.valueOf("true");  // true (регистр игнорируется)
        Boolean bool4 = Boolean.valueOf("TrUe"); // true
        Boolean bool5 = Boolean.valueOf("false");// false
        Boolean bool6 = Boolean.valueOf("yes");  // false (неверное значение)
        Boolean bool7 = true;
        Boolean bool8 = false;

    }
}
