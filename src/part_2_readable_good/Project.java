package part_2_readable_good;

public class Project {
    // Constructor
    public Project() {
        ProjectModel model = new ProjectModel();
        ProjectView view = new ProjectView(model.getSelectedCurrencyIndex());
        ProjectController controller = new ProjectController(model, view);

        controller.requestInput();
    }
}
