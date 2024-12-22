public class Practice2 {
    public static void main(String[] args) {
        // Исходная строка
        String str = "Animals";

        // 1. String -> StringBuffer
        StringBuffer stringBuffer = new StringBuffer(str);
        System.out.println("StringBuffer из String: " + stringBuffer);

        // 2. String -> StringBuilder
        StringBuilder stringBuilder = new StringBuilder(str);
        System.out.println("StringBuilder из String: " + stringBuilder);

        // 3. StringBuffer -> String
        String strFromBuffer = stringBuffer.toString();
        System.out.println("String из StringBuffer: " + strFromBuffer);

        // 4. StringBuilder -> String
        String strFromBuilder = stringBuilder.toString();
        System.out.println("String из StringBuilder: " + strFromBuilder);

        // 5. StringBuffer -> StringBuilder
        StringBuilder builderFromBuffer = new StringBuilder(stringBuffer);
        System.out.println("StringBuilder из StringBuffer: " + builderFromBuffer);

        // 6. StringBuilder -> StringBuffer
        StringBuffer bufferFromBuilder = new StringBuffer(stringBuilder);
        System.out.println("StringBuffer из StringBuilder: " + bufferFromBuilder);
    }
}