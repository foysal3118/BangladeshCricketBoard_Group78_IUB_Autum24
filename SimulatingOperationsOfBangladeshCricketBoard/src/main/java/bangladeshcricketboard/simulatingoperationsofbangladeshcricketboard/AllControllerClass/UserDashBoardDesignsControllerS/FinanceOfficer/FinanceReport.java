package bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.AllControllerClass.UserDashBoardDesignsControllerS.FinanceOfficer;

public class FinanceReport {
    private String category;
    private String projectId;
    private String projectName;
    private String selectId;
    private String totalBudget;

    public FinanceReport(String selectId, String projectName, String projectId, String category, String totalBudget) {
        this.selectId = selectId;
        this.projectName = projectName;
        this.projectId = projectId;
        this.category = category;
        this.totalBudget = totalBudget;
    }

    public String getCategory() {
        return category;
    }

    public String getProjectId() {
        return projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public String getSelectId() {
        return selectId;
    }

    public String getTotalBudget() {
        return totalBudget;
    }

}
