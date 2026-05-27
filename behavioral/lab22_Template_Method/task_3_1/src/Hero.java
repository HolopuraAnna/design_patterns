public abstract class Hero {

    /**
     * Стратегія захисту та відступу
     */
    public final void defendAgainstAttack() {
        pickUpWeapon();
        defenseAction();
        moveToSafety();
        System.out.println();
    }

    /**
     * Abstract steps
     */
    protected abstract void pickUpWeapon();

    protected abstract void defenseAction();

    protected abstract void moveToSafety();
}
