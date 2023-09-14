public class TestAuthor {
    public static void main(String[] args) {
        Author sk = new Author("Stephen King", "stephen.king@gmail.com", 'M');
        System.out.println(sk);
        sk.setEmail("not.stephan.king@yahoo.com");
        System.out.println(sk);
        System.out.println(sk.getGender());
    }
}
