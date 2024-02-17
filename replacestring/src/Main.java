public class Main {
    public static void main(String[] args) {
        String str="i am a man";
        str=str.replaceAll("\\s+","<-->");
        System.out.println(str);
    }
}