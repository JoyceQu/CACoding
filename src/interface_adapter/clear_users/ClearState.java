package interface_adapter.clear_users;

public class ClearState {
    private String[] usernames = null;
    public ClearState(ClearState copy) {
        this.usernames = copy.usernames;
    }

    public ClearState() {}

    public String[] getUsernames() {
        return usernames;
    }

    public void setUsernames(String[] usernames) {
        this.usernames = usernames;
    }

    public String getMessage() {
        String message = "";
        // convert usernames to a string where each username is on a new line
        if (usernames.length > 0) {
            for (String username : usernames) {
                message += username + "\n";
            }
        } else {
            message = ClearViewModel.NO_USER_LABLE;
        }
        return message;
    }
}
