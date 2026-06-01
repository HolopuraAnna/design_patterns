public class SecretAgent extends Spy {

    @Override
    public void visit(GeneralStaff generalStaff) {

        System.out.println(
                "Secret Agent stole "
                        + generalStaff.getSecretPaper()
                        + " secret documents"
        );

        generalStaff.setSecretPaper(0);
    }

    @Override
    public void visit(MilitaryBase militaryBase) {

        System.out.println(
                "Secret Agent gathered intelligence:"
        );

        System.out.println(
                "Officers: " + militaryBase.getOfficers()
        );

        System.out.println(
                "Soldiers: " + militaryBase.getSoldiers()
        );

        System.out.println(
                "Jeeps: " + militaryBase.getJeeps()
        );

        System.out.println(
                "Tanks: " + militaryBase.getTanks()
        );
    }
}
