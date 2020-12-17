//Made by Pranav Kambhampati

package LoginSystem;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CredentialStore {
    private static CredentialStore single_instance = null;
    private static HashMap<String, String> userCredentials = null;
    //Stack<String> usernames = new Stack<String>();
    //Queue<String> passwords = new LinkedList<String>();
    private CredentialStore() {
        userCredentials = new HashMap();
    }
    public static CredentialStore getInstance() {
        if (single_instance == null) {
            single_instance = new CredentialStore();
        }
        return single_instance;
    }
    public HashMap<String, String> getUserCredentials() {
        return userCredentials;
    }
    /*
    public void addstackusername(String arg){
        usernames.add(arg);
        System.out.println(usernames);
    }
     */

    /*
    public void addqueuepassword(String arg){
        passwords.add(arg);
        System.out.println(passwords);
    }
     */
    public void setUserCredentials(HashMap<String, String> userCredentials) {
        this.userCredentials = userCredentials;
    }
    public void addUserCredentials(String userName, String password) {
        userCredentials.put(userName, password);
    }

    public void removeUserCredentials(String userName, String password){
        userCredentials.remove(userName, password);
    }

    public String getUserPassword(String userName) {
        return userCredentials.get(userName);
    }
    
}
