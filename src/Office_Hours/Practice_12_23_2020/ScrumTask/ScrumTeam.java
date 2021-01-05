package Office_Hours.Practice_12_23_2020.ScrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    private ProductOwner productOwner; // Scrum team HAS A Product Owner
    private ScrumMaster scrumMaster;  // Scrum team HAS A Scrum Master
    private BusynessAnalyst busynessAnalyst;  // Scrum team HAS A Business Analyst

    public ArrayList<Tester> testers = new ArrayList<>(); // Scrum team HAS Testers
    public ArrayList<Developer> developers = new ArrayList<>(); // Scrum team HAS Developers

    public ScrumTeam(ProductOwner productOwner) {
       setProductOwner(productOwner);
    }

    public ScrumTeam(ProductOwner productOwner, ScrumMaster scrumMaster) {
        this(productOwner);
        //this.scrumMaster = scrumMaster;
        setScrumMaster(scrumMaster);
    }

    public ScrumTeam(ProductOwner productOwner, ScrumMaster scrumMaster, BusynessAnalyst busynessAnalyst) {
        this(productOwner, scrumMaster);
        setBusynessAnalyst(busynessAnalyst);
    }

    public ScrumTeam(ScrumMaster scrumMaster, ProductOwner productOwner) {
       this(productOwner);
       setScrumMaster(scrumMaster);
    }

    public void addTester(Tester tester) {
        testers.add(tester);
    }

    public void addDeveloper(Developer developer) {
        developers.add(developer);
    }


    public void addTester(Tester[] testers) {
         this.testers.addAll(Arrays.asList(testers));  //this is easier way or use for each

//        for (Tester eachTester : testers){
//            addTester(eachTester);
//        }

    }

    public void addDeveloper(Developer[] developers){
       // for(Developer eachDeveloper : developers) addDeveloper(eachDeveloper);

        this.developers.addAll(Arrays.asList(developers));

    }

    public void removeTester(String ID){
        testers.removeIf(p->p.ID.equals(ID));
    }

    public void removeDeveloper(String ID){
        developers.removeIf(p->p.ID.equals(ID));
    }




    public ProductOwner getProductOwner() {
        return productOwner;
    }


    public void setProductOwner(ProductOwner productOwner) {
        this.productOwner = productOwner;
    }

    public ScrumMaster getScrumMaster() {
        return scrumMaster;
    }

    public void setScrumMaster(ScrumMaster scrumMaster) {
        this.scrumMaster = scrumMaster;
    }

    public BusynessAnalyst getBusynessAnalyst() {
        return busynessAnalyst;
    }

    public void setBusynessAnalyst(BusynessAnalyst busynessAnalyst) {
        this.busynessAnalyst = busynessAnalyst;
    }

    public ArrayList<Tester> getTesters() {
        return testers;
    }

    public void setTesters(ArrayList<Tester> testers) {
        this.testers = testers;
    }

    public ArrayList<Developer> getDevelopers() {
        return developers;
    }

    public void setDevelopers(ArrayList<Developer> developers) {
        this.developers = developers;
    }

    @Override
    public String toString() {
        return "ScrumTeam{" +
                "productOwner= " + productOwner.name +// or getProductOwner.name
                ", scrumMaster= " + scrumMaster.name +
                ", busynessAnalyst= " + busynessAnalyst.name +
                ", testers= " + testers.size() +
                ", developers= " + developers.size() +
                '}';
    }
}
