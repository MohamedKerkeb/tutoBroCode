package StaticKeyword;

public class Main {
    public static void main(String[] args) {
        /**
         * * static = modifier. a single copy of a variable/method is created and shared.
         * *          The class "owns" the static member
         */

        Friend friend1 = new Friend("Spongebob");
        Friend freind2 = new Friend("Patrick");
        Friend freind3 = new Friend("Patrick");
        Friend freind4 = new Friend("Patrick");


        //System.out.println(Friend.numberOfFriends);

        Friend.displayFriends();
    }
}
