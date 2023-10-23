package use_case.clear_users;

public class ClearInteractor implements ClearInputBoundary{
    final ClearUserDataAccessInterface userDataAccessObject;
    final  ClearOutputBoundary clearPresenter;

    public ClearInteractor(ClearUserDataAccessInterface clearUserDataAccessInterface, ClearOutputBoundary clearOutputBoundary) {
        this.userDataAccessObject = clearUserDataAccessInterface;
        this.clearPresenter = clearOutputBoundary;
    }

    @Override
    public void execute() {
        String[] usernames = userDataAccessObject.clear();
        ClearOutputData clearOutputData = new ClearOutputData(usernames);
        clearPresenter.prepareSuccessView(clearOutputData);
    }
}
