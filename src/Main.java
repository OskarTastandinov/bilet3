public class Main {
    public static void main(String args[]){
        String String = "ono";
        StringBuffer buffer = new StringBuffer(String);
        buffer.reverse();
        String Slovo = buffer.toString();
        if(String.equals(Slovo)){
            System.out.println("Слово: " + String + " является полидромом");
        }else{
            System.out.println("Слово: " + String + " не является полидромом");
        }
    }
}
