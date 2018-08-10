package riyadh.sharif;

public class Main {

    public static void main(String[] args) {

        Deciduous deciduous = new Deciduous("Ailanthus");
        deciduous.setIsNative(false);
        deciduous.setType("deciduous");
        deciduous.printDetails();

        Conifer conifer = new Conifer("Balsam fir");
        conifer.setIsNative(true);
        conifer.setType("conifer");
        conifer.printDetails();
    }
}
