class totalCalculation_bgm71 {
    public int[] DefenceBreak(int force, int DefenceBreak, double MissDef) {
        int[] result = new int[2];
        int i = 1;
        int j = 0;
        for (int CurForce = force; CurForce > 0; i++) {
            if (i % 2 != 0 || i == 1) {
                if (Math.max(0.4, MissDef) >= Math.random()) {
                    CurForce -= 1.6 * DefenceBreak;
                    j++;
                }
            } else {
                if (Math.max(0.4, MissDef) >= Math.random()) {
                    CurForce -= DefenceBreak;
                    j++;
                }
            }
        }
        result[0] = i - 1;
        result[1] = j;
        return result;
    }

    public double AttackDamage_afterBreak(int damage, int DefenceBreak, double MissDef, int amount, int Times_onBreak) {
        double totalEcptBreak = 0;
        for (int i = 1; i <= 5000; i++) {
            if (i % 2 != 0 || i == 1) {
                if (Math.max(0.4, MissDef) >= Math.random())
                    totalEcptBreak = totalEcptBreak + (double) amount * ((double) damage * 1.8 * 1.5 + 0.1 * (double) DefenceBreak);
            } else {
                if (Math.max(0.4, MissDef) >= Math.random())
                    totalEcptBreak = totalEcptBreak + (double) amount * ((double) damage * 1.5 + 0.1 * (double) DefenceBreak);
            }
        }
        totalEcptBreak = totalEcptBreak + (Times_onBreak * amount * damage * 1.6);
        return totalEcptBreak;
    }

}
