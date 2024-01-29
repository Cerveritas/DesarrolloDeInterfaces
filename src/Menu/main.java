package Menu;

import javax.swing.*;
import java.awt.*;

public class main {
    private JPanel mainPanel;
    private JPanel menuPanel;
    private JMenuBar menuBar;
    private JMenu menuFile;
    private JMenu menuEdit;
    private JMenu menuView;
    private JMenu manuNavigate;
    private JMenu menuCode;
    private JMenu menuAnalyze;
    private JMenu manuRefactor;
    private JMenu menuBuild;
    private JMenu menuRun;
    private JMenu menuTools;
    private JMenu manuVCS;
    private JMenu menuWindow;
    private JMenuItem menuItemNew;
    private JMenuItem menuItemOpen;
    private JMenuItem menuItemRecent;
    private JMenuItem menuItemCloseProject;
    private JMenuItem menuItemSettings;
    private JMenuItem menuItemProjectStructure;
    private JMenuItem menuItemFileProperties;
    private JMenuItem menuItemManageIDESettings;
    private JMenuItem menuItemNewProjectsSettings;
    private JMenuItem menuItemExport;
    private JMenuItem menuItemPrint;
    private JMenuItem menuItemAddtoFavorites;
    private JMenuItem menuItemPowerSaveMode;
    private JMenuItem menuItemExit;


    public static void main(String[] args) {
        JFrame frame = new JFrame("main");
        frame.setContentPane(new main().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setBounds(500,350,1100,500);





    }

    public void main(){

        menuItemCloseProject.getAccelerator();


    }

}
