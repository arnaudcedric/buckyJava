package buckyjava.T38_public_private_this;

public class Apples {

    public static void main(String[] args) {
        Tuna tunaObject = new Tuna();
        System.out.println(tunaObject.toMillitary());
        tunaObject.setTime(13,10,50);
        System.out.println(tunaObject.toMillitary());
        System.out.println(tunaObject.toString());



    }

}
