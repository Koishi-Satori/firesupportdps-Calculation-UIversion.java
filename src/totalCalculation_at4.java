class totalCalculation_at4 {
    public int[] DefenceBreak(int force, int DefenceBreak, double MissDef) {
        int[] result = new int[2];
        int i = 1;
        int j = 0;
        for (int CurForce = force; CurForce > 0; i++) {
            if (Math.max(0.4, MissDef) >= Math.random()) {
                CurForce -= DefenceBreak;
                j++;
            }
        }
        result[0] = i - 1;
        result[1] = j;
        return result;
    }

    public double AttackDamage_afterBreak(int damage, int DefenceBreak, double MissDef, int Times_onBreak, int amount, double shotspeed) {
        double totalEcptBreak = 0;
        int timesBurn = 0;
        double timeTrigger = 5 / shotspeed;
        for (int i = 1; i <= 5000; i++) {
            if (Math.max(0.4, MissDef) >= Math.random()) {
                totalEcptBreak = totalEcptBreak + ((damage + DefenceBreak * 0.1) * amount);
            }
            if (Math.floor((double) i % timeTrigger) == 0) timesBurn++;
        }
        totalEcptBreak = totalEcptBreak + (timesBurn * 2 * amount * (damage + 0.1 * DefenceBreak)) + (double) (Times_onBreak * damage * amount);
        return totalEcptBreak;
    }
}
