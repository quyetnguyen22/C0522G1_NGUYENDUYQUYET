package extra.student_management.view;


import extra.student_management.controller.ManagementController;

import java.io.IOException;

public class View {
    public static void main(String[] args) {
        try {
            ManagementController.managementControl();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
