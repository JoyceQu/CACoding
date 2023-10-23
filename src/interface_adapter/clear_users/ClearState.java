package interface_adapter.clear_users;

// TODO Complete me

public class ClearState {
    private String message = null;
    public ClearState(ClearState copy) {
        this.message = copy.message;
    }

    public ClearState() {}

    public String getMessage() {
        return message;
    }

    public void setMessage(String[] usernames) {
        // convert usernames to a string where each username is on a new line
        if (usernames.length > 0) {
            message = "";
            for (String username : usernames) {
                message += username + "\n";
            }
        } else {
            message = "No users!";
        }
        System.out.println(message);
    }
}
