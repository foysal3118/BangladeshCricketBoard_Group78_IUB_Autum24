package bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.AllControllerClass.UserDashBoardDesignsControllerS.FinanceOfficer;

public class SponserDetails {
    private String Name;
    private String Company;
    private String StartingDate;
    private String EndDate;
    private String Ammount;
    private String Id;

    public SponserDetails(String name, String company, String ammount, String startingDate, String endDate, String id) {
        this.Id = id;
        this.Name = name;
        this.Company = company;
        this.Ammount = ammount;
        this.StartingDate = startingDate;
        this.EndDate = endDate;
    }

    public SponserDetails(String id, String name, String ammount, String startingDate) {
        this.Id = id;
        this.Name = name;
        this.Ammount = ammount;
        this.StartingDate = startingDate;
    }

    public String getName() {
        return Name;
    }

    public String getCompany() {
        return Company;
    }

    public String getStartingDate() {
        return StartingDate;
    }

    public String getEndDate() {
        return EndDate;
    }

    public String getAmmount() {
        return Ammount;
    }

    public String getId() {
        return Id;
    }
}
