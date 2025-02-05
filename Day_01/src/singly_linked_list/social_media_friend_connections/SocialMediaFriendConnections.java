package singly_linked_list.social_media_friend_connections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class SocialMediaFriendConnections {
    private UserNode head;

    public void addUser(int userId, String name, int age) {
        UserNode newUser = new UserNode(userId, name, age);
        if (head == null) {
            head = newUser;
        } else {
            UserNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newUser;
        }
    }

    public void addFriend(int userId1, int userId2) {
        UserNode user1 = findUserById(userId1);
        UserNode user2 = findUserById(userId2);

        if (user1 != null && user2 != null) {
            if (!user1.friendIds.contains(userId2)) {
                user1.friendIds.add(userId2);
            }
            if (!user2.friendIds.contains(userId1)) {
                user2.friendIds.add(userId1);
            }
        } else {
            System.out.println("One or both users not found!");
        }
    }

    public void removeFriend(int userId1, int userId2) {
        UserNode user1 = findUserById(userId1);
        UserNode user2 = findUserById(userId2);

        if (user1 != null && user2 != null) {
            user1.friendIds.remove((Integer) userId2);
            user2.friendIds.remove((Integer) userId1);
        } else {
            System.out.println("One or both users not found!");
        }
    }

    public void findMutualFriends(int userId1, int userId2) {
        UserNode user1 = findUserById(userId1);
        UserNode user2 = findUserById(userId2);

        if (user1 != null && user2 != null) {
            List<Integer> mutualFriends = new ArrayList<>();
            for (Integer friendId1 : user1.friendIds) {
                for (Integer friendId2 : user2.friendIds) {
                    if (friendId1.equals(friendId2)) {
                        mutualFriends.add(friendId1);
                    }
                }
            }
            System.out.println("Mutual friends: " + mutualFriends);
        } else {
            System.out.println("One or both users not found!");
        }
    }

    public void displayFriends(int userId) {
        UserNode user = findUserById(userId);

        if (user != null) {
            System.out.println("Friends of " + user.name + ": " + user.friendIds);
        } else {
            System.out.println("User not found!");
        }
    }

    public void searchUser(String nameOrId) {
        UserNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.name.equals(nameOrId) || Integer.toString(temp.userId).equals(nameOrId)) {
                System.out.println("User found: ID=" + temp.userId + ", Name=" + temp.name + ", Age=" + temp.age);
                found = true;
                break;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("User not found!");
        }
    }

    public void countFriends() {
        UserNode temp = head;
        while (temp != null) {
            System.out.println(temp.name + " has " + temp.friendIds.size() + " friends.");
            temp = temp.next;
        }
    }

    private UserNode findUserById(int userId) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.userId == userId) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
}
