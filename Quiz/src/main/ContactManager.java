package main;

public class ContactManager {
    public Contact[] myFriends;
    public int friendsCount;


    public ContactManager(){
        myFriends = new Contact[500];
        friendsCount = 0;
    }


    public void addContact(Contact contact){
        myFriends[friendsCount] = contact;
        friendsCount++;
    }

    public Contact searchContact(String searchName){
        for(int i=0; i<friendsCount; i++){
            if(myFriends[i].getNama().equals(searchName)){
                return myFriends[i];
            }
        }
        return null;
    }
}
