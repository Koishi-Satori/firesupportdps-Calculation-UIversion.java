class totalCalculation_ags30 {
    public int[] DefenceBreak(int force, int DefenceBreak, double MissDef, double shotspeed) {
        int[] result = new int[2];
        int i = 1;
        int j = 0;
        double timeTrigger = 6 / shotspeed;
        for (int CurForce = force; CurForce > 0; i += 3) {
            for (int k = 0; k < 3; k++) {
                if (Math.max(0.4, MissDef) >= Math.random()) {
                    CurForce -= DefenceBreak;
                    j++;
                }
                if (Math.floor((double) i % timeTrigger) == 0) {
                    if (0.4 > Math.random()) CurForce -= DefenceBreak * 1.2;
                }
            }
        }
        result[0] = i;
        result[1] = j;
        return result;
    }

    public double AttackDamage_afterBreak(int damage, int DefenceBreak, double MissDef, int Times_onBreak, int amount, double shotspeed) {
        double totalEcptBreak = 0;
        for (int i = 1; i <= 1250; i++) {
            for (int j = 0; j < 4; j++) {
                switch (j) {
                    case 1:
                    case 2:
                    case 3: {
                        if (Math.max(0.4, MissDef) >= Math.random()) totalEcptBreak += damage * amount;
                        break;
                    }
                    case 4: {
                        if (Math.max(0.4, MissDef) >= Math.random()) totalEcptBreak += damage * amount * 2.2;
                        break;
                    }
                }
            }
        }
        totalEcptBreak = totalEcptBreak + (double) (Times_onBreak * damage * amount);
        return totalEcptBreak;
    }
}
