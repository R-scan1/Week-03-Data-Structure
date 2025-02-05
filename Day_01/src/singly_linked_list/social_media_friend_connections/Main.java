package singly_linked_list.social_media_friend_connections;

public class Main {
    public static void main(String[] args) {
        SocialMediaFriendConnections smfc = new SocialMediaFriendConnections();

        smfc.addUser(1, "Raj", 23);
        smfc.addUser(2, "Manish", 21);
        smfc.addUser(3, "Arpita", 20);

        smfc.addFriend(1, 2);
        smfc.addFriend(1, 3);

        smfc.displayFriends(1);
        smfc.displayFriends(2);

        smfc.findMutualFriends(1, 2);

        smfc.searchUser("Raj");
        smfc.searchUser("3");

        smfc.countFriends();

        smfc.removeFriend(1, 2);

        smfc.displayFriends(1);
        smfc.displayFriends(2);
    }
}
