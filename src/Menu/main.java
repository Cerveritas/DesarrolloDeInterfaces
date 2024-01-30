package Menu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    private JMenu gitMenu;
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
    private JMenuItem undoInsertComponentMenuItem;
    private JMenuItem redoMenuItem;
    private JMenuItem cutMenuItem;
    private JMenuItem copyMenuItem;
    private JMenuItem deleteMenuItem;
    private JMenuItem findMenuItem;
    private JMenuItem findUsageMenuItem;
    private JMenuItem selectAllMenuItem;
    private JMenuItem addCaretsToEndsMenuItem;
    private JMenuItem extendSelectionMenuItem;
    private JMenuItem shrinkSelectionMenuItem;
    private JMenuItem toggleCaseMenuItem;
    private JMenuItem joinLinesMenuItem;
    private JMenuItem dupicateLineOrSelectionMenuItem;
    private JMenuItem fillParagraphMenuItem;
    private JMenuItem sortLinesMenuItem;
    private JMenuItem reverseLinesMenuItem;
    private JMenuItem indetSelectionMenuItem;
    private JMenuItem unindentLineOrSelectionMenuItem;
    private JMenuItem convertIndentsMenuItem;
    private JMenuItem macrosMenuItem;
    private JMenuItem encondeXMLHMTLSpecialMenuItem;
    private JMenu helpMenu;
    private JMenuItem toolWindowsMenuItem;
    private JMenuItem appearanceMenuItem;
    private JMenuItem quickDefinitionMenuItem;
    private JMenuItem showSibilngsMenuItem;
    private JMenuItem quickTypeDefintionMenuItem;
    private JMenuItem toolbarMenuItem;
    private JMenuItem customizeMenusAndToolbarsMenuItem;
    private JMenuItem jumpToSourceMenuItem;
    private JMenuItem showSourceMenuItem;
    private JMenuItem recentFilesMenuItem;
    private JMenuItem recentylyChangedFilesMenuItem;
    private JMenuItem recentLocationsMenuItem;
    private JMenuItem recentChangesMenuItem;
    private JMenuItem compareWithMenuItem;
    private JMenuItem quickSwitchSchemeMenuItem;
    private JMenuItem resetFontSizeMenuItem;
    private JMenuItem bidiTextBaseDirectionMenuItem;
    private JMenuItem buildProjectMenuItem;
    private JMenuItem buildModuleDesarrolloDeMenuItem;
    private JMenuItem recompileMainFormMenuItem;
    private JMenuItem rebuildProjectMenuItem;
    private JMenuItem buildArtifactsMenuItem;
    private JMenuItem runAntTargetMenuItem;
    private JMenuItem runMainMenuItem;
    private JMenuItem debugMainMenuItem;
    private JMenuItem runMainWithCoverageMenuItem;
    private JMenuItem runMenuItem;
    private JMenuItem debugMenuItem;
    private JMenuItem profileMenuItem;
    private JMenuItem attachToProcessMenuItem;
    private JMenuItem editConfigurationsMenuItem;
    private JMenuItem stopMainMenuItem;
    private JMenuItem stopBackgroundProcessesMenuItem;
    private JMenuItem showRunningListMenuItem;
    private JMenuItem debuggingActionsMenuItem;
    private JMenuItem toggleBreackpointMenuItem;
    private JMenuItem viewBreakpointsMenuItem;
    private JMenuItem testHistoryMenuItem;
    private JMenuItem importTestsFromFileMenuItem;
    private JMenuItem showCoverageDataMenuItem;
    private JMenuItem storeCurrentLayoutAsMenuItem;
    private JMenuItem restoreDefaultLayoutMenuItem;
    private JMenuItem activeToolWindowMenuItem;
    private JMenuItem editorTabsMenuItem;
    private JMenuItem notificationsMenuItem;
    private JMenuItem backgroundTasksMenuItem;
    private JMenuItem nextProjectWindowMenuItem;
    private JMenuItem previoudProjectWindowMenuItem;
    private JMenuItem desarrolloDeInterfacesMenuItem;
    private JMenuItem commitMenuItem;
    private JMenuItem pushMenuItem;
    private JMenuItem updateProjectMenuItem;
    private JMenuItem pullMenuItem;
    private JMenuItem fetchMenuItem;
    private JMenuItem mergeMenuItem;
    private JMenuItem rebaseMenuItem;
    private JMenuItem branchesMenuItem;
    private JMenuItem newBranchMenuItem;
    private JMenuItem newTagMenuItem;
    private JMenuItem resetHEADMenuItem;
    private JMenuItem showGitLogMenuItem;
    private JMenuItem patchMenuItem;
    private JMenuItem uncommittedChangesMenuItem;
    private JMenuItem selectedFileMenuItem;
    private JMenuItem gitHubMenuItem;
    private JMenuItem manageRemotesMenuItem;
    private JMenuItem cloneMenuItem;
    private JMenuItem VCSOperationsMenuItem;
    private JMenuItem taskContextsMenuItem;
    private JMenuItem codeWithMeMenuItem;
    private JMenuItem generateJavaDocMenuItem;
    private JMenuItem XMLActionsMenuItem;
    private JMenuItem markdownConverterMenuItem;
    private JMenuItem openQodanaAnalysisReportMenuItem;
    private JMenuItem APGUpgradeAssistantMenuItem;
    private JMenuItem managePythonPackagesMenuItem;
    private JMenuItem runSetupPyTaskMenuItem;
    private JMenuItem createSetuoPyMenuItem;
    private JMenuItem sysncPythonRequirementsMenuItem;
    private JMenuItem pythonOrDebugConsoleMenuItem;
    private JMenuItem spaceMenuItem;
    private JMenuItem groovyConsoleMenuItem;
    private JMenuItem kotlinMenuItem;
    private JMenuItem JShellConsoleMenuItem;
    private JMenuItem aboutMenuItem;
    private JMenuItem registerPluginsMenuItem;
    private JMenuItem checkForUpdatesMenuItem;
    private JMenuItem editCustomVMOptionsMenuItem;
    private JMenuItem editCustomPropertiesMenuItem;
    private JMenuItem changeMemorySettingsMenuItem;
    private JMenuItem diagnosticToolsMenuItem;
    private JMenuItem deleteLeftoverIDEDirectoriesMenuItem;
    private JMenuItem collectLogsAndDiagnosticMenuItem;
    private JMenuItem showLogInExplorerMenuItem;
    private JMenuItem submitFeedbackMenuItem;
    private JMenuItem contactSupportMenuItem;
    private JMenuItem submitABugReportMenuItem;
    private JMenuItem myProductivityMenuItem;
    private JMenuItem tipOdTheDayMenuItem;
    private JMenuItem keyboardShortcutsPDFMenuItem;
    private JMenuItem intelliJIDEAOnYouTubeMenuItem;
    private JMenuItem gettingStartedMenuItem;
    private JMenuItem whatSNewInMenuItem;
    private JMenuItem learnIDEFeaturesMenuItem;
    private JMenuItem helpMenuItem;
    private JMenuItem findActionMenuItem;
    private JButton buttonLinea;
    private JButton ButtonCuadrado;
    private JButton ButtonX;
    private JMenuItem stackTraceOrThreadMenuItem;
    private JMenuItem dataFlowFromHereMenuItem;
    private JMenuItem dataFlowToHereMenuItem;
    private JMenuItem cyclicDependenciesMenuItem;
    private JMenuItem moduleDependenciesMenuItem;
    private JMenuItem backwarsDependenciesMenuItem;
    private JMenuItem dependenciesMenuItem;
    private JMenuItem inferAnnotationsMenuItem;
    private JMenuItem inferNullityMenuItem;
    private JMenuItem viewOfflineInspectionResultsMenuItem;
    private JMenuItem configureCurrentFileAnalysisMenuItem;
    private JMenuItem runInspectionByNameMenuItem;
    private JMenuItem sielentCodeCleanupMenuItem;
    private JMenuItem codeCleanupMenuItem;
    private JMenuItem inspectCodeMenuItem;
    private JMenuItem bookmarksMenuItem;
    private JMenuItem callHierarchyMenuItem;
    private JMenuItem upTheStackTraceMenuItem;
    private JMenuItem callHierarchyMenuItem1;
    private JMenuItem methodHierarchyMenuItem;
    private JMenuItem typeHierarchyMenuItem;
    private JMenuItem filePathMenuItem;
    private JMenuItem fileStructureMenuItem;
    private JMenuItem relatedSymbolMenuItem;
    private JMenuItem testMenuItem;
    private JMenuItem superMethodMenuItem;
    private JMenuItem typeDeclarationMenuItem;
    private JMenuItem implementationSMenuItem;
    private JMenuItem declarationOrUsagesMenuItem;
    private JMenuItem jumpToNavigationBarMenuItem;
    private JMenuItem selectInMenuItem;
    private JMenuItem navigateInFileMenuItem;
    private JMenuItem nextEditLocationMenuItem;
    private JMenuItem lastEditLocationMenuItem;
    private JMenuItem previousHighlightedErrorMenuItem;
    private JMenuItem nextHighlightedErrorMenuItem;
    private JMenuItem lineColumnMenuItem;
    private JMenuItem symbolMenuItem;
    private JMenuItem fileMenuItem;
    private JMenuItem classMenuItem;
    private JMenuItem searchEverywhereMenuItem;
    private JMenuItem forwardMenuItem;
    private JMenuItem backMenuItem;
    private JMenuItem convertJavaFileToMenuItem;
    private JMenuItem generateModuleInfoDescriptorsMenuItem;
    private JMenuItem updateCopyrightMenuItem;
    private JMenuItem moveLineUpMenuItem;
    private JMenuItem moveLineDownMenuItem;
    private JMenuItem moveElementRightMenuItem;
    private JMenuItem moveElementLeftMenuItem;
    private JMenuItem moveStatementUpMenuItem;
    private JMenuItem moveStatementDownMenuItem;
    private JMenuItem rearrangeCodeMenuItem;
    private JMenuItem optimizeImportsMenuItem;
    private JMenuItem autoIndentLinesMenuItem;
    private JMenuItem reformatFileMenuItem;
    private JMenuItem reformatCodeMenuItem;
    private JMenuItem commentWithBlockCommentMenuItem;
    private JMenuItem commentWithLineCommentMenuItem;
    private JMenuItem foldingMenuItem;
    private JMenuItem unwrapRemoveMenuItem;
    private JMenuItem surroundWithMenuItem;
    private JMenuItem insertLiveTemplateMenuItem;
    private JMenuItem codeCompletionMenuItem;
    private JMenuItem generateMenuItem;
    private JMenuItem delegateMethodsMenuItem;
    private JMenuItem implementMethodsMenuItem;
    private JMenuItem overrideMethodsMenuItem;
    private JMenuItem addRightToLeftMenuItem;
    private JMenuItem migrateToAndroidXMenuItem;
    private JMenuItem internationalizeMenuItem;
    private JMenuItem migrateMenuItem;
    private JMenuItem generefyMenuItem;
    private JMenuItem replaceConstructorWithBuilderMenuItem;
    private JMenuItem replaceConstructorWithFactoryMenuItem;
    private JMenuItem replaceTempWithQueryMenuItem;
    private JMenuItem encapsuleFieldsMenuItem;
    private JMenuItem wrapMethodReturnValueMenuItem;
    private JMenuItem removeMiddlemanMenuItem;
    private JMenuItem replaceInheritanceWithDelegationMenuItem;
    private JMenuItem useInterfaceWherePossibleMenuItem;
    private JMenuItem pushMemebersDownMenuItem;
    private JMenuItem pullMembersUpMenuItem;
    private JMenuItem invertBooleanMenuItem;
    private JMenuItem fidnAndReplaceCodeMenuItem;
    private JMenuItem inlineMenuItem;
    private JMenuItem extractIntroduceMenuItem;
    private JMenuItem safeDeleteMenuItem;
    private JMenuItem copyClassMenuItem;
    private JMenuItem moveMembersMenuItem;
    private JMenuItem convertToInstanceMethodMenuItem;
    private JMenuItem makeStaticMenuItem;
    private JMenuItem typeMigrationMenuItem;
    private JMenuItem editPropertyValueMenuItem;
    private JMenuItem changeSignatureMenuItem;
    private JMenuItem renameFileMenuItem;
    private JMenuItem renameMenuItem;
    private JMenuItem refactorThisMenuItem;


    public static void main(String[] args) {
        JFrame frame = new JFrame("main");
        frame.setUndecorated(true);
        frame.setContentPane(new main().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setBounds(500,350,1000,500);




    }





    // CONSTRUCTOR
    public main() {



        // Opciones desactivadas
        encondeXMLHMTLSpecialMenuItem.setEnabled(false);

        // Funcionalidad de los botones

            /* boton linea */
            buttonLinea.setBorder(null); // con el setBorder() quitamos el borde al boton
            buttonLinea.setFocusPainted(false); // con el setFocusPainted() quitamos cualquier marca al hacer click en el boton
            buttonLinea.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {


                }
            });

            /* boton cuadrado */
            ButtonCuadrado.setBorder(null);
            ButtonCuadrado.setFocusPainted(false);
            ButtonCuadrado.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {


                }
            });

            /* boton x */
            ButtonX.setBorder(null);
            ButtonX.setFocusPainted(false);
            ButtonX.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            });

        // Funcionamiento para FILE -> EXIT
        menuItemExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println("Saliendo del programa...");
                System.out.println("\n"+
                        "░██████╗░██████╗░░█████╗░░█████╗░██╗░█████╗░░██████╗  ██████╗░░█████╗░██████╗░\n"+
                        "██╔════╝░██╔══██╗██╔══██╗██╔══██╗██║██╔══██╗██╔════╝  ██╔══██╗██╔══██╗██╔══██╗\n"+
                        "██║░░██╗░██████╔╝███████║██║░░╚═╝██║███████║╚█████╗░  ██████╔╝██║░░██║██████╔╝\n"+
                        "██║░░╚██╗██╔══██╗██╔══██║██║░░██╗██║██╔══██║░╚═══██╗  ██╔═══╝░██║░░██║██╔══██╗\n"+
                        "╚██████╔╝██║░░██║██║░░██║╚█████╔╝██║██║░░██║██████╔╝  ██║░░░░░╚█████╔╝██║░░██║\n"+
                        "░╚═════╝░╚═╝░░╚═╝╚═╝░░╚═╝░╚════╝░╚═╝╚═╝░░╚═╝╚═════╝░  ╚═╝░░░░░░╚════╝░╚═╝░░╚═╝\n"+

                        "██╗░░░██╗░██████╗░█████╗░██████╗░\n"+
                        "██║░░░██║██╔════╝██╔══██╗██╔══██╗\n"+
                        "██║░░░██║╚█████╗░███████║██████╔╝\n"+
                        "██║░░░██║░╚═══██╗██╔══██║██╔══██╗\n"+
                        "╚██████╔╝██████╔╝██║░░██║██║░░██║\n"+
                        "░╚═════╝░╚═════╝░╚═╝░░╚═╝╚═╝░░╚═╝");
                System.exit(0);




            }

        });

    }


}

