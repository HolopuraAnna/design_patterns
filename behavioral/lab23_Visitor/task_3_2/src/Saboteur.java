public class Saboteur extends Spy {

    @Override
    public void visit(GeneralStaff generalStaff) {

        System.out.println(
                "Saboteur burned all secret documents!"
        );

        generalStaff.setSecretPaper(0);

        int remainingGenerals =
                Math.max(0,
                        generalStaff.getGenerals() - 5);

        generalStaff.setGenerals(remainingGenerals);
    }

    @Override
    public void visit(MilitaryBase militaryBase) {

        System.out.println(
                "Saboteur attacked military base!"
        );

        militaryBase.setSoldiers(
                militaryBase.getSoldiers() / 2
        );

        militaryBase.setOfficers(
                militaryBase.getOfficers() / 2
        );

        militaryBase.setJeeps(
                militaryBase.getJeeps() / 2
        );

        militaryBase.setTanks(
                militaryBase.getTanks() / 2
        );
    }
}
