package part_2_readable_good;

import java.util.Scanner;

public class ProjectController {
    // Properties
    private final ProjectModel model;
    private final ProjectView view;
    private final Scanner scanner;

    // Constructor
    public ProjectController(ProjectModel model, ProjectView view) {
        this.model = model;
        this.view = view;
        this.scanner = new Scanner(System.in);
    }

    // Public
    public void requestInput() {
        String input = scanner.nextLine().trim();

        try {
            int selectedOption = Integer.parseInt(input);

            model.handleOption(selectedOption);
        }
        catch (NumberFormatException | IndexOutOfBoundsException exception) {
            view.showError();
        }

        view.updateView(model.getCurrencyIndex());
        requestInput();
    }
}
